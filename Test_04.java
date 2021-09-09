
public class Test_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char ch = 'A';
//		char ch2 = 'B';
//		int code = ch1 + ch2;
//		System.out.println(code);
		
//		char ch1 = 'A';
//		char ch2 = 'Z';
//		for(int i = ch1; i <= ch2; i++) {
//			System.out.print((char)i);
//		}
		
		char ch1 = 'A';
		char ch2 = 'Z';
		
		for(int a = 1; a <= 1000000; a++) {
			for(int i = ch1; i <= ch2; i++) {
				//for(int j = i; j < ch2; j++)
				for(int j = ch1; j <= i; j++)
					System.out.print((char)j);
			}
			System.out.println();
		}
	}

}
