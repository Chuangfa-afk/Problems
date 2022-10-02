package Practice;

class romanToInt {
    public static int romanToInt(String s) {
        int sum = 0;
        for(int i=0; i<s.length()-1; i++){
            switch(s.charAt(i)){
                case 'I': sum+=1; break;
                case 'V': sum+=5; break;
                case 'X': sum+=10; break;
                case 'L': sum+= 50; break;
                case 'C': sum+= 100; break;
                case 'D': sum+= 500; break;
                case 'M': sum+= 1000; break;
            }
            if(s.charAt(i) == 'I' && (s.charAt(i+1) =='V' || s.charAt(i+1) == 'X') )
                sum-=2;
            else if(s.charAt(i) == 'X' && (s.charAt(i+1) =='L' || s.charAt(i+1) == 'C') )
                sum-=20;
            else if(s.charAt(i) == 'C' && (s.charAt(i+1) =='D' || s.charAt(i+1) == 'M') )
                sum-=200;
        }
        switch(s.charAt(s.length()-1)){
                case 'I': sum+=1; break;
                case 'V': sum+=5; break;
                case 'X': sum+=10; break;
                case 'L': sum+= 50; break;
                case 'C': sum+= 100; break;
                case 'D': sum+= 500; break;
                case 'M': sum+= 1000; break;
            }
        return sum;
    }
    
    public static void main(String[] args) {
    	System.out.println(romanToInt("MCMXCIV"));
    }
}