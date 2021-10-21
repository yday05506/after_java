
public class Quiz_04 {

	public static void main(String[] args) {
		// 두 개의 주사위를 던졌을 때, 합이 6이 되는 모든 경우의 수를 출력하시오.
		// 또한 몇 회인지 횟수도 출력하시오,.
		int cnt = 0;
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					cnt++;
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
		
		System.out.println("모든 경우의 수는 총 " + cnt + "회입니다.");

	}

}
