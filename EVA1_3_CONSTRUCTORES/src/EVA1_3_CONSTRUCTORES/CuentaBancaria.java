package EVA1_3_CONSTRUCTORES;

public class CuentaBancaria {
	//  Datos
	
		private double saldo;
		private String cuenta;
		private String cliente;
		
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
			System.out.println("Saldo: " + saldo);
		}
	}

