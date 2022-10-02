
public class Ingredient {
	private String name;
	private String measuringUnit;
	private int caloriesPerUnit;
	
	public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
		this.name = name;
		this.measuringUnit = measuringUnit;
		this.caloriesPerUnit = caloriesPerUnit;
	}
	public String getName() {
		return name;
	}
	public String getmeasuringUnit() {
		return measuringUnit;
	}
	public int getCaloriesPerUnit() {
		return caloriesPerUnit;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMeasuringUnit(String measuringUnit) {
		this.measuringUnit = measuringUnit;
	}
	public void setCaloriesPerUnit(int caloriesPerUnit) {
		this.caloriesPerUnit = caloriesPerUnit;
	}
	
	public String toString() {
		return "The name of the ingredient is: " + name +
				"\nMeasuting unit is: " + measuringUnit + 
				"\nCalories per unit: " + caloriesPerUnit;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Ingredient) {
			return this.name.contentEquals(((Ingredient) o).getName());
		}
		else {
			return false;
		}
	}
	
	
}
