/*
* Julian Fernando Ortiz Lerma
* 22550335
* Programacion orientada a objetos
*/
package EVA1_17_SOBRECARGA_AREAS;

public class EVA1_17_SOBRECARGA_AREAS {

	public EVA1_17_SOBRECARGA_AREAS() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 	System.out.println("area:  " + area(5.5));
	System.out.println("area:  " + area(5.3,2.0));
	System.out.println("area:  " + area(5.0,5.5,8.6));
	}
	public static double area(double val1){
	return Math.PI * ( val1 * val1);
	}
	public static double area(double val1, double val2){
	return (val1 * val2) / 2.0;
	}
	public static double area(double val1,double val2,double val3){
	return ((val1 + val2) * val3) / 2.0;
	}

}
