/*
 * Julian Fernando Ortiz Lerma
 * 22550335
 * Programacion orientada a objetos
 */
package EVA1_19_STATIC_2;

public class EVA1_19_STATIC_2 {
	int x = 100;

	public EVA1_19_STATIC_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Metodos no estaticos
		//System.out.println(x);
		//mensajeNoStatic();
		EVA1_19_STATIC_2 obj = new EVA1_19_STATIC_2();
		System.out.println(obj.x);
		obj.mensajeNoStatic();
		//metodos estaticos
		mensajeStatic();
	}

	public void mensajeNoStatic(){//No Existe
		System.out.println("No estatico");
		}
	public static void mensajeStatic(){//Existe al iniciar el programa
		System.out.println("No estatico");
		}
}
