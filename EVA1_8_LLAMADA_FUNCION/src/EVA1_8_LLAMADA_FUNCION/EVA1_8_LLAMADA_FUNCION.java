package EVA1_8_LLAMADA_FUNCION;

public class EVA1_8_LLAMADA_FUNCION {

	public EVA1_8_LLAMADA_FUNCION() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicia main()");
		A();
		System.out.println("Termina main()");
	}
	public static void A() {
		System.out.println("Inicia A()");
		B();
		System.out.println("Termina A()");
	}
	public static void B() {
		System.out.println("Inicia B()");
		
		System.out.println("Termina B()");
	}
}
