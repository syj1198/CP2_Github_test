
public class CP2_Git_Calc {

	public static void main(String[] args) {
		System.out.println(new Calc().add(1, 1));
		System.out.println(new Calc().sub(6, 9));
		System.out.println(new Calc().mul(5, 6));
		System.out.println(new Calc().div(3, 5));
	}

}

class Calc {
	public double add(double a, double b) {
		return a+b;
	}
	
	public double sub(double a, double b) {
		return a-b;
	}
	
	public int mul(double a, double b) {
		return -1;
	}
	
	public int div(double a, double b) {
		return -1;
	}
}