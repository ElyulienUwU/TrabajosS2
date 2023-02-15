//Julian Fernando Ortiz Lerma
//22550335
//Programacion Orientada a Objetos
package EVA1_3_CONSTRUCTORES;

public class EVA1_3_CONSTRUCTORES {

	public EVA1_3_CONSTRUCTORES() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaBancaria c1 = new CuentaBancaria();
		c1.setCliente("Julian Ortiz");
		c1.setCuenta("123");
		c1.setSaldo(5000);
		
		c1.Datos();
		
		CuentaBancaria c2 = new CuentaBancaria("100",1000000,"Mauricio");
		c2.Datos();
		
		CuentaBancaria c3 = new CuentaBancaria();
		c3.Datos();
		
		CuentaBancaria c4 = new CuentaBancaria("888",78900,"Manfred");
		c4.Datos();
}
	
}