import java.util.Scanner;

public class Quiz_08 {

	public static void main(String[] args) {
		//피보나치 수열 구하기
		Scanner sc = new Scanner(System.in);
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		System.out.print("i번째 피보나치 수열 : ");
		int cnt = sc.nextInt();
		
		System.out.print(num1 + ", " + num2);
		
		for(int i = 1; i <= cnt-2; i++) {
			num3 = num1 + num2;
			System.out.print(", " + i);
			num1 = num2;
			num2 = num3;
		}
		System.out.print(num3);
	}

}
