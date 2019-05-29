package complejos_2;
/**
 * Programa que calcula varias operaciones de n�meros complejos.
 * 
 * @author Sergio Almagro
 * @version 29.05.2019
 */
public class ProgramaComplejos {
	public static void main(String[] args){
		
		NumComplejo1 num1=new NumComplejo1(2,3);
		NumComplejo1 num2=new NumComplejo1(2,1);
		NumComplejo1 res=new NumComplejo1();
		
		System.out.println("Programa que opera con números complejos");
		System.out.println("========================================");
		
		System.out.println("Suma:");
		res=NumComplejo1.sumarComplejos(num1,num2);
		System.out.println(res);
		
		System.out.println("Resta:");
		res=NumComplejo1.restarComplejos(num1,num2);
		System.out.println(res);
		
		System.out.println("Multiplicación:");
		res=NumComplejo1.multiplicarComplejos(num1,num2);
		System.out.println(res);
		
		System.out.println("División:");
		res=NumComplejo1.dividirComplejos(num1,num2);
		System.out.println(res);
	}

}
