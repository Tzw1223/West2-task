package zhaji;

public class SetMeal {
    protected String name;
    protected double price;
    protected String friedChicken;
    protected Drinks drinks;

    public SetMeal() {
    }

    public SetMeal(String name, double price, String friedChicken, Drinks drinks) {
        this.name = name;
        this.price = price;
        this.friedChicken = friedChicken;
        this.drinks = drinks;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getFriedChicken() {
        return friedChicken;
    }
    public void setFriedChicken(String friedChicken) {
        this.friedChicken = friedChicken;
    }
    public Drinks getDrinks() {
        return drinks;
    }
    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "SetMeal{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", friedChicken='" + friedChicken + '\'' +
                ", drinks=" + drinks +
                '}';
    }
}
