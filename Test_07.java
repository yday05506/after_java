
public class Test_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true, b = false, c;
//		c = a || b;
//		System.out.println(c);
		
//		c = b && a;
//		System.out.println(c);
		
//		boolean bb = aa();
//		System.out.println(bb);
//		boolean cc = bb();
//		System.out.println(cc);
		
//		System.out.println("--------------------");
//		c = aa() || bb();
//		System.out.println(c);
//		System.out.println("--------------------");
		
		System.out.println("--------------------");
		c = bb() && aa();
		System.out.println(c);
		System.out.println("--------------------");
	}
	
	public static boolean aa() {
		System.out.println("aa() 함수 호출");
		return true;
	}

	public static boolean bb() {
		System.out.println("bb() 함수 호출");
		return false;
	}
}
