import java.util.Scanner;

public class Test_22 {

	public static void main(String[] args) {
		// String 배열에 5명의 친구의 이름을 입력 받아
		// 짝수 번째의 친구 이름만 출력하세요.
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		
		System.out.println("5명의 친구 이름을 입력하세요");
		
		for(int i = 0; i < name.length; i++) {
			System.out.print((i + 1) + "번째 친구 이름 : ");
			name[i] = sc.next();
		}
		
		for(int i = 0; i < name.length; i++) {
			if(i == 1 || i == 3)
				System.out.println(name[i]);
		}

	}

}
