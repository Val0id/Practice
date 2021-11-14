import java.util.Scanner;

public class Fungsi2 {
	
	public static void main(String[] args) {
		int lengthR, domain, range;
		int[] domainR, rangeR;
		boolean duplicateDomain = false, duplicateRange = false;
		String domainPrint = "", rangePrint = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan banyak relasi (angka genap): ");
		lengthR = input.nextInt();
		domainR = new int[lengthR];
		rangeR = new int[lengthR];
		
		for (int i = 1; i <= lengthR; i++) {
			System.out.printf("Masukkan domain ke-%o: ", i);
			domain = input.nextInt();
			domainR[i-1] = domain;
			
			System.out.printf("Masukkan range ke-%o: ", i);
			range = input.nextInt();
			rangeR[i-1] = range;
		}
		
		for (int i = 0; i < lengthR; i++) {
			if (i != lengthR - 1) {
				domainPrint += domainR[i] + ",";
				rangePrint += rangeR[i] + ",";
			} else {
				domainPrint += domainR[i];
				rangePrint += rangeR[i];
			}
		}
		
		System.out.printf("Domain = {%s}\n", domainPrint);
		System.out.printf("Range = {%s}\n", rangePrint);
		
		System.out.println("Fungsinya:");
		for (int i = 0; i < lengthR; i++) {
			System.out.printf("(%o,%o)\n", domainR[i], rangeR[i]);
		}
		
		for(int i = 0; i < lengthR; i++) {
			for(int j = i + 1; j < lengthR; j++) {
				if(domainR[i] == domainR[j]) {
					duplicateDomain = true;
					break;
				}
				
				if (rangeR[i] == rangeR[j]) {
					duplicateRange = true;
					break;
				}
			}
		}
		
		if (duplicateDomain == true) {
			System.out.println("Relasi tetapi bukan fungsi");
		} else if (duplicateDomain == false && duplicateRange == false) {
			System.out.println("Relasi dan juga fungsi");
			System.out.println("Fungsi satu-satu");
		} else if (duplicateDomain == false && duplicateRange == true) {
			System.out.println("Relasi dan juga fungsi");
			System.out.println("Fungsi tetapi bukan satu-satu");
			System.out.println("Fungsi onto");
		}
	}
	
}
