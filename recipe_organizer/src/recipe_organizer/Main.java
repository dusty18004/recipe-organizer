package recipe_organizer;

public class Main {

	public static void main(String[] args) {
		
		Recipe cookies = new Recipe("cookies", 12);
		
		cookies.addIngredient(new Ingredient("flour", 2.5, "cups"));
		cookies.addIngredient(new Ingredient("sugar", 1.0, "cups"));
		
		cookies.addInstruction("Preheat oven to 350 degrees F.");
		cookies.addInstruction("Mix together all dry ingredients.");
		
		cookies.printRecipe();
	}

}
