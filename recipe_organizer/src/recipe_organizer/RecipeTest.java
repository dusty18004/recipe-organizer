package recipe_organizer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RecipeTest {

	private static final double DELTA = 0.0001;
	
	@Test
	void ingredientScaleGivesCorrectQuantity() {
		Ingredient flour = new Ingredient("flour", 2.0, "cups");
		
		Ingredient scaled = flour.scale(1.5);
		
		assertEquals(3.0, scaled.getQuantity(), DELTA);
	}
	
	@Test
	void ingredientScaleLeavesOriginalUnchanged() {
		Ingredient flour = new Ingredient("flour", 2.0, "cups");

		flour.scale(1.5);

		assertEquals(2.0, flour.getQuantity(), DELTA);
	}

	@Test
	void scaleToDoublesIngredientsAndSetsServings() {
		Recipe cookies = new Recipe("cookies", 4);
		cookies.addIngredient(new Ingredient("flour", 2.0, "cups"));

		Recipe doubled = cookies.scaleTo(8);

		assertEquals(8, doubled.getServings());
		assertEquals(4.0, doubled.getIngredients().get(0).getQuantity(), DELTA);
	}

	@Test
	void scaleToHandlesUnevenRatio() {
		Recipe cookies = new Recipe("cookies", 4);
		cookies.addIngredient(new Ingredient("flour", 2.0, "cups"));

		Recipe scaled = cookies.scaleTo(6);

		// 6 / 4 should be 1.5, not 1 (integer division bug)
		assertEquals(3.0, scaled.getIngredients().get(0).getQuantity(), DELTA);
	}

	@Test
	void scaleToLeavesOriginalRecipeUnchanged() {
		Recipe cookies = new Recipe("cookies", 4);
		cookies.addIngredient(new Ingredient("flour", 2.0, "cups"));

		cookies.scaleTo(8);

		assertEquals(4, cookies.getServings());
		assertEquals(2.0, cookies.getIngredients().get(0).getQuantity(), DELTA);
	}

}
