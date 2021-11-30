
public class Test_20 {

	public static void main(String[] args) {
		
//		//1. 선언
//		int table[][];
//		
//		//2. 생성
//		table = new int[3][4];
//		
//		//3. 초기화
//		table[0][0] = 10;
//		table[1][1] = 20;
//		table[2][3] = table[0][0] + table[1][1];
		
		
//		//1. 선언 & 생성
//		int table[][] = new int[3][4];
//		
//		//2. 초기화
//		table[0][0] = 10;
//		table[1][1] = 20;
//		table[2][3] = table[0][0] + table[1][1];
		
		
		//1. 선언 & 생성 & 초기화
		int table[][] = { {1, 2}, {3, 4, 5}, {6, 7, 8, 9} };
		
		
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table[i].length; j++) {
				if(table[i][j] == 0)
					System.out.print("\t");
				else
					System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
