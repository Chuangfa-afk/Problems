package Practice;

public class CSE214{
    public static int fibonacci(int k) {
        if (k < 0) throw new IllegalArgumentException("Undefined.");
        if (k == 0)
            return 0;
        if (k == 1)
            return 1;
        int[] computedValues = new int[100];
        computedValues[0] = 0;
        computedValues[1] = 1;
        return fibonacci(k, computedValues);
    }

    private static int fibonacci(int k, int[] computedValues) {
        if (k < 2)
            return computedValues[k];
        if (k > 1 && computedValues[k] > 0)
            return computedValues[k];
        computedValues[k-1] = fibonacci(k-1, computedValues);
        computedValues[k-2] = fibonacci(k-2, computedValues);
        int newValue = computedValues[k-1] + computedValues[k-2];
        computedValues[k] = newValue;
        return newValue;
    }
    
    public static void main(String[] args) {
    	System.out.println(fibonacci(10));
    }
}