import java.math.BigDecimal;

// used to perform precise floating-point calculations and also for money calculations
public class BigDecimalEx {

	public static void main(String[] args) {
		System.out.println(0.2 + 0.7);
		
		BigDecimal b = new BigDecimal("203.47"); // example of declaring a big decimal
		
		System.out.println(new BigDecimal("0.2").multiply(new BigDecimal ("0.7")));
		System.out.println(b.multiply(new BigDecimal ("4")));
	}

}
