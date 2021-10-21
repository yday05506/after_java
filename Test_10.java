
public class Test_10 {

	public static void main(String[] args) {
		//for문 정리
//		int a;
//		int sum = 0;
//		for(a = 1; a <= 10; a++) {
//			System.out.println(a);
//			sum += a;
//		}
//		System.out.println("a = " + a);
//		System.out.println("sum = " + sum);
		
//		for(int i = 65; i <= 90; i++) {
//			System.out.print(i + " ");
//		}
		
//		for(int i = 'A'; i <= 'Z'; i++) {
//			System.out.print(i + " ");
//		}
		
		
		//이중 for문
//		for(int m = 1; m <= 3; m++) {
//			System.out.println("m = " + m);
//			for(int n = 1; n <= 4; n++) {
//				System.out.println("n = " + n);
//			}
//			System.out.println();
//		}
		
//		for(char i = 65; i <= 90; i++) {
//			System.out.print(i + " : ");
//			for(char j = i; j <= 'Z'; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		//continue, break
//		for(int i = 1; i <= 10; i++) {
//			if(i == 7)
//				break;
//			System.out.println(i);
//		}
		
		
		//무한 루프
		int kk = 0;
		for(;;) {
			kk++;
			System.out.println("나 너무 무서워. 그만해. 이러다가 우리 다 죽어.");
			if(kk == 5)
				break;
		}
 	}

}
