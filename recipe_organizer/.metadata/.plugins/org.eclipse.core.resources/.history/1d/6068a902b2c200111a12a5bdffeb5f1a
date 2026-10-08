package recipe_organizer;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	private String name;
	private int servings;
	private List<String> instructions;
	
	public Recipe(String name, int servings ) {
		this.name = name;
		this.servings = servings;
		this.instructions = new ArrayList<>();   // start with an empty list
	}
	
	public String getName() {
		return name;
	}
	
	public int getServings() {
		return servings;
	}
	
	public void addInstruction(String instruction) {
		instructions.add(instruction);
	}
	
	public void printRecipe() {
		System.out.println("*** " + name + " ***");
		System.out.println("Servings: " + servings);
		System.out.println("Instructions: \n");
		System.out.println(instructions);
	}
}
