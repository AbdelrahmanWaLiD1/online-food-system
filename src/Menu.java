import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    String name;
    private List<FoodItem> menu = new ArrayList<FoodItem>();

    public Menu(String name) {
        this.name = name;
    }

    public void addFoodItem(FoodItem foodItem) {
        menu.add(foodItem);
        System.out.println("item added successfully");
    }
    public void EditFoodItem() {
        Scanner s = new Scanner(System.in);
        System.out.println("which item you want to edit");
        String foodName = s.next();
        for (FoodItem foodItem : menu) {
            if (foodItem.getName().equalsIgnoreCase(foodName)) {
                System.out.println("do you want edit its quantity(Q) or price(P)?");
                String option = s.next();
                if (option.equalsIgnoreCase("q")) {
                    int newQuantity = Integer.parseInt(s.next());
                    foodItem.setQuantity(newQuantity);
                } else if (option.equalsIgnoreCase("p")) {
                    double newPrice=Double.parseDouble(s.next());
                    foodItem.setPrice(newPrice);
                }
            }else{
                System.out.println("item not found");
            }
        }
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
