import java.util.Scanner;

public class Test_15 {

	public static void main(String[] args) {
		//while문을 이용해서 1부터 누적합계가 100이 넘는 첫 번째 수와 그때까지의 합계를 출력하시오.
		
//		int sum = 0;
//		int i = 0;
//		
//		while(true) {
//			i++;
//			sum += i;	//sum += ++i;
//			if(sum >= 100) {
//				System.out.println("100이 넘는 첫 번째 수 : " + i + ", 합계 : " + sum);
//				break;
//			}
//		}
		
		//while문을 이용해서 약수 구하기
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		System.out.print("정수 입력 : ");
		int su = sc.nextInt();
		
		while(su >= i) {
			i++;
			if(su % i == 0) {
				System.out.println(i);
			}
		}
	}

}
