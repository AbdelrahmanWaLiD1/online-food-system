import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
abstract class User {
    private final String name;
    private final String username;
    private String city;
    private String flat_num;
    private String building_num;
    private String StreetAddress;
    private final Date dob;
    private final String email;
    private final String password;
    private String phoneNumber;
    public User(String name, String username, String city, String flat_num, String building_num, String streetAddress, Date dob, String email, String password, String phoneNumber) {
        this.name = name;
        this.username=username;
        this.city = city;
        this.flat_num = flat_num;
        this.building_num = building_num;
        StreetAddress = streetAddress;
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.phoneNumber =phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }
    public String getCity() {
        return city;
    }
    public String getFlat_num() {
        return flat_num;
    }
    public String getBuilding_num() {
        return building_num;
    }
    public String getStreetAddress() {
        return StreetAddress;
    }
    public Date getDob() {
        return dob;
    }
    public String getEmail() {
        return email;
    }
    public String getphoneNumber() {
        return phoneNumber;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setFlat_num(String flat_num) {
        this.flat_num = flat_num;
    }
    public void setBuilding_num(String building_num) {
        this.building_num = building_num;
    }
    public void setStreetAddress(String streetAddress) {
        StreetAddress = streetAddress;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber=phoneNumber;
    }
    @Override
    public abstract String toString();
    public static boolean isValidUsername(String username)
    {
        String regex = "^[A-Za-z]\\w{5,29}$";
        Pattern p = Pattern.compile(regex);
        if (username == null) {
            return false;
        }
        Matcher m = p.matcher(username);
        return m.matches();
    }
    public static boolean isValidBuildingNumber(String building_num)
    {
        if (building_num == null) {
            return false;
        }
        try {
            int i=Integer.parseInt(building_num);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public boolean isValidEmailAndPassword() {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        boolean containsDigit = false;
        boolean containsLowercase = false;
        boolean containsUppercase = false;
        boolean containsSpecialChar = false;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                containsDigit = true;
            } else if (Character.isLowerCase(ch)) {
                containsLowercase = true;
            } else if (Character.isUpperCase(ch)) {
                containsUppercase = true;
            } else {
                containsSpecialChar = true;
            }
            if (containsDigit && containsLowercase && containsUppercase && containsSpecialChar) {
                break;
            }
        }
        return password.length() >= 8 && containsDigit && containsLowercase && containsUppercase && containsSpecialChar && matcher.matches();
    }
    public  boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("^(012|010|011|015)\\d{8}$")) {
            // Check if the phone number is exactly 11 digits
            return phoneNumber.length() == 11;
        }
        return false;
    }
}


