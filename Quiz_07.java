import java.util.Scanner;

public class Quiz_07 {

	public static void main(String[] args) {
		//정수를 입력받아서 각 자리의 숫자의 합을 구하시오.
		//예) 12345 -> 15
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
	
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		while(n > 0) {
			sum += (n % 10);
			n /= 10;
		}
		
		System.out.println(sum);
	}

}
