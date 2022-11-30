//Jordi Ribellas y Eloy Altozano
public class main extends Thread {

	public static void main(String[] args) {
		main thread = new main();
		thread.start();
	}

	public void run() {
		int num1 = 0, num2 = 1, suma = 1;
		System.out.println(num1);

		for (int i = 1; i < 10; i++) {
			System.out.println(suma);

			suma = num1 + num2;
			num1 = num2;
			num2 = suma;

		}
	}

}
