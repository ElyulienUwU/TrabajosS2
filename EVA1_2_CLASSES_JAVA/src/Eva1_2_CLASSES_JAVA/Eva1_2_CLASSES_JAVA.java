//Julian Fernando Ortiz Lerma
//22550335
//Programacion Orientada a Objetos
package Eva1_2_CLASSES_JAVA;

public class Eva1_2_CLASSES_JAVA {

	public Eva1_2_CLASSES_JAVA() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Crear un Objeto
		Instanciacion
		Instanciar --> Dar memoria Ram
		Nombre de la clase identificador = new constructor de la clase
	*/
		Persona perso1 = new Persona ();//Persona () es el constructor
	/*	perso1.nombre = "Julian";
		perso1.apellidos = "Ortiz Lerma";
		System.out.println(perso1.nombre + " " + perso1.apellidos);*/
		perso1.setNombre("Julian");
	//	System.out.println(perso1.getNombre());
		
		perso1.setApellidos("Ortiz Lerma");
	//	System.out.println(perso1.getApellidos());

		perso1.setEdad(18);
	//	System.out.println(perso1.getEdad());

		perso1.setGenero('H');
	//	System.out.println(perso1.getGenero());
		
		perso1.ImprimirDatos();
		
		Persona perso2 = new Persona ();
		perso2.setNombre("Aura");
		
		perso2.setApellidos("Vargas Solis");
		
		perso2.setEdad(23);
		
		perso2.setGenero('L');
		
		perso2.ImprimirDatos();
	}

}
