import java.util.Scanner;
public class Warnajerseybola {
	public static void main(String[] args) {
		char warna;
		Scanner input = new Scanner(System.in);
		System.out.print("Input Warna Jersey Ke : ");
		warna = input.next().charAt(0);

		switch (warna) {
		case '1':
			System.out.println("Merah");
			break;
		case '2':
			System.out.println("Hijau");
			break;
		case '3':
			System.out.println("Kuning");
			break;
		case '4':
			System.out.println("Biru");
			break;
		default :
			System.out.println("Warna Jersey Random");
		}
	}
}
