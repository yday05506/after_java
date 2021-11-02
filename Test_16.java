import java.util.Scanner;

public class Test_16 {

	public static void main(String[] args) {
		//0~100 사이의 정수를 사용자로부터 여러 개 입력 받아서 합, 평균, 입력 갯수를 출력하시오.
		//단, 0보다 작은 값이 입력되면 프로그램을 종료하고
		//100보다 큰 수는 갯수, 합, 평균에서 제외하며 다음 값을 입력 받을 것.
		
		Scanner sc = new Scanner(System.in);
		int n;
		int cnt = 0;
		int sum = 0;
		int average = 1;
		
		while(true) {
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
			
			if(n <= 0)
				break;
			else if (n > 100)
				continue;
			
			cnt++;
			sum += n;
			average = (sum / cnt);
		}
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + average);
		System.out.println("입력 갯수 : " + cnt);
	}

}
