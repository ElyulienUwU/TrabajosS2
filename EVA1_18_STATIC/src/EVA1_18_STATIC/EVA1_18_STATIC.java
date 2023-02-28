/*
 * Julian Fernando Ortiz Lerma
 * 22550335
 * Programacion orientada a objetos
 */
package EVA1_18_STATIC;

public class EVA1_18_STATIC {

	public EVA1_18_STATIC() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prueba objeto = new Prueba();
		objeto.mensaje();
		Prueba.mensajeEstatico();
		System.out.println("PI " + Math.PI);
	}

}

class Prueba{
	public void mensaje() {
		System.out.println("Hi!!!");
	}
	public static void mensajeEstatico() {
		System.out.println("Hola (estatico)");
		
	}
	
}

class otra{
	
	
}