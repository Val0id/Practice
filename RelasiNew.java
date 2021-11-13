import java.util.Scanner;

public class RelasiNew {
	public static void main(String[] args) {
		int[] setA;
		int lengthA, element;
		String setAPrint = "";
		String reflexive = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Jenis Relasi Refleksif");
		
		System.out.print("Masukkan banyak himpunan 'A': ");
		lengthA = input.nextInt();
		setA = new int[lengthA];
		
		for (int i = 1; i <= lengthA; i++) {
			System.out.printf("Masukkan elemen 'A' ke- %o: ", i);
			element = input.nextInt();
			setA[i-1] = element;
		}
		
		for (int i = 0; i < setA.length; i++) {
			if (i != setA.length - 1) {
				setAPrint += setA[i] + ",";
			} else {
				setAPrint += setA[i];
			}
		}
		
		System.out.println("\n");
		
		System.out.printf("A=(%s}\n\n\n", setAPrint);
		
		for (int i = 0; i < setA.length; i++) {
			if (i != setA.length - 1) {
				reflexive += "(" + setA[i] + "," + setA[i] + "),";
			} else {
				reflexive += "(" + setA[i] + "," + setA[i] + ")";
			}
		}
		
		System.out.printf("Refleksif dari himpunan A = {%s}", reflexive);
	}
}
