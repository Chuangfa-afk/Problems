public class Lab5_2 {

    public static int baseX2decimal(int base, String s) {
    	int dec = 0;
    	for (int i = 0; i< s.length(); i++)
    		dec = dec*base + ConvertBaseXDigit2Dec(base, s.charAt(i));
    	return dec;
    }
    
    public static int ConvertBaseXDigit2Dec(int base, char c) {
    	if ('0'<=c && c<='9')
    		return c-'0';
    	if ('A'<=c && c<='Z')
    		return c - 'A' + 10;
    	if ('a'<=c && c<='z')
    		return 0;
    	return 0;
    }

    public static String decimal2BaseX(int base, int dec){ 
    	String s = "";
    	while (dec != 0) {
    		s = convertDecDigit2BaseX(base, (dec%base)) + s;
    		dec /= base;
    	}
    	return s;
    }
    
    public static String convertDecDigit2BaseX(int base, int d) {
    	if (0<=d && d<=9)
    		return "" + d;
    	return "" + ((char)(d - 10 + 'A'));
    }

    public static int hexadecimal2decimal(String hex){ 
    	return baseX2decimal(16, hex);
    }

    public static String decimal2binary(int n){ 
    	return decimal2BaseX(2, n);
    }

    public static String decimal2hex(int n){ 
    	return decimal2BaseX(16, n);
    }

    public static int binary2decimal(String b){ 
    	return baseX2decimal(2, b);
    }

    public static void main(String[] args) {

         System.out.println(hexadecimal2decimal("A1")); // 161

         System.out.println(decimal2binary(10)); // 1010

         System.out.println(decimal2hex(161)); // A1

         System.out.println(binary2decimal("1010")); // 10

    }

}