import java.time.LocalDate;
import java.util.ArrayList;

void main() {
    String choice = "";
    var inventory = new ArrayList<FoodItem>();


    while (!choice.equals("6")) {
        IO.println("My Fridge Tracker");
        IO.println("1. Add a Food Item");
        IO.println("2. View Inventory");
        IO.println("3. Edit Food Item");
        IO.println("4. Remove Food Item");
        IO.println("5. Check Expiry");
        IO.println("6. Exit");
        IO.println("Enter your choice:");
        choice = IO.readln();

        switch (choice) {
            case "1" -> {
                String name = IO.readln("Enter the name of food item: ");
                LocalDate expiryDate = LocalDate.parse(IO.readln("Enter the expiry date (YYYY-MM-DD): "));
                int quantity = Integer.parseInt(IO.readln("Enter the quantity: "));
                FoodItem foodItem = new FoodItem(name, expiryDate, quantity);
                inventory.add(foodItem);
                IO.println(name + " added to inventory.");
            }
            case "2" -> {
                if (inventory.isEmpty()) {
                    IO.println("Inventory is empty.");
                } else {
                    for (int i = 0; i < inventory.size(); i++) {
                        FoodItem item = inventory.get(i);
                        IO.println((i + 1) + ". Name: " + item.getName() + ", Expiry Date: " + item.getExpiryDate() + ", Quantity: " + item.getQuantity());
                    }
                }
            }
            case "3" -> {
                if (inventory.isEmpty()) {
                    IO.println("Inventory is empty.");
                } else {
                    for (int i = 0; i < inventory.size(); i++) {
                        FoodItem item = inventory.get(i);
                        IO.println((i + 1) + ". Name: " + item.getName() + ", Expiry Date: " + item.getExpiryDate() + ", Quantity: " + item.getQuantity());
                    }
                    try {
                        int number = Integer.parseInt(IO.readln("Enter which food item's number you want to edit: "));
                        int index = number - 1;

                        if (index >= 0 && index < inventory.size()) {
                            FoodItem newItem = inventory.get(index);
                            String newName = IO.readln("Enter new name: ");
                            LocalDate newExpiry = LocalDate.parse(IO.readln("Enter new expiry date: "));
                            int newQuantity = Integer.parseInt(IO.readln("Enter new quantity: "));
                            newItem.setName(newName);
                            newItem.setExpiryDate(newExpiry);
                            newItem.setQuantity(newQuantity);
                            IO.println("Food item was updated.");
                        } else {
                            IO.println("Invalid item number.");
                        }
                    } catch (NumberFormatException e) {
                        IO.println("Please enter a valid number.");
                    }
                }
            }
            case "4" -> {
                if (inventory.isEmpty()) {
                    IO.println("Inventory is empty.");
                } else {
                    for (int i = 0; i < inventory.size(); i++) {
                        FoodItem item = inventory.get(i);
                        IO.println((i + 1) + ". Name: " + item.getName() + ", Expiry Date: " + item.getExpiryDate() + ", Quantity: " + item.getQuantity());
                    }
                    try {
                        int number = Integer.parseInt(IO.readln("Enter which food item's number you want to remove: "));
                        int index = number - 1;

                        if (index >= 0 && index < inventory.size()) {
                            inventory.remove(index);
                            IO.println("Food item was removed.");
                        } else {
                            IO.println("Invalid item number.");
                        }
                    } catch (NumberFormatException e) {
                        IO.println("Please enter a valid number.");
                    }
                }
            }
            case "5" -> {
                IO.println("Checking expiry");
            }
            case "6" -> {
                IO.println("Exiting program");
            }
            default -> {
                IO.println("Invalid choice. Pick a number between 1 and 6.");
            }
        }
        IO.println();
    }
}
