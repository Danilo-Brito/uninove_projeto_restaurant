package projeto.app.restaurantapp;

public class Food {

    private String food_name, food_description, food_price;
    private int food_img;

    public Food() {
    }

    public Food(String food_name, String food_description, String food_price, int food_img) {
        this.food_name = food_name;
        this.food_description = food_description;
        this.food_price = food_price;
        this.food_img = food_img;
    }

    //Getter
    public String getFood_name() {
        return food_name;
    }

    public String getFood_description() {
        return food_description;
    }

    public String getFood_price() {
        return food_price;
    }

    public int getFood_img() {
        return food_img;
    }

    //Setter

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public void setFood_description(String food_description) {
        this.food_description = food_description;
    }

    public void setFood_price(String food_price) {
        this.food_price = food_price;
    }

    public void setFood_img(int food_img) {
        this.food_img = food_img;
    }
}
