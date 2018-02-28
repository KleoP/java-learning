public class VariableChangeShortcuts {
	public static void main( String[] args ) {
		int i, j, k;
		
		// 1.
		i = 5;
		j = 5;
		k = 5;
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("1\ti: " + i + "\tj: " + j + "\tk: " + k);
		
		// 2.
		i = i + 3;
		j = j - 3;
		k = k * 3;
		System.out.println("2.\ti: " + i + "\tj: " + j + "\tk: " + k);
		
		// 3.
		i = 5;
		j = 5;
		k = 5;
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("3.\ti: " + i + "\tj: " + j + "\tk: " + k);
		
		// 4.
		i += 3;
		j -= 3;
		k *= 3;
		System.out.println("4.\ti: " + i + "\tj: " + j + "\tk: " + k);
		
		// 5.
		i = j = k = 5;
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("5.\ti: " + i + "\tj: " + j + "\tk: " + k);
		
		// 6.
		i += 1;
		j -= 2;
		k *= 3;
		System.out.println("6.\ti: " + i + "\tj: " + j + "\tk: " + k);
		
		// 7. and 8.
		i = j = 5;
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("7.\ti: " + i + "\tj: " + j );
		i =+ 1;
		j =- 2;
		System.out.println("8.\ti: " + i + "\tj: " + j );
		
		// 9. and 10.
		i = j = 5;
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("9.\ti: " + i + "\tj: " + j );
		i++;
		j--;
		System.out.println("10.\ti: " + i + "\tj: " + j );

		// 11. and 12.
		i = 5;
		i -= 5;
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("11.\ti: " + i );
		i = 5;
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println("12.\ti: " + i );

		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
}