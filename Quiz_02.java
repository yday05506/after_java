
public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt = 0;
		
		for(int i = 1000; i <= 9999; i++) {
			int a = (i / 100 % 10);
			int b = (i % 100 / 10);
			if(a == b && i % 9 == 0) {
				System.out.print(i + "\t");
				cnt++;
				if(cnt % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("총 갯수 : "+cnt);
	}

}
