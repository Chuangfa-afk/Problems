import java.util.ArrayList;
public class RecipeBook {
	private String bookName;
	private ArrayList<CookingRecipe> menu = new ArrayList<CookingRecipe>();

	public RecipeBook(String bookName) {
		this.bookName = bookName;
	}
	public ArrayList<CookingRecipe> getMenu(){
		return menu;
	}
	public String getName() {
		return this.bookName;
	}
	
	public CookingRecipe addRecipe(String name, RecipeIngredient[] arrayList) {
		//adds to the book and returns a new cooking recipe with the given parameters. 
		//If recipe book already contains a recipe with the same name, do not create a new one and return null.
		CookingRecipe temp = new CookingRecipe(name);
		for(int i=0; i<arrayList.length; i++) {
			temp.addOrUpdateRecipeIngredient(arrayList[i]);
		}
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getName().equalsIgnoreCase(name)) {
				return null;
			}
		}
		menu.add(temp);
		return temp;
	}
	
	public CookingRecipe addRecipe(String name, CookingRecipe cookingRecipe) {
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getName().equalsIgnoreCase(name)) {
				return null;
			}
		}
		menu.add(cookingRecipe);
		return cookingRecipe;
	}
	
	public CookingRecipe removeRecipe(String name) {
		//removes the cooking recipe from the coocking book and returns it. 
		//If recipe book does not contain a recipe with the specified name, then return null.
		CookingRecipe temp;
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getName().equals(name)) {
				temp = menu.get(i);
				menu.remove(i);
				return temp;
			}
		}
		return null;
	}
	
	public ArrayList<CookingRecipe> findRecipes(RecipeIngredient[] ingredients) {
		//returns all cooking recipes from the cooking book that contain all the ingredients passed as parameters. 
		//If recipe book does not contain any recipe with the specified ingredients, then return null.
		ArrayList<CookingRecipe> temp = new ArrayList<CookingRecipe>();
		int counts = 0;
		for(int i=0; i<menu.size(); i++) {
			for(int m=0; m<menu.get(i).getNumberOfIngredients(); m++) {
				for(int j=0; j<ingredients.length; j++) {
					if(ingredients[j].getName().equals( menu.get(i).getList().get(m).getName())) {
						counts++;
					}
				}
			}
			if(counts == menu.get(i).getNumberOfIngredients()) {
				temp.add(menu.get(i));
			}
		}
		if(!temp.isEmpty()) {
			return temp;
		}
		else
			return null;
	}
	
	public ArrayList<CookingRecipe> findRecipesWithFewIngredients(int numberOfIngredients) {
		//returns all cooking recipes from the cooking book that contain less than or equal the number of ingredients passed as parameter. 
		//If recipe book does not contain any recipe with the specified number of ingredients, then return null.
		ArrayList<CookingRecipe> temp = new ArrayList<CookingRecipe>();
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getList().size() < numberOfIngredients) {
				temp.add(menu.get(i));
			}
		}
		if(!temp.isEmpty()) {
			return temp;
		}
		else
			return null;
	}
	
	public ArrayList<CookingRecipe> findRecipesLowCalories() {
		//returns all cooking recipes from the cooking book that have the lowest number of calories. Note: this can be multiple recipies.
		ArrayList<CookingRecipe> temp = new ArrayList<CookingRecipe>();
		CookingRecipe temp2 = menu.get(0);
		for(int i=1; i<menu.size(); i++) {
			if(menu.get(i).calculateCalories() > temp2.calculateCalories()) {
				temp2 = menu.get(i);
			}
		}
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).calculateCalories() == temp2.calculateCalories()) {
				temp.add(menu.get(i));
			}
		}
		if(!temp.isEmpty()) {
			return temp;
		}
		else
			return null;
	}
	public String getRecipeIngredients() {
		String temp = "\n";
		for(int i=0; i<menu.size(); i++) {
			temp += "\t" + menu.get(i).getName() + "\n";
		}
		return temp;
	}
	
	
	public String toString() {
		return "The Recipe book's name is: " + bookName + 
				"\nContains " + menu.size() + " Cooking Recipe:" + 
				getRecipeIngredients();
	}
	
	public boolean equals(Object o) {
		if(o instanceof RecipeBook) {
			return this.bookName.equals(((RecipeBook) o).getName());
		}
		return false;
	}
	
}
