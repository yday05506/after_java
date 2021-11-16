import java.util.Scanner;

public class RSP_123 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int scissor = 1;
		int rock = 2;
		int paper = 3;
		
		System.out.print("가위바위보 입력(1 : 가위, 2 : 바위, 3 : 보) : ");
		int me = sc.nextInt();
		System.out.println();
		
		while(true) {
			//컴퓨터의 값
			int com = (int)(Math.random() * 3) + 1;
			
			//잘못 입력했을 경우
			if(me > 4 || me < 0) {
				System.out.print("1 ~ 3 중에서 하나만 입력 : ");
				me = sc.nextInt();
			}
			
			//컴퓨터와 비긴 경우
			else if (com == me) {
				System.out.println("비겼습니다.");
				System.out.print("다시 하시겠습니까?(yes 또는 no를 입력해주세요) : ");
				char answer = sc.next().charAt(0);
				System.out.print("가위바위보 입력 : ");
				if(answer == 'y') me = sc.nextInt();
				else if (answer == 'n') break;
				else if (me > 4 || me < 0) {
					System.out.print("1 ~ 3 중에서 하나만 입력 : ");
					me = sc.nextInt();
				}
			}
			
			//내가 이긴 경우
			else if (com == 1 && me == 2) {
				System.out.println("이겼습니다. 수고하셨습니다.");
				break;
			}
			else if (com == 2 && me == 3) {
				System.out.println("이겼습니다. 수고하셨습니다.");
				break;
			}
			else if (com == 3 && me == 1) {
				System.out.println("이겼습니다. 수고하셨습니다.");
				break;
			}
			
			//컴퓨터가 이긴 경우
			else if (com == 1 && me == 3) {
				System.out.println("졌습니다.");
				System.out.print("다시 하시겠습니까?(yes 또는 no를 입력해주세요) : ");
				char answer = sc.next().charAt(0);
				System.out.print("가위바위보 입력 : ");
				if(answer == 'y') me = sc.nextInt();
				else if(answer == 'n') break;
				else if(me > 4 || me < 0) {
					System.out.print("1 ~ 3 중에서 하나만 입력 : ");
					me = sc.nextInt();
				}
				System.out.println();
			}
			else if (com == 2 && me == 1) {
				System.out.println("졌습니다.");
				System.out.print("다시 하시겠습니까?(yes 또는 no를 입력해주세요) : ");
				char answer = sc.next().charAt(0);
				System.out.print("가위바위보 입력 : ");
				if(answer == 'y') me = sc.nextInt();
				else if(answer == 'n') break;
				else if(me > 4 || me < 0) {
					System.out.print("1 ~ 3 중에서 하나만 입력 : ");
					me = sc.nextInt();
				}
				System.out.println();
			}
			else if (com == 3 && com == 2) {
				System.out.println("졌습니다.");
				System.out.print("다시 하시겠습니까?(yes 또는 no를 입력해주세요) : ");
				char answer = sc.next().charAt(0);
				System.out.print("가위바위보 입력 : ");
				if(answer == 'y') me = sc.nextInt();
				else if(answer == 'n') break;
				else if(me > 4 || me < 0) {
					System.out.print("1 ~ 3 중에서 하나만 입력 : ");
					me = sc.nextInt();
				}
				System.out.println();
			}
		}

	}

}
