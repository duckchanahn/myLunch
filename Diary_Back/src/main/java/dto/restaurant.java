package dto;

public class restaurant {

    private int id;
    private String address;
    private String restaurantName;
    private String restaurantCondition;


    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public String getRestaurantName() {return restaurantName;}
    public void setRestaurantName(String restaurantName) {this.restaurantName = restaurantName;}

    public String getRestaurantCondition() {return restaurantCondition;}
    public void setRestaurantCondition(String restaurantCondition) {this.restaurantCondition = restaurantCondition;}

    @Override
    public String toString() {
        return "restaurant{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", restaurantName='" + restaurantName + '\'' +
                ", restaurantCondition='" + restaurantCondition + '\'' +
                '}';
    }
}
