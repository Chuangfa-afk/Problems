public class testRecipe {

	public static void main(String[] args) {
		// Input all the ingredients needed
		Ingredient i1 = new Ingredient("reduced-fat sour cream", "cups", 100);
		Ingredient i2 = new Ingredient("shredded reduced-fat cheddar cheese", "cups", 117);
		Ingredient i3 = new Ingredient("turkey bacon strips", "g", 4);
		Ingredient i4 = new Ingredient("Louisiana-style hot sauce", "g", 0);
		Ingredient i5 = new Ingredient("Hot cooked waffle-cut fries", "cup", 160);
		Ingredient i6 = new Ingredient("minced fresh chives", "tablespoon", 1);
		Ingredient i7 = new Ingredient("tortillas (8 inches)", "pieces", 237);
		Ingredient i8 = new Ingredient("shredded Mexican cheese blend", "cups", 365);
		Ingredient i9 = new Ingredient("Salsa", "cups", 36);
		Ingredient i10 = new Ingredient("Chicken", "pounds", 100);
		
		RecipeIngredient[] r1 = {new RecipeIngredient(i1, 20), new RecipeIngredient(i2, 2)};

		// Cooking Recipe #1
		CookingRecipe f1 = new CookingRecipe("Loaded Baked Potato Dip");
		f1.addOrUpdateRecipeIngredient(i1, 2);
		f1.addOrUpdateRecipeIngredient(i2, 2);
		f1.addOrUpdateRecipeIngredient(i3, 37);
		f1.addOrUpdateRecipeIngredient(i4, 4662);
		f1.addOrUpdateRecipeIngredient(i5, 1);
		f1.addOrUpdateRecipeIngredient(i6, 1);
		
		CookingRecipe f2 = new CookingRecipe("Cheesy Quesadillas");
		f2.addOrUpdateRecipeIngredient(i7, 4);
		f2.addOrUpdateRecipeIngredient(i8, 1);
		f2.addOrUpdateRecipeIngredient(i9, 2);
		
		CookingRecipe f3 = new CookingRecipe("chicken");
		f3.addOrUpdateRecipeIngredient(i7, 4);
		f3.addOrUpdateRecipeIngredient(i8, 1);
		f3.addOrUpdateRecipeIngredient(i9, 2);
		f3.addOrUpdateRecipeIngredient(i10, 1);
		f3.addOrUpdateRecipeIngredient(i1, 4);
		
		
		
		// Create a Recipe book that contains all the Cooking recipe
		RecipeBook recipeBook1 = new RecipeBook("Taste Of Home");
		recipeBook1.addRecipe(f1.getName(), f1);
		recipeBook1.addRecipe(f2.getName(), f2);
		recipeBook1.addRecipe(f3.getName(), f3);
		System.out.println(recipeBook1);
		System.out.println(recipeBook1.getMenu());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		// Professor Fodor testing program
		RecipeBook julia = new RecipeBook("The art of cooking");
		julia.addRecipe("Cake", new RecipeIngredient[] {
				new RecipeIngredient(new Ingredient("flour", "cups", 100), 2),
				new RecipeIngredient(new Ingredient("sugar", "cups", 100), 2)});
		julia.addRecipe("Salad", new RecipeIngredient[] {
				new RecipeIngredient(new Ingredient("letuce", "cups", 10), 2),
				new RecipeIngredient(new Ingredient("tomatoes", "cups", 10), 2)});
		System.out.print("\n" + julia);
		System.out.println(julia.getMenu());
		System.out.println("The lowest calories recipe in this book is:\n " + julia.findRecipesLowCalories());
		}
		
		
		
		


}
