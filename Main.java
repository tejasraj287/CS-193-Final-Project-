import java.time.LocalDate;

void main() {
    String choice = "";

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
                IO.println("Adding food item");
            }
            case "2" -> {
                IO.println("Viewing inventory");
            }
            case "3" -> {
                IO.println("Editing food item");
            }
            case "4" -> {
                IO.println("Removing food item");
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
