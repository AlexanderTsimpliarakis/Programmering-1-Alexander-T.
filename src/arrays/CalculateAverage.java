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
		
		//i är antal arrays som finns
		for(int i = 0; i < numericArray.length; i++) {
			// sum får summan i varje array
			sum += numericArray[i];
		}
		//Här delas sum på antal arrays som finns, vilket ger oss medelvärdet
		System.out.println((double)sum / numericArray.length);		

	}

}
