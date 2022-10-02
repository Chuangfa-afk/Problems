import java.util.LinkedList;
public class Leet21 {
	
    public LinkedList<listNode> mergeTwoLists(listNode l1, listNode l2) {
    	LinkedList<listNode> result = new LinkedList<>();
    	while((l1 != null) && (l2 != null)) {
    		if(l1.val<=l2.val) {
    			result.add(l1);
    			l1 = l1.next;
    		}else {
    			result.add(l2);
    			l2 = l2.next;

    		}
    	}
    	if(l1!=null) {
    		result.add(l1);
    	}else {
    		result.add(l2);
    	}

        
        return result;
	
}
    
    public static void main(String... args) {
    	listNode l1 = new listNode(1);
    	l1.next = new listNode(3);
    	l1.next.next = new listNode(5);
    	
    	listNode l2 = new listNode(2);
    	l2.next = new listNode(4);
    	l2.next.next = new listNode(6);
    	// 1,1,2,3,3,4
    	Leet21 x = new Leet21();
    	
    	LinkedList<listNode> total = x.mergeTwoLists(l1, l2);
    	
    	for(int i=0; i<total.size(); i++) {
    		System.out.println(total.get(i).val);
    	}

    
    }
    
}

class listNode{
	int val = 0;
	listNode next;
	
	
	listNode(){}
	listNode(int val){this.val = val;}
	listNode(int val, listNode next){
		this.val = val;
		this.next = next;
		}
	}

    
    
    
    





