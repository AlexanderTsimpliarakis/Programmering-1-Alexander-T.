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
		
		//i �r antal arrays som finns
		for(int i = 0; i < numericArray.length; i++) {
			// sum f�r summan i varje array
			sum += numericArray[i];
		}
		//H�r delas sum p� antal arrays som finns, vilket ger oss medelv�rdet
		System.out.println((double)sum / numericArray.length);		

	}

}
