
public class Leet100 {
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		inOrder(p);
		inOrder2(q);
		
		return in.equals(in2)?true:false;
	}
	
	private static String in = "";
	private static void inOrder(TreeNode n) {
		if(n == null)
			return;
		inOrder(n.left);
		in += n.val + " ";
		inOrder(n.right);
		
	}
	private static String in2 = "";
	private static void inOrder2(TreeNode n) {
		if(n == null)
			return;
		inOrder(n.left);
		in += n.val + " ";
		inOrder(n.right);
		
	}
	
	public static void main(String[] args) {
		
		TreeNode tree = new TreeNode(1);
		TreeNode tree2 = new TreeNode(2);
		TreeNode tree3 = new TreeNode(3);
		tree.left = tree2;
		tree.right = tree3;
		
		TreeNode treee = new TreeNode(1);
		TreeNode treee2 = new TreeNode(2);
		TreeNode treee3 = new TreeNode(3);
		tree.left = treee2;
		tree.right = treee3;
		
		System.out.println(isSameTree(tree,treee));
		
	}
	
	
}


class TreeNode {
	int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
 
