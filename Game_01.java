import java.util.Scanner;

public class Game_01 {
	
	public static final int 가위 = 1;
	public static final int 바위 = 2;
	public static final int 보 = 3;

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
//			if(com == 1) {	//com = 가위
//				switch (you) {
//				case 1 : 
//					System.out.println("컴퓨터 : 가위    사용자 : 가위 ==> 비겼습니다.");
//					break;
//				case 2 : 
//					System.out.println("컴퓨터 : 가위    사용자 : 바위 ==> 이겼습니다.");
//					break;
//				case 3 : 
//					System.out.println("컴퓨터 : 가위    사용자 : 보 ==> 졌습니다.");
//					break;
//				}
//			}
//			else if (com == 2) {	//com = 바위
//				switch (you) {
//				case 1 : 
//					System.out.println("컴퓨터 : 바위    사용자 : 가위 ==> 졌습니다.");
//					break;
//				case 2 : 
//					System.out.println("컴퓨터 : 바위    사용자 : 바위 ==> 비겼습니다.");
//					break;
//				case 3 : 
//					System.out.println("컴퓨터 : 바위    사용자 : 보 ==> 이겼습니다.");
//					break;
//				}
//			}
//			else if (com == 3) {	//com = 보
//				switch (you) {
//				case 1 : 
//					System.out.println("컴퓨터 : 보    사용자 : 가위 ==> 이겼습니다.");
//					break;
//				case 2 : 
//					System.out.println("컴퓨터 : 보    사용자 : 바위 ==> 졌습니다.");
//					break;
//				case 3 : 
//					System.out.println("컴퓨터 : 보    사용자 : 보 ==> 비겼습니다.");
//					break;
//				}
//			}
			
			//방법 2 : 중급자 코스
//			switch(com) {
//				case 1 :
//					System.out.print("컴퓨터 : 가위 \t");
//					break;
//				case 2 :
//					System.out.print("컴퓨터 : 바위 \t");
//					break;
//				case 3 :
//					System.out.print("컴퓨터 : 보 \t");
//					break;
//			}
//			switch(you) {
//				case 1 :
//					System.out.print("사용자 : 가위 \t");
//					break;
//				case 2 :
//					System.out.print("사용자 : 바위 \t");
//					break;
//				case 3 :
//					System.out.print("사용자 : 보 \t");
//					break;
//				default :
//					System.out.println("1~3 사이의 숫자만 입력해주세요");
//					System.exit(0);
//			}
//			
//			if((you == 1 && com == 3) || (you == 2 && com == 1) || (you == 3 && com == 1))
//				System.out.println("사용자가 이겼습니다.");
//			else if(you == com)
//				System.out.println("비겼습니다.");
//			else
//				System.out.println("컴퓨터가 이겼습니다.");
//			
//			System.out.println();
			
			//방법 2-1 : 메서드 이용
			System.out.print("컴퓨터 : " + print(com));
			System.out.print("사용자 : " + print(you));
			
			if((you == 가위 && com == 보) || (you == 바위 && com == 가위) || (you == 보 && com == 가위))
				System.out.println("사용자가 이겼습니다.");
			else if(you == com)
				System.out.println("비겼습니다.");
			else
				System.out.println("컴퓨터가 이겼습니다.");
			
			System.out.println();
			
			System.out.print("계속하시겠습니까? (y or n) : ");
			choice = sc.next();	//choice = y, n
			
			if(choice.equals("n") || choice.equals("N"))
				break;
			
			System.out.println();
		}
	}
	//2-1
	static public String print(int su) {
		String choice;
		
		if(su == 1) {
			choice = "가위";
		}
		else if(su == 2) {
			choice = "바위";
		}
		else if(su == 1) {
			choice = "보";
		}
		
		return choice;
	}

}
