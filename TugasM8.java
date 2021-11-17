import java.util.Arrays;
import java.util.Scanner;

public class TugasM8 {

	public static void main(String[] args) {
		int dimension, length1, length2, length3;
		int[] array1d;
		int[][] array2d;
		int[][][] array3d;
		String result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dimension (1-3): ");
		dimension = input.nextInt();
		
		switch (dimension) {
			case 1:
				System.out.print("Length: ");
				length1 = input.nextInt();
				
				array1d = new int[length1];
				
				for (int i = 0; i < length1; i++) {
					System.out.printf("Index [%o]: ", i);
					array1d[i] = input.nextInt();
				}
				
				result = Arrays.toString(array1d);
				System.out.printf("Result = %s", result);
				break;
			case 2:
				System.out.print("Length 1: ");
				length1 = input.nextInt();
				
				System.out.print("Length 2: ");
				length2 = input.nextInt();
				
				array2d = new int[length1][length2];
				
				for (int i = 0; i < length1; i++) {
					for (int j = 0; j < length2; j++) {
						System.out.printf("Index [%o][%o]: ", i, j);
						array2d[i][j] = input.nextInt();
					}
				}
				
				result = Arrays.deepToString(array2d);
				System.out.printf("Result = %s", result);
				break;
			case 3:
				System.out.print("Length 1: ");
				length1 = input.nextInt();
				
				System.out.print("Length 2: ");
				length2 = input.nextInt();
				
				System.out.print("Length 3: ");
				length3 = input.nextInt();
				
				array3d = new int[length1][length2][length3];
				
				for (int i = 0; i < length1; i++) {
					for (int j = 0; j < length2; j++) {
						for (int k = 0; k < length3; k++) {
							System.out.printf("Index [%o][%o][%o]: ", i, j, k);
							array3d[i][j][k] = input.nextInt();
						}
					}
				}
				
				result = Arrays.deepToString(array3d);
				System.out.printf("Result = %s", result);
				break;
			default:
				System.out.println("Sorry, only up to 3");
				break;
		}
	}

}
