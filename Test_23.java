import java.util.Scanner;

public class Test_23 {

	public static void main(String[] args) {
		// 7개의 정수값을 키보드로부터 입력 받아, 배열에 넣고
		// 원본 데이터 및 배열 안의 최대값과 최소값을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int [7];
		int max = 0, min = 0;
		
		System.out.print("7개의 정수 입력 : ");
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a.length; i++) {
			if (i == 0) {
				max = a[0];
				min = a[0];
			}
			if(a[i] > max) max = a[i];
			else if (a[i] < min) min = a[i];
		}
		
		System.out.println("최대값 : " + max + ", 최소값 : " + min);

	}

}
