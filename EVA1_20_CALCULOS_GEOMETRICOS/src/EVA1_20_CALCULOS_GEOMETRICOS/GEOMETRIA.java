package EVA1_20_CALCULOS_GEOMETRICOS;

public class GEOMETRIA {
	//constantes
	public static final double PI = 3.1416;
	
	//PERIMETRO DE UN CIRCULO
	public static double perimetroC(double r) {
		r = r * 2 * PI;
		return r;
	}
	//area de un circulo
	public static double areaC(double r) {
		r = PI * (r*r);
		return r;
	}
	public static double VolumenEsfera(double r) {
		r = (4.0 / 3.0) * ( PI * (r * r * r));
		return r;
	}

}
