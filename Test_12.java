
public class Test_12 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//향상된 for문 -> 배열에만
		int sum = 0;
		for(int i : arr) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);
	}

}
