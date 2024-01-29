import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {
    private String name;
    private String city;
    private String building_num;
    private String StreetAddress;
    private  List<Menu> menus = new ArrayList<Menu>();

    public Restaurant(String name, String city, String building_num, String streetAddress) {
        name = name;
        this.city = city;
        this.building_num = building_num;
        StreetAddress = streetAddress;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getBuilding_num() {
        return building_num;
    }

    public String getStreetAddress() {
        return StreetAddress;
    }

    public void setName(String name) {
        name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBuilding_num(String building_num) {
        this.building_num = building_num;
    }

    public void setStreetAddress(String streetAddress) {
        StreetAddress = streetAddress;
    }
    public void addMenu(Menu menu){
        menus.add(menu);
    }
    public void updateMenus(String menuName) {
        System.out.println("which menu you want to update");
        for (Menu menu : menus) {
            menu.displayMenu();
        }
        System.out.println("which menu do you want update?");
        for (Menu menu : menus) {
            if (name.equalsIgnoreCase(menuName)) {
                System.out.println("what is the type of your update\npress (D) to delete the menu\n or (A) to add another item\n or (R) to remove the Item\n or (I) to update Item details\n or (Any key to exit) to exit from menu updating");
                String c;
                Scanner s = new Scanner(System.in);
                c = s.next();
                if (c.equalsIgnoreCase("d")) {
                    menus.remove(menu);
                } else if (c.equalsIgnoreCase("a")) {
                    System.out.println("enter the item details");
                    //string name, String description, double price, int quantity
                    String itemName = s.next();
                    String itemDescription = s.nextLine();
                    double itemPrice = Double.parseDouble(s.next());
                    int itemQuantity = Integer.parseInt(s.next());
                    menu.addFoodItem(new FoodItem(itemName, itemDescription, itemPrice, itemQuantity));
                } else if (c.equalsIgnoreCase("R")) {
                    System.out.println("which item do you want to remove ");
                    String foodName = s.next();
                    menu.removeFoodItem(foodName);
                } else if (c.equalsIgnoreCase("i")) {
                    menu.EditFoodItem();
                }
            } else {
                System.out.println("menu not found !");
            }
        }

    }
}