package EVA1_11_CALIFAS;
/*metodo que reciba un entero y devuelva una letra
 * 91 - 100 A
 * 81 - 90 B
 * 71 - 80 C
 * MENOR A 70 D
 */
public class EVA1_11_CALIFAS {

	public EVA1_11_CALIFAS() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//califa(82);
		//califa(45);
		String r;
		r = califa(50);
		System.out.println(r);
	}
	public static String califa(int n) {
		String resu = "";
		if (n > 90 && n <= 100)
			resu = "A";
//			System.out.println("A");	
		else if(n > 80 && n <= 90)
			resu = "B";
//			System.out.println("B");
		else if(n > 70 && n <= 80)
			resu = "C";
	//		System.out.println("C");
		else if(n < 70)
			resu = "D";
		//	System.out.println("D");
		return resu;
	}
	

}
