import java.util.Arrays;
import java.util.Scanner;

public class TugasM8 {

	public static void main(String[] args) {
		int dimension;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dimension: ");
		dimension = input.nextInt();
		
		switch (dimension) {
			case 1:
				{
					int[] array;
					int length;
					String result;
					
					System.out.print("length: ");
					length = input.nextInt();
					
					array = new int[length];
					
					for (int i = 0; i < array.length; i++) {
						System.out.printf("Index [%o]: ", i);
						array[i] = input.nextInt();
					}
					
					result = Arrays.toString(array);
					result = result.replace("[", "{");
					result = result.replace("]", "}");
					
					System.out.printf("Result = %s\n", result);
					break;
				}
			case 2:
				{
					int[][] array;
					int length1, length2;
					String result;
					
					System.out.print("length 1: ");
					length1 = input.nextInt();
					
					System.out.print("length 2: ");
					length2 = input.nextInt();
					
					array = new int[length1][length2];
					
					for (int i = 0; i < length1; i++) {
						for (int j = 0; j < length2; j++) {
							System.out.printf("Index [%o][%o]: ", i, j);
							array[i][j] = input.nextInt();
						}
					}
					
					result = Arrays.deepToString(array);
					result = result.replace("[", "{");
					result = result.replace("]", "}");
					
					System.out.printf("Result = %s\n", result);
					break;
				}
			case 3:
				{
					int[][][] array;
					int length1, length2, length3;
					String result;
					
					System.out.print("length 1: ");
					length1 = input.nextInt();
					
					System.out.print("length 2: ");
					length2 = input.nextInt();
					
					System.out.print("length 3: ");
					length3 = input.nextInt();
					
					array = new int[length1][length2][length3];
					
					for (int i = 0; i < length1; i++) {
						for (int j = 0; j < length2; j++) {
							for (int k = 0; k < length3; k++) {
								System.out.printf("Index [%o][%o][%o]: ", i, j, k);
								array[i][j][k] = input.nextInt();
							}
						}
					}
					
					result = Arrays.deepToString(array);
					result = result.replace("[", "{");
					result = result.replace("]", "}");
					
					System.out.printf("Result = %s\n", result);
					break;
				}
			default:
				System.out.println("Sorry, only up to 3");
				break;
		}
	}

}
