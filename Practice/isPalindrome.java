package Practice;

public class isPalindrome implements Cloneable{
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(2135));
	}
	
    public static boolean isPalindrome(int x){
        int m = -1;
        if(x<0)
            return false;
        StringBuilder original = new StringBuilder();
        original.append(String.valueOf(x));
        StringBuilder temp = new StringBuilder();
        for(int i=0; i<original.length(); i++) {
        	temp.append(original.charAt(i));
        	}
        StringBuilder reversed = temp.reverse();
        System.out.println(original);
        System.out.println(reversed);
        if(original.toString().equals(reversed.toString()))
            m = 1;
            

        return (m==1);
    }
}
