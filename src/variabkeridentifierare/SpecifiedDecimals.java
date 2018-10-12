package variabkeridentifierare;

import java.math.*;

public class SpecifiedDecimals {

	public static void main(String[] args) {
		float x = 374.1928264f;
		BigDecimal result;
		int decimal_place = 4;
		BigDecimal bd_num = new BigDecimal (Float.toString(x));
		bd_num = bd_num.setScale(decimal_place, BigDecimal.ROUND_HALF_UP);
		System.out.printf("Original number: %.7f\n", x);
		System.out.println("Rounded upto 4 decimal: "+bd_num);

	}

}
