package exception;

public class numexception extends Throwable {
			public numexception (int a) {
				System.out.println(a+" est négatif : la factorielle d'un nombre négatif n'est pas définie");
			}
}
