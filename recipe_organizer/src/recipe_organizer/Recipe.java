package recipe_organizer;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	private String name;
	private int servings;
	private List<Ingredient> ingredients;
	private List<String> instructions;
	
	public Recipe(String name, int servings ) {
		this.name = name;
		this.servings = servings;
		this.ingredients = new ArrayList<>();
		this.instructions = new ArrayList<>();   // start with an empty list
	}
	
	public String getName() {
		return name;
	}
	
	public int getServings() {
		return servings;
	}
	
	public void addIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
	}
	
	public void addInstruction(String instruction) {
		instructions.add(instruction);
	}
	
	public void printRecipe() {
		System.out.println("*** " + name + " ***");
	    System.out.println("Servings: " + servings);

	    System.out.println("\nIngredients:");
	    for (Ingredient ingredient : ingredients) {
	        System.out.println("- " + ingredient);
	    }

	    System.out.println("\nInstructions:");
	    for (int i = 0; i < instructions.size(); i++) {
	        System.out.println((i + 1) + ". " + instructions.get(i));
	    }
	}
}
