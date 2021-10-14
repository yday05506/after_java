import java.util.Scanner;
public class Test_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//if유형1
//		if(num % 2 == 0) 
//			System.out.println("짝입니다.");
////			System.out.println("구슬을 다 걸어봐, 우린 깐부잖아.");
////			System.out.println("그만해, 우리 이제 다 죽어!");
//		else
//			System.out.println("홀입니다.");

//		if (num > 5)
//			System.out.println("5보다 큽니다.");
//		else
//			System.out.println("5보다 작습니다.");
		
		
		//중첩 if문
//		if(num >= 10) {
//			if(num >= 20)
//				System.out.println(num + "은 10보다 같거나 크고 20보다도 같거나 크다.");
//			else
//				System.out.println(num + "은 10보다 같거나 크지만 20보다는 작습니다.");
//		}
//		else
//			System.out.println(num + "은 10보다 작습니다.");
		
		if(num < 0 || num > 100) {
			System.out.print("다시 입력하세요 : ");
			num = sc.nextInt();
		}
		else {
			if (num >= 90)
				System.out.println("수");
			else if (num >= 80)
				System.out.println("우");
			else if (num >= 70)
				System.out.println("미");
			else if (num >= 60)
				System.out.println("양");
			else
				System.out.println("가");
		}
	}
}
