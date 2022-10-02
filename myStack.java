
public class myStack {
	private java.util.ArrayList list = new java.util.ArrayList();
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public int getSize() {
		return list.size();
	}
	public Object peek() {
		return list.get(getSize() - 1);
	}
	public Object pop() {
		Object o = list.get(getSize());
		list.remove(getSize() - 1);
		return o;
	}
	public void push(Object o) {
		list.add(o);
	}
	public int search(Object o) {
		return list.lastIndexOf(o);
	}
	public String toString() {
		return "stack: " + list.toString();
	}
	
	public static void main(String[] args) {
		myStack i = new myStack();
		
		
		i.push("Sto");
		i.push("1");
		i.push("2");
		i.push("3");
		i.pop
		();
		System.out.println(i);
//		System.out.println(i.search("Sto"));
//		System.out.println(i.pop());
		
		
		
	}
}
