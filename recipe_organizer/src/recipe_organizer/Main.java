package recipe_organizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recipe cookies = new Recipe("cookies", 12);
		cookies.addInstruction("\n1. Preheat oven to 350 degrees F.");
		cookies.addInstruction("\n2. Mix together all dry ingredients.");
		cookies.addInstruction("\n3. Mix together all wet ingredients.");
		cookies.addInstruction("\n4. Mix together all ingredients");
		cookies.addInstruction("\n5. Form dough into small balls.");
		cookies.addInstruction("\n6. Bake cookies for 8 minutes. \n");
		
		cookies.printRecipe();
	}

}
