
public class Lab9_1 {

	public static void main(String[] args) {
		char[] c1 = {'a', 'B', 'c'};
		MyString1 s1 = new MyString1(c1);
		MyString1 s2 = new MyString1(c1);
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.substring(1, 2).charAt(0));
		System.out.println(s1.toLowerCase().charAt(1));
		System.out.println(s1.equals(s2));
		System.out.println(s1.valueOf(6).charAt(0));
		
		MyString1[] result = s1.split("B");
		
		for(int i=0; i<2;i++) {
			System.out.println(result[i].charAt(0));
		}
	}

}

class MyString1{
	private char[] characters;
	
	public MyString1() {
		this.characters = null;
	}
	public MyString1(char[] chars) {
		this.characters = chars;
	}
	
	public char[] getStr() {
		return this.characters;
	}
	
	public void setStr(char[] newThing) {
		this.characters = newThing;
	}
	
	
	public char charAt(int index) {
		return this.characters[index];
	}
	
	public int length() {
		return this.characters.length;
		
	}
	
	public MyString1 substring(int begin, int end) {
		char[] instant = new char[end-begin];
		int counts = 0;
		for(int i=begin; i<end;i++) {
			instant[counts] = this.charAt(i);
			counts++;
		}
		
		
		return new MyString1(instant);
	}
	
	public MyString1 toLowerCase() {
		char[] instant = new char[this.characters.length];
		
		for(int i=0; i<this.length(); i++) {
			instant[i] = Character.toLowerCase(this.charAt(i));
		}
		return new MyString1(instant);
	}
	
	public boolean equals(MyString1 s) {
		if (this.length() != s.length()) {
			return false;
		}
		for(int i=0; i<this.length(); i++) {
			if(this.charAt(i) != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	public static MyString1 valueOf(int i) {
		int instant = i;
		int length = 0;
		while(instant!=0) {
			instant/= 10;
			length++;
		}
		
		char[] hold = new char[length];
		int count = 0;
		while(i!=0) {
			hold[count] = (char)(i%10+48);
			i/=10;
			count++;
		}
		
		count = 0;
		char[] reverse = new char[hold.length];
		for(int j=reverse.length-1; j>=0; j--) {
			reverse[count] = hold[j];
			count++;
		}
		
		return new MyString1(reverse);
		
		
		
	}
	
	public MyString1[] split(String s) {
		String instant = "";
		for (int i=0; i<this.length(); i++) {
			instant += String.valueOf(this.charAt(i));
		}
		String[] splited = instant.split(s);
		MyString1[] output = new MyString1[splited.length];
		for(int i=0; i<splited.length; i++) {
			char[] hold = new char[splited[i].length()];
			for(int j=0; j<splited[i].length(); j++) {
				hold[j] = splited[i].charAt(j);
			}
			output[i] = new MyString1(hold);
		}
		return output;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
