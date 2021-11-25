
public class Test_18 {

	public static void main(String[] args) {
		int score[] = {79, 88, 91, 33, 100, 55, 95};
		
//		int max = 0;
//		int min = 0;
//		
//		for(int i = 0; i < score.length; i++) {
//			if (i == 0) {
//				max = score[i];
//				min = score[i];
//			}
//			if(score[i] > max) max = score[i];
//			if(score[i] < min) min = score[i];
//		}
//		
//		System.out.println("최댓값 : " + max);
//		System.out.println("최솟값 : " + min);
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i < score.length; i++) {
			if(score[i] > max) 
				max = score[i];
			if(score[i] < min)
				min = score[i];
		}
	}

}
