
public class RecipeIngredient extends Ingredient{
	private float quantity;
	
	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
		super(name, measuringUnit, caloriesPerUnit);
		this.quantity = quantity;
	}
	
	public RecipeIngredient(Ingredient ingredient, float quantity) {
		super(ingredient.getName(), ingredient.getmeasuringUnit(), ingredient.getCaloriesPerUnit());
		this.quantity = quantity;
	}
	
	public float getQuantity() {
		return quantity;
	}
	
	public String toString() {
		return super.toString() + "\nQuantity: " + quantity;
	}
	
	public boolean equals(Object o) {
		if(o instanceof RecipeIngredient) {
			return this.getName().equals(((RecipeIngredient) o).getName()) && this.quantity == ((RecipeIngredient)o).quantity;
		}
		else {
			return false;
		}
	}
	

}
