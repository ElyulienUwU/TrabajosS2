/*Julian Fernando Ortiz
 * 22550335
 * Programacion Orientado en Objetos
 */

package EVA1_4_TELEVICION;

public class Television {
	//datos
	private boolean onoff;
	private int vol;
	private int canal;
	
	//contructor default
	public Television() {
		onoff = false;
		vol = 50;
		canal = 98;	
	}
	
	public void CambiarPower() {
		if (onoff == false) {
			onoff = true;
	System.out.println("¡Television encendida!");
		}else {
			onoff = false;
	System.out.println("¡Television Apagada!");
		}

	}
	
	public void SubirVol() {
		if (onoff == true) {
			if (vol < 100) {
			vol = vol + 5;
			System.out.println("volumen: " + vol);
		}
	}
}
	
	public void BajarVol() {
		if (onoff == true) {
			if (vol > 0) {
				vol = vol - 5;
				System.out.println("volumen: " + vol);	
			}
			
		}
		
	}
	
	public void subirC() {
		if (onoff == true) {
			if (canal < 100) {
				canal = canal + 1;
			}else
					canal = 0;
					System.out.println("canal: " + canal);
			}
			
		}
	public void bajarC() {
		if (onoff == true) {
			if (canal > 0) {
				canal = canal - 1;
				System.out.println("canal: " + canal);
			}else{
				canal = 100;
				System.out.println("canal: " + canal);
			}
			
		}
	}
		
}



