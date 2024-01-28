public class FoodItem {
    private String name;
    private String description;
    private double price;
    private int quantity=0;
    private boolean availibilty=false;
    public FoodItem(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        if(quantity>0)
            availibilty=true;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public boolean isAvailibilty() {
        return availibilty;
    }
    public void setAvailibilty(boolean availibilty) {
        this.availibilty = availibilty;
    }
    @Override
    public String toString() {
        if (!availibilty) {
            return "item: " + name + "description:\n" + description + "price per quantity: " + price + "quantity: " + quantity;
        } else {
            return "item: " + name + " is not available";
        }
    }
}
