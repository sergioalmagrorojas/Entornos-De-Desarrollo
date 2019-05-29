package complejos_2;

/**
 * Clase NumComplejo.
 * @author Sergio Almagro
 * @version 29.05.2019
 */
public class NumComplejo1 {
	
	/**   real. */
	private double pReal;
	
	/**  imaginaria. */
	private double pImaginaria;

	/**
	 * instancia un  nuevo num complejo.
	 */
	public NumComplejo1(){

	}

	/**
	 *constructor
	 *
	 * @param pReal: real
	 * @param pImaginaria : imaginaria
	 */
	public NumComplejo1(double pReal, double pImaginaria){
		this.pReal=pReal;
		this.pImaginaria=pImaginaria;
	}

	/**
	 *Getter
	 *
	 * @return p real
	 */
	public double getpReal() {
		return pReal;
	}

	/**
	 * setter 
	 *
	 * @param pReal a nueva p real
	 */
	public void setpReal(double pReal) {
		this.pReal = pReal;
	}

	/**
	 *getter
	 * @return the p imaginaria
	 */
	public double getpImaginaria() {
		return pImaginaria;
	}

	/**
	 *
	 *setter.
	 * @param pImaginaria the new p imaginaria
	 */
	public void setpImaginaria(double pImaginaria) {
		this.pImaginaria = pImaginaria;
	}

	
	/**
	 * Suma números  complejos.
	 *
	 * 
	 * @param c1 (número complejo 1)
	 * @param c2 (número complejo 2 )
	 * @return the num complejo(resultado de la suma)
	 */
	public static NumComplejo1 sumarComplejos (NumComplejo1 c1, NumComplejo1 c2){
		NumComplejo1 result = new NumComplejo1();

		result.setpReal(c1.getpReal()+c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()+c2.getpImaginaria());

		return result;
	}

	
	/**
	 * Resta números  complejos.
	 *
	 * @param c1 (número complejo 1)
	 * @param c2 (número complejo 2 )
	 * @return the num complejo(resultado de la resta)
	 */
	public static NumComplejo1 restarComplejos (NumComplejo1 c1, NumComplejo1 c2){
		NumComplejo1 result = new NumComplejo1();

		result.setpReal(c1.getpReal()-c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()-c2.getpImaginaria());

		return result;
	}

	
	/**
	 * Multiplicar  números complejos.
	 *
	 * @param c1 (número complejo 1)
	 * @param c2 (número complejo 2 )
	 * @return the num complejo(resultado de la multiplicación)
	 */
	public static NumComplejo1 multiplicarComplejos (NumComplejo1 c1, NumComplejo1 c2){
		NumComplejo1 result = new NumComplejo1();

		double a=c1.getpReal();
		double b=c1.getpImaginaria();
		double c=c2.getpReal();
		double d=c2.getpImaginaria();

		result.setpReal((a*c)-(b*d));
		result.setpImaginaria((a*d)+(b*c));

		return result;
	}

	
	/**
	 * Dividir números complejos (pimero divide los reales y luego los imaginarios).
	 *
	 * @param c1 (número complejo 1)
	 * @param c2 (número complejo 2 )
	 * @return the num complejo(resultado de la división)
	 */
	public  static NumComplejo1 dividirComplejos (NumComplejo1 c1, NumComplejo1 c2){
		NumComplejo1 result = new NumComplejo1();

		double a=c1.getpReal();
		double b=c1.getpImaginaria();
		double c=c2.getpReal();
		double d=c2.getpImaginaria();

		double dividendoReal = (a*c)+(b*d);
		double dividendoImaginario = (b*c)-(a*d);
		double divisor = (Math.pow(c, 2)+Math.pow(d, 2));

		result.setpReal(dividendoReal/divisor);
		result.setpImaginaria(dividendoImaginario/divisor);

		return result;
	}

	/**
	 * Hace el módulo del número real y el imaginario.
	 * 
	 *Obtiene pReal y pImaginaria 
	 *
	 *Hace la raíz cuadrada del resultado de la suma del
	 * número real elevado al exponente  (2) y el número imaginario elevado al exponente(2)
	 *
	 * @param numComplejo the num complejo
	 * @return the double
	 */
	public static double modulo (NumComplejo1 numComplejo){
		double real =  numComplejo.getpReal();
		double imaginaria = numComplejo.getpImaginaria();

		return Math.sqrt(Math.pow(real, 2)+Math.pow(imaginaria, 2));
	}

	/**
	 * 
	 * Muestra p real si es distinta a 0
	 * Muestra p Imaginaria si es mayor que 0
	 */
	public String toString(){
		
		String mostrar="";
		if (pReal!=0){
			mostrar+=pReal;
		}
		if (pImaginaria>=0){
			mostrar=mostrar+"+"+pImaginaria+"i";
		}else {
			mostrar=mostrar+"-"+(pImaginaria*(-1))+"i";
		}
		return mostrar;
	}
}
