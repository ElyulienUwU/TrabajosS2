/*Julian Fernando Ortiz Lerma
 * 22550335
 * Programacion Orientada a objetos
 */
package EVA1_6_AUTOMOVIL;

public class EVA1_6_AUTOMOVIL {

	public EVA1_6_AUTOMOVIL() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A1 = auto 1
		Auto A1 = new Auto();
		A1.setMarca("Nissan");
		A1.setModelo("Sentra");
		A1.setAño(2008);
		A1.setDueño("Julian Fernando Ortiz Lerma");
		A1.setPlacas("JFO-03-05");
		A1.imprimirDatos();
	}

}
