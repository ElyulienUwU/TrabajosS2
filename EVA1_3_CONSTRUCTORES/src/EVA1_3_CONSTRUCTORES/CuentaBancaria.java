package EVA1_3_CONSTRUCTORES;

public class CuentaBancaria {
	//  Datos
	
		private double saldo;
		private String cuenta;
		private String cliente;
		
		/*Contructor:
		Modificador de accesos nombre de la clase(argumentos)
		*/
		public CuentaBancaria() {//Constructor default
			cuenta = "♫";
			saldo = 1000000;
			cliente = "________";
		}
		
		public CuentaBancaria(String x, double y, String z) {
		cuenta = x;
		saldo = y;
		cliente = z;
		}
		
		
	//	gets
		
		public double getSaldo() {
			return saldo;}
		public String getCuenta() {
			return cuenta;}
		public String getCliente() {
			return cliente;}
		
	//	sets
		
		public void setSaldo(double S) {
			saldo = S;}
		public void setCuenta(String C) {
			cuenta = C;}
		public void setCliente(String C) {
			cliente = C;}
		
		public void Datos() {
			System.out.println("Cuenta: " + cuenta);
			System.out.println("Cliente: " + cliente);
			System.out.println("Saldo: " + saldo + "\n");
		}
	}

