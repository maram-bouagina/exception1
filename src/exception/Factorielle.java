package exception;

public class Factorielle {
	 
	 public static void main (String[] args)
	 {
	 try {
	 int i, nbEntiers=0, factorielle=1;
	 int ancien;
	 nbEntiers= Integer.parseInt(args[0]);
	 if(nbEntiers<0) {
		 throw new numexception (nbEntiers);
	 }
	 else if(nbEntiers>20) {
		 throw new numexception1(nbEntiers);
	 }
		 for (i=2;i<=nbEntiers;i++){
			 ancien=factorielle;
			 factorielle *= i;
			 }
			 System.out.println("Voila la factorielle des "+ nbEntiers + " premiers entiers : "+factorielle);
			 
	 }
	 catch(ArrayIndexOutOfBoundsException e) {
		 System.out.println("Donnez en paramètre la base de la factorielle");
	 }
	 catch(NumberFormatException e){
		 System.out.println("La base de la factorielle doit être ENTIERE");
	 }
	 catch(numexception e) {
		 System.out.println("erruer"+e.getMessage());
	 }
	 catch(numexception1 e) {
		 System.out.println("erruer"+e.getMessage());
	 }

}
}


//ArrayIndexOutOfBoundsException
//NumberFormatException: