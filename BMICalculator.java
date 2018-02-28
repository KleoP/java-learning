import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		
		Scanner myReader = new Scanner(System.in);
		int inches, pounds;
		double m, kg, bmi;
		
		System.out.print( "What is your height in inches?" );
		inches = myReader.nextInt();
		
		m = (inches * 2.54) / 100;
		System.out.println(m);
		
		System.out.print( "What is your weight in pounds?" );
		pounds = myReader.nextInt();
		
		kg = pounds / 2.2046226218;
		System.out.println(kg);
		
		bmi = kg / (m*m);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println( "Your BMI is " + bmi );
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
}