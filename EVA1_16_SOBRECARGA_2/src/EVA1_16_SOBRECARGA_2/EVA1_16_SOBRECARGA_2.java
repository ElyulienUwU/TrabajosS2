/*
 * Julian Fernando Ortiz Lerma
 * 22550335
 * Programacion orientada a objetos
 */
package EVA1_16_SOBRECARGA_2;

public class EVA1_16_SOBRECARGA_2 {

	public EVA1_16_SOBRECARGA_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("Suma  :"   + suma(4 , 9));
	        System.out.println("Suma  :"   + suma(4.0 , 9.0));
	        System.out.println("Suma  :"   + suma("Hola" , "Mundo"));
	        suma();
	    }
	    public static int suma(int val1,int val2){
	        return val1 + val2;
	    }
	    public static double suma(double val1,double val2){
	        return val1 + val2;
	    }
	    public static String suma(String val1,String val2){
	        return val1 + val2;
	    }
	    public static String suma(){
	        System.out.println("Suma:  sin argumento");
	        return null;
	}

}
