package wuhinProject;

public class SortedDate212List extends Date212List{

	public SortedDate212List() {}
	
	public void add(String w) {
		super.add(w);
		Date212Node temp = new Date212Node(new Date212(w));
		if(head == null) {
			head = temp;
			tail = temp;
			return;
		}
		if(temp.data.compareTo(head.data)<0) {
			temp.next = head;
			head = temp;
			return;
		}
		
		Date212Node current = head;
		for(int i=0; i<length; i++) {
			if(current.next == null) {
				tail.next = temp;
				tail = temp;
				return;
			}
			if(temp.data.compareTo(current.next.data)<0)
				break;
			current = current.next;
		}
		temp.next = current.next;
		current.next = temp;
	
	}
}
