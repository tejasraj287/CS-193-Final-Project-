import java.time.LocalDate;

public class FoodItem {
    private String name;
    private LocalDate expiryDate;
    private int quantity;

    public FoodItem(String name, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }
    public LocalDate getExpiryDate() {
        return this.expiryDate;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;  
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

}