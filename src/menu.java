import java.util.ArrayList;
import java.util.List;

public class menu {
    String name;
    private final List<FoodItem> menu = new ArrayList<FoodItem>();

    public menu(String name) {
        this.name = name;
    }

    public void addFoodItem(FoodItem foodItem) {
        menu.add(foodItem);
        System.out.println("item added successfully");
    }

    public void removeFoodItem(String foodItem) {
        boolean removed = menu.removeIf(item -> foodItem.equalsIgnoreCase(item.getName()));
        if (removed)
            System.out.println("item removed successfully");
        else
            System.out.println("item not found");
    }
    public void displayMenu(){
        for (FoodItem foodItem : menu) {
            System.out.println(foodItem);
        }
        }
    }
