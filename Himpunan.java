import java.util.Scanner;

public class Himpunan {	
	public static void main(String[] args) {
		int[] setA, setB;
		String intersectionString;
		
		String setAPrint = "", setBPrint = "", intersectionPrint = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan banyak elemen 'A': ");
		int lengthA = input.nextInt();
		setA = new int[lengthA];
		
		for (int i = 1; i <= lengthA; i++) {
			System.out.printf("Masukkan elemen ke-%o: ", i);
			int element = input.nextInt();
			setA[i-1] = element;
		}
		
		for (int i = 0; i < setA.length; i ++) {
			if (i != setA.length - 1) {
				setAPrint += setA[i] + ",";
			} else {
				setAPrint += setA[i];
			}
		}
		
		System.out.printf("A={%s}\n\n", setAPrint);
		
		System.out.print("Masukkan banyak elemen 'B': ");
		int lengthB = input.nextInt();
		setB = new int[lengthB];
		
		for (int i = 1; i <= lengthB; i++) {
			System.out.printf("Masukkan elemen ke-%o: ", i);
			int element = input.nextInt();
			setB[i-1] = element;
		}
		
		for (int i = 0; i < setB.length; i ++) {
			if (i != setB.length - 1) {
				setBPrint += setB[i] + ",";
			} else {
				setBPrint += setB[i];
			}
		}
		
		System.out.printf("B={%s}\n\n", setBPrint);
		
		intersectionString = "";
		for (int i = 0; i < setA.length; i++) {
			for (int j = 0; j < setB.length; j++) {
				if (setA[i] == setB[j]) {
					intersectionString += setB[j] + ",";
				}
			}
		}
		
		String[] intersection = intersectionString.split(",");
		for (int i = 0; i < intersection.length; i++) {
			if (i != intersection.length - 1) {
				intersectionPrint += intersection[i] + ",";
			} else {
				intersectionPrint += intersection[i];
			}
		}
		
		System.out.printf("Jadi irisannya adalah {%s}", intersectionPrint);
	}
}
