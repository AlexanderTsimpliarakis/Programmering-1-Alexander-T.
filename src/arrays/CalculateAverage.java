package arrays;

public class CalculateAverage {

	public static void main(String[] args) {
		
		int numericArray[] = new int[6];
		
		int sum = 0;
		
		numericArray[0] = 5;
		numericArray[1] = 73;
		numericArray[2] = 92;
		numericArray[3] = 89;
		numericArray[4] = 31;
		numericArray[5] = 22;
		
		for(int i = 0; i < numericArray.length; i++) {
			sum += numericArray[i];
		}
		System.out.println((double)sum / numericArray.length);		

	}

}
