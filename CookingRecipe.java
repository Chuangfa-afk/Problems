import java.util.ArrayList;
public class CookingRecipe{
	private String foodName;
	private ArrayList<RecipeIngredient> list = new ArrayList<RecipeIngredient>();


	public CookingRecipe(String foodName) {
		this.foodName = foodName;
	}
	
	public ArrayList<RecipeIngredient> getList(){
		return list;
	}
	
	public void setName(String name) {
		this.foodName = name;
	}
	public String getName() {
		return foodName;
	}
	
	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
		//if the recipe already includes the ingredient specified by the parameter, 
		//then just update the quantity, otherwise add a new recipe ingredient.
		list.add(new RecipeIngredient(ingredient, quantity));
		}

	
	public void addOrUpdateRecipeIngredient(RecipeIngredient RecipeIngredient) {
		list.add(RecipeIngredient);
	}
	
	public void addListOfRecipeIngredient(ArrayList<RecipeIngredient> r) {
		for(int i=0; i<r.size(); i++) {
			list.add(r.get(i));
		}
	}
	
	public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
		for(RecipeIngredient i: list) {
			if(i.getName().equalsIgnoreCase(ingredient.getName())) {
				return i;
			}
		}
		return null;
		}
	
	public RecipeIngredient getRecipeIngredient(String ingredientName) {
		//returns the RecipeIngredient object corresponding to the ingredient object parameter, 
		//or return null if the ingredient is not part of the recipe.
		for(RecipeIngredient i: list) {
			if(i.getName().equalsIgnoreCase(ingredientName)) {
				return i;
			}
		}
		return null;
		}
	
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
		RecipeIngredient temp;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equalsIgnoreCase(ingredient.getName())) {
				temp = list.get(i);
				list.remove(i);
				return temp;
			}
		}
		return null;
	}
	
	public RecipeIngredient removeRecipeIngredient(String ingredientName) {
		RecipeIngredient temp;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equalsIgnoreCase(ingredientName)) {
				temp = list.get(i);
				list.remove(i);
				return temp;
			}
		}
		return null;
	}
		
	
	public float calculateCalories() {
		//calculates the sum of the calories for all the ingredients in the recipes and their respective quantities.
		float sum = 0;
		for(RecipeIngredient i: list) {
			sum += (i.getCaloriesPerUnit() * i.getQuantity());
		}
		return sum;
	}
		
	
	public int getNumberOfIngredients() {
		//returns the number of ingredients in the recipe.
		return list.size();
	}
	
	public String getIngredients() { 
		String temp = "\n";
		for(int i=0; i<list.size(); i++) {
			temp +=  "\t" + list.get(i).getQuantity() + " " + list.get(i).getmeasuringUnit() + " " + list.get(i).getName() + "\n";
		}
		return temp;
	}
	
	
	
	public String toString() {
		//returns the recipe name and ingredients as a String.
		return "The recipe's name is: " + foodName +
				"\nThe ingredients are: " + getIngredients();
	}
	
	public boolean equals(Object o) {
		if(o instanceof CookingRecipe) {
			return this.foodName.equals(((CookingRecipe) o).getName());
		}
		return false;
	}
	
	
	
}
