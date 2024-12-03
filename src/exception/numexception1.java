package exception;

public class numexception1 extends Exception {
	public numexception1 (int a) {
		System.out.println(a+" est >20 : la factorielle d'un nombre>20 n'est pas définie");
	}
}
