package EVA1_6_AUTOMOVIL;

/*get y set
 * constructores default y argumentos
 * calcular aduedo
 * 2000 y anteriores : $1500
 * 2001 - 2005: $2000
 * 2006 - 2010: $2500
 * 2011 - 2015: $3000
 * 2016 - 2023: $4000
 * imprimir datos: incluir adeudos
 */

public class Auto {
	private String marca;
	private String modelo;
	private String placas;
	private int año;
	private String dueño;
	private int adeudo;

	public Auto() {
		marca = "Toyota";
		modelo = "Corolla";
		placas = "AAA-00-00";
		año = 1984;
		dueño = "sin dueño";
		adeudo = 2000;
	}
	public void setMarca(String x) {
		marca = x;
	}
	public void setModelo(String y) {
		modelo = y;
	}
	public void setPlacas(String z) {
		placas = z;
	}
	public void setAño(int a) {
		año = a;
		if (año < 2000)
			adeudo = 1500;
		else if (año >= 2001 && año <=2005)
			adeudo = 2000;
		else if (año >= 2006 && año <= 2010)
			adeudo = 2500;
		else if (año >= 2011 && año <= 2015)
			adeudo = 3000;
		else if (año >= 2016 && año <= 2023)
			adeudo = 4000;
	}
	public void setDueño(String d) {
		dueño = d;
	}
	public void imprimirDatos() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Año: " + año);
		System.out.println("Adeudo por año del Auto: $" + adeudo);
		System.out.println("Dueño: " + dueño);
		System.out.println("Placas: " + placas);
	}
	
}
