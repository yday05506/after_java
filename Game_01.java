import java.util.Scanner;

public class Game_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int com, you;
		String choice;
		
		while(true) {
			com = (int)(Math.random() * 3) + 1;	//com = 1, 2, 3
			System.out.print("입력(1 : 가위, 2 : 바위, 3 : 보) : ");
			you = sc.nextInt();
			System.out.println();
			
			//방법 1 : 초급자 코스
			if(com == 1) {	//com = 가위
				switch (you) {
				case 1 : 
					System.out.println("컴퓨터 : 가위    사용자 : 가위 ==> 비겼습니다.");
					break;
				case 2 : 
					System.out.println("컴퓨터 : 가위    사용자 : 바위 ==> 이겼습니다.");
					break;
				case 3 : 
					System.out.println("컴퓨터 : 가위    사용자 : 보 ==> 졌습니다.");
					break;
				}
			}
			else if (com == 2) {	//com = 바위
				switch (you) {
				case 1 : 
					System.out.println("컴퓨터 : 바위    사용자 : 가위 ==> 졌습니다.");
					break;
				case 2 : 
					System.out.println("컴퓨터 : 바위    사용자 : 바위 ==> 비겼습니다.");
					break;
				case 3 : 
					System.out.println("컴퓨터 : 바위    사용자 : 보 ==> 이겼습니다.");
					break;
				}
			}
			else if (com == 3) {	//com = 보
				switch (you) {
				case 1 : 
					System.out.println("컴퓨터 : 보    사용자 : 가위 ==> 이겼습니다.");
					break;
				case 2 : 
					System.out.println("컴퓨터 : 보    사용자 : 바위 ==> 졌습니다.");
					break;
				case 3 : 
					System.out.println("컴퓨터 : 보    사용자 : 보 ==> 비겼습니다.");
					break;
				}
			}
			
			System.out.println("계속하시겠습니까? (y or n) : ");
			choice = sc.next();	//choice = y, n
			
			if(choice.equals("n") || choice.equals("N"))
				break;
			
			System.out.println();
		}
	}

}
