package wuhinProject;

public class UnsortedDate212List extends Date212List{

	public UnsortedDate212List() {}
	
	public void add(String w) {
		super.add(w);
		Date212Node temp = new Date212Node(new Date212(w));
		
		if(head == null) {
			head = temp;
			tail = temp;
		}
		tail.next = temp;
		tail = temp;
	}
	
	
	
}
