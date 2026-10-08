package recipe_organizer;


public class Ingredient {
    private String name;
    private double quantity;
    private String unit;  // gram, cups, etc.

    public Ingredient(String name, double quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return  unit;
    }

    @Override
    public String toString() {
        return quantity + " " + unit + " " + name;
    }
    
    public Ingredient scale(double factor) {
    	double newQuantity = quantity * factor;
    	return new Ingredient(name, newQuantity, unit);
    }
}