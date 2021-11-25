
public class Test_17 {

	public static void main(String[] args) {
		//배열의 3단계 : 1. 선언, 2. 생성, 3. 초기화
		
		//1단계 : 선언
//		int score[];
		
		//2단계 : 생성
//		score = new int[5];
		
		//3단계 : 초기화
//		score[0] = 10;
//		score[1] = 20;
//		score[2] = 30;
//		score[3] = 40;
//		score[4] = 50;
		
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		System.out.println(score[4]);
		
//		for(int i = 0; i < score.length; i++) {
//			System.out.println(score[i]);
//		}
		
		//향상된 for문 - 배열을 사용할 때만 가능
//		for(int su : score) {
//			System.out.println(su);
//		}
		
		
		//배열 2단계 : 1. 선언 & 생성, 2. 초기화
		
		//1단계 : 선언 & 생성
//		int score[] = new int[5];
//		
//		//2단계 : 초기화
//		score[0] = 10;
//		score[1] = 20;
//		score[2] = 30;
//		score[3] = 40;
//		score[4] = 50;
		
		
		//배열 3단계 : 1. 선언 & 생성 & 초기화
//		int score[] = {10, 20, 30, 40, 50};
		
		
		int sum = 0;
		float average = 0.0f;
		int score[] = {100, 99, 98, 97, 100};
		
		for(int i = 0; i < score.length; i++) {
//			System.out.println(score[i]);
			sum += score[i];
		}
		
		System.out.println("총점 : " + sum);
		average = (float)sum / score.length;
		System.out.println("평균 : " + average);
	}

}
