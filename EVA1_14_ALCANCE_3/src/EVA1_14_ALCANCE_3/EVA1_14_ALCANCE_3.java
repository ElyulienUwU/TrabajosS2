package EVA1_14_ALCANCE_3;

public class EVA1_14_ALCANCE_3 {

	public EVA1_14_ALCANCE_3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		System.out.println(x);//visible en todo el main
		for (int i = 0; i < 10; i++) {
			int = 100;//no se puede, porque ya esta declarad en el main
			System.out.println(x);
			System.out.println(i);
			if(i == 5) {
				System.out.println(x);
			}
		}
		for (int i = 0; i < args.length; i++) {
			System.out.println(i);
		}
	}
	public static void Algo(int x) {
		
	}
	public static void Algo2(int x) {
		
	}

}




