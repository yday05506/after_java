import java.util.Scanner;

public class Quiz_06 {

	public static void main(String[] args) {
		//for문을 이용해서 문자형 숫자를 입력받아서 각 자리의 합을 구하시오.
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <= 10; i++) {
			String n = sc.next();
			System.out.println(n);
		}
	}

}
