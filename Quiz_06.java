import java.util.Scanner;

public class Quiz_06 {

	public static void main(String[] args) {
		//for문을 이용해서 문자형 숫자를 입력받아서 각 자리의 합을 구하시오.
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		String str = sc.next();
//		System.out.println(str.length());
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(4));
		
		for(int i = 0; i < str.length(); i++) 
			sum = sum + str.charAt(i) - '0';	//'0' 대신 48도 괜찮음
		
		System.out.println(sum);
	}
}
