import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class test<T> {
	String[] stringArray = new String[] { "A", "B", "C", "D" };
	List stringList = Arrays.asList(stringArray);
	
	public static void main(String[] args) {
		test list = new test();
		list.stringList.add("G");
	}
}
