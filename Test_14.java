
public class Test_14 {

	public static void main(String[] args) {
//		for(int i = 1; i<= 5; i++)
//			System.out.println(i);
//		
//		int j = 1;
//		while(j <= 5) {
//			System.out.println(j);
//			j++;
//		}
		
		//while문을 이용해서 1~10 사이의 홀수만 출력하기
//		int w = 0;
//		while(true) {
//			w++;
//			if(w==10)
//				break;
//			if(w%2==0)
//				continue;
//			System.out.println(w);
//		}
//		System.out.println("반복문 탈출 후 w = " + w);
		
		int w = 10;
		do {
			System.out.println("do while문의 w = " + w);
		}
		while(w <= 5);
	}

}
