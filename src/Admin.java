import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Admin extends User {
    private final List<Restaurant> restaurants = new ArrayList<Restaurant>();
    public Admin(String name, String username, String city, String flat_num, String building_num, String streetAddress, Date dob, String email, String password, String phoneNumber) {
        super(name, username, city, flat_num, building_num, streetAddress, dob, email, password, phoneNumber);
    }
    @Override
    public String toString() {
        return "admin name: "+getName()+" admin user name: "+getUsername()+" admin phone number: "+getphoneNumber();
    }
    public void addReastaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }
    public void removeReastaurant(String restaurantName){
        boolean removed = restaurants.removeIf(Restaurant -> restaurantName.equalsIgnoreCase(Restaurant.getName()));
        if (removed)
            System.out.println("item removed successfully");
        else
            System.out.println("item not found");
    }
    }

