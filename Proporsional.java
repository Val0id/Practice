import java.util.Scanner;

public class Proporsional {
	
	public static void main(String[] args) {
		int p, q, option, result = 0;
		boolean finish = false;
		String symbol = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Program Proporsional\n");
		
		System.out.print("Masukkan nilai P (1 atau 0) : ");
		p = input.nextInt();
		
		System.out.print("\nMasukkan nilai Q (1 atau 0) : ");
		q = input.nextInt();
		
		while (finish == false) {
			System.out.println("    Menu Pilihan");
			System.out.println("=1.Konjungsi      =");
			System.out.println("=2.Disjungsi      =");
			System.out.println("=3.Kondisional    =");
			System.out.println("=4.Bikondisional  =");
			System.out.println("=5.Exit           =");

			System.out.print("\nPilih menu: ");
			option = input.nextInt();

			switch (option) {
				case 1:
					System.out.println("\n");
					if (p == 1 && q == 1) {
						result = 1;
					} else {
						result = 0;
					}
					symbol = "^";
					break;
				case 2:
					System.out.println("\n");
					if (p == 1 || q == 1) {
						result = 1;
					} else {
						result = 0;
					}
					symbol = "v";
					break;
				case 3:
					System.out.println("\n");
					if (q != 0) {
						result = 1;
					} else {
						result = 0;
					}
					symbol = "->";
					break;
				case 4:
					System.out.println("\n");
					if (p == q) {
						result = 1;
					} else {
						result = 0;
					}
					symbol = "<->";
					break;
				case 5:
					finish = true;
					break;
			}
			
			if (option != 5) {
				System.out.printf("Hasil dari P %s Q : %o\n\n\n", symbol, result);
			}
		}
	}
	
}
