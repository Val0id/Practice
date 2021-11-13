# Pokoknya yang ada x1 x2
int a, b, c;
double x1, x2;
Scanner input = new Scanner(System.in);

System.out.print("Masukkan nilai a: ");
a = input.nextInt();

System.out.print("Masukkan nilai b: ");
b = input.nextInt();

System.out.print("Masukkan nilai c: ");
c = input.nextInt();

x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

if (Double.isNaN(x1) && Double.isNaN(x2)) {
  System.out.println("Akar-akar dari persamaan kuadarat adalah imajiner.");
} else {
  System.out.printf("x1 = %.2f\n", x1);
  System.out.printf("x2 = %.2f", x2);
}
