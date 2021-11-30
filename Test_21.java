import java.util.Scanner;

public class Test_21 {

	public static void main(String[] args) {
		//10명의 학생의 수학점수를 입력 받아, 배열에 넣은 후
		//반복문을 이용하여 전체 총점과 평균을 구하고자 한다.
		
//		int scores[] = new int[10];
//		int sum = 0;
//		double avg = 0.0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 0; i < scores.length; i++) {
//			System.out.print((i+1) + "번 학생의 수학 점수 입력 : ");
//			scores[i] = sc.nextInt();
//			sum += scores[i];
//		}
//		
//		System.out.println();
//		System.out.println("전체 총점 : " + sum);
//		System.out.println("전체 평균 : " + (double)sum / scores.length);
		
		
		int su;
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요 : ");
		su = sc.nextInt();	//su = 3
		
		String name[] = new String[su];
		int score[][] = new int[su][5];
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < su; i++) {
			System.out.print((i+1) + "번 이름 : ");
			name[i] = sc.next();
			
			System.out.print("국어 : ");
			score[i][0] = sc.nextInt();
			
			System.out.print("영어 : ");
			score[i][1] = sc.nextInt();
			
			System.out.print("수학 : ");
			score[i][2] = sc.nextInt();
			
			score[i][3] = score[i][0] + score[i][1] + score[i][2];
			score[i][4] = (int)(score[i][3] / 3);
			
			sum+=score[i][3];
			avg = (double)sum/score.length;
		}
		
		System.out.println();
		System.out.println("==============================================");
		System.out.println("이름 \t국어\t영어\t수학\t총점\t평균\t");
		System.out.println("==============================================");
		
		for(int i= 0; i < name.length; i++) {
			System.out.print(name[i]+ "\t");
			for(int j = 0; j < 5; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("==============================================");
		System.out.println("전체 총점 : " + sum);
		System.out.print("전체 평균 : " + avg);
	}

}
