import java.util.Scanner;

public class AljabBool {
	
	public static void main(String[] args) {
		int a, b, menu, hasil = 0;
		boolean finish = false;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("    ALJABAR BOOLEAN\n");
		
		System.out.print("Masukkan nilai a (1 atau 0) : ");
		a = keyboard.nextInt();
		
		System.out.println();
		
		System.out.print("Masukkan nilai b (1 atau 0) : ");
		b = keyboard.nextInt();
		
		while (finish == false) {
			System.out.println("Menu Pilihan");
			System.out.println("=1.AND            =");
			System.out.println("=2.OR             =");
			System.out.println("=3.NAND           =");
			System.out.println("=4.NOR            =");
			System.out.println("=5.EXOR           =");
			System.out.println("=6.EXNOR          =");
			System.out.println("=7.Exit           =\n");

			System.out.print("Pilih menu: ");
			menu = keyboard.nextInt();

			switch (menu) {
				case 1:
					if (a == 1 && b == 1) {
						hasil = 1;
					} else {
						hasil = 0;
					}
					System.out.printf("\n\nHasil dari (a AND b) atau (a.b) : %d\n\n\n", hasil);
					break;
				case 2:
					if (a == 1 || b == 1) {
						hasil = 1;
					} else {
						hasil = 0;
					}
					System.out.printf("\n\nHasil dari (a OR b) atau (a+b) : %d\n\n\n", hasil);
					break;
				case 3:
					if (a == 1 && b == 1) {
						hasil = 0;
					} else {
						hasil = 1;
					}
					System.out.printf("\n\nHasil dari (a NAND b) atau (a.b)' : %d\n\n\n", hasil);
					break;
				case 4:
					if (a == 1 || b == 1) {
						hasil = 0;
					} else {
						hasil = 1;
					}
					System.out.printf("\n\nHasil dari (a NOR b) atau (a+b)' : %d\n\n\n", hasil);
					break;
				case 5:
					if ((a == 0 && b == 0) || (a == 1 && b == 1)) {
						hasil = 0;
					} else {
						hasil = 1;
					}
					System.out.printf("\n\nHasil dari (a EXOR b) atau (a\u2295b) : %d\n\n\n", hasil);
					break;
				case 6:
					if ((a == 0 && b == 0) || (a == 1 && b == 1)) {
						hasil = 1;
					} else {
						hasil = 0;
					}
					System.out.printf("\n\nHasil dari (a EXNOR b) atau (a X b)^ : %d\n\n\n", hasil);
					break;
				case 7:
					System.out.println("\n\nTERIMA KASIH");
					finish = true;
					break;
			}
		}
	}
	
}
