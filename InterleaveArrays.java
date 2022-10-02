
public class InterleaveArrays {

	public static void main(String[] args) {
		int[] a, b ,c, d, e, f; 
		a =  interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6});
//		returns [1, 2, 3, 4, 5, 6]

		b = interleaveArrays(new int[]{10,20,30,40,50,60,70,80}, new int[]{2,4,6,8});
//		returns [10, 2, 20, 4, 30, 6, 40, 8, 50, 60, 70, 80]

		c = interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6,8,10});
//		returns [1, 2, 3, 4, 5, 6, 8, 10]
		
		d = interleaveArrays(new int[]{5,2,94,12,4}, new int[]{2,4,3});
		
		e = interleaveArrays(new int[]{100,98,96,94,92,90}, new int[]{99,97,95,93,91,89});
		
		f = interleaveArrays(new int[]{10,11,12,13,14}, new int[]{20,21,22,23,24,100,145,520});
		
		print(a);
		print(b);
		print(c);
		print(d);
		print(e);
		print(f);
	}


	
	public static int[] interleaveArrays(int[] array1, int[] array2) {
		int[] output = new int[array1.length + array2.length];
		int dif;
		if (array1.length > array2.length) {
			dif = array1.length - (array1.length - array2.length);
			for(int i=0, j=0; i<dif; i++, j+=2) {
				output[j] = array1[i];
				output[j+1] = array2[i];
			}
			for(int i=dif, j=dif*2; j<output.length; i++, j++) {
				output[j] = array1[i];
			}
		}
			
		else if (array1.length < array2.length) {
			dif = array2.length - (array2.length - array1.length);
			for(int i=0, j=0; i<dif; i++, j+=2) {
				output[j] = array1[i];
				output[j+1] = array2[i];
			}
			for(int i=dif, j=dif*2; j<output.length; i++, j++) 
				output[j] = array2[i];
		}
			
		else
			for(int i=0, j=0; i<array1.length; i++, j+=2) {
				output[j] = array1[i];
				output[j+1] = array2[i];
			}
		
		return output;
	}
	
	
	public static void print(int[] array) {
		for(int value: array)
			System.out.print( value + " ");
		System.out.println();
	}
	
}


