package EVA1_5_CIRCULO;


/*constructor default
 * constructor con argumentos
 * implementar los atributos necesarios 
 * get y set oara esos atrubutos
 * metodo que regresen  (return) el valor numerico área y perímetro
 */

public class Circulo {
	private double area;
	private double perimetro;
	private double rad;
	private double pi;
	
	/*notas xd
	area = radio^2 * pi
	perimetro = diametro * 3.1416*/
	
	public Circulo(){//declaramos en el default pi para que no sea necesario sacar o pedir pi
		area = 0;
		perimetro = 0;
		rad = 0;
		pi = 3.1416;
	}//Para ponerle un valor al radio, el cual es necesario para sacar el area
	public void setRad(double x){
		rad = x;
	}
	//Me devuelve el valor del area
	public double getA() {
		area = rad * rad *pi;
		System.out.println("Area: " + area);
		return area;
	}
	public double getP() {
		perimetro = (2 * rad) * pi;
		System.out.println("Perimetro: " + perimetro);
	return perimetro;
	}
	
	//pruebas
	/*	public void Area() {
		area = rad * rad *pi;
		System.out.println("Area: " + area);
	}
	*/
		
	/*public void Per() {
			System.out.println("Perimetro: " + perimetro);
	}*/
}
