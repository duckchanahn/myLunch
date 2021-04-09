package dto;

public class restaurant {

    private int id;
    private String restaurant_address;
    private String restaurant_name;
    private String restaurant_condition;
    private String restaurant_zipcode;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getRestaurant_address() {return restaurant_address;}
    public void setRestaurant_address(String restaurant_address) {this.restaurant_address = restaurant_address;}

    public String getRestaurant_name() {return restaurant_name;}
    public void setRestaurant_name(String restaurant_name) {this.restaurant_name = restaurant_name;}

    public String getRestaurant_condition() {return restaurant_condition;}
    public void setRestaurant_condition(String restaurant_condition) {this.restaurant_condition = restaurant_condition;}

    public String getRestaurant_zipcode() {return restaurant_zipcode;}
    public void setRestaurant_zipcode(String restaurant_zipcode) {this.restaurant_zipcode = restaurant_zipcode;}

    @Override
    public String toString() {
        return "restaurant{" +
                "id='" + id + '\'' +
                ", address='" + restaurant_address + '\'' +
                ", restaurantName='" + restaurant_name + '\'' +
                ", restaurantCondition='" + restaurant_condition + '\'' +
                '}';
    }
}
