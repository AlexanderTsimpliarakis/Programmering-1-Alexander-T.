package arrays;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		int[] intArray = new int[15];
		
		System.out.println(intArray[0]);
		intArray[0] = 466;
		intArray[1] = 763;
		intArray[2] = 5555;
		intArray[3] = 372;
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		
		int[] intArray2 = { 466, 763, 5555, 372 };
		System.out.println(intArray2[0]);
		System.out.println(intArray2[1]);		
		
		System.out.println("length; "+intArray2.length);
		
		//ArrayList
		ArrayList arraylist = new ArrayList();
		arrayList.add(6666);
		arrayList.add(9999);
		arrayList.add(6666);
		arrayList.add(9999);
		arrayList.add(6666);
		arrayList.add(9999);
		arrayList.add(6666);
		arrayList.add(9999);
		arrayList.add(6666);
		arrayList.add(9999);
		arrayList.add(6666);
		arrayList.add(9999);
		arrayList.add(6666);
		arrayList.add(9999);
		arrayList.add(6666);
		arrayList.add(9999);
		arrayList.add(6666);
		arrayList.add(9999);
		System.out.println("Size" + arrayList.size());
		System.out.println("Get" + arrayList.get(0));
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("loop ArrayList(Index: " + i + ", Value"+ arrayList.get(i) + ")");
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("loop Array(Index: " + i + ", Value"+ intArray[i] + ")");
		}

		
		
	}

}
