import java.util.Scanner;

public class WorldCup {

   public static void main(String[] args) {
//      // 방법 1 : 새로운 배열을 생성
//      String one[] = {"1", "2", "3", "4", "5", "6", "7", "8"};
//      String two[] = new String[4];
//      String three[] = new String[2];
//      String final_choice = null;
//      Scanner scan = new Scanner(System.in);
//      int c = 0, d = 0;
//      
//      //8강
//      for(int i = 0; i<one.length; i+=2) { // 0 2 4 6
//         System.out.println("당신의 선택은? ");
//         System.out.println("1번\t"+one[i]+"\t\t"+"2번\t"+one[i+1]);
//         int choice = scan.nextInt();
//         
//         if(choice==1) {
//            two[c] = one[i];
//            c++;
//         }
//         else if(choice==2) {
//            two[c] = one[i+1];
//            c++;
//         }
//         else {
//            System.out.println("1 또는 2만 입력해주세요..");
//            System.out.println();
//            i-=2;
//            continue;
//         }
//      }
//         
//         //중간값 확인
////         for(int i = 0; i<two.length; i++) {
////            System.out.println(two[i]+"   ");
////         }
////         System.out.println();
//      
//      //4강
//      for(int i = 0; i<two.length; i+=2) { // 0 2
//         System.out.println("당신의 선택은? ");
//         System.out.println("1번\t"+two[i]+"\t\t"+"2번\t"+two[i+1]);
//         int choice = scan.nextInt();
//         
//         if(choice==1) {
//            three[d] = two[i];
//            d++;
//         }
//         else if(choice==2) {
//            three[d] = two[i+1];
//            d++;
//         }
//         else {
//            System.out.println("1 또는 2만 입력해주세요..");
//            System.out.println();
//            i-=2;
//            continue;
//         }
//      }
//      
//      for(int i = 0; i<two.length; i++) {
//         System.out.println(two[i]+"   ");
//      }
//      System.out.println();
//      
//      //결승
//      for(int i = 0; i<three.length; i+=2) { // 0
//         System.out.println("당신의 선택은? ");
//         System.out.println("1번\t"+three[i]+"\t\t"+"2번\t"+three[i+1]);
//         int choice = scan.nextInt();
//         
//         if(choice==1) {
//            final_choice = three[i];
//         }
//         else if(choice==2) {
//            final_choice = three[i+1];
//         }
//         else {
//            System.out.println("1 또는 2만 입력해주세요..");
//            System.out.println();
//            i-=2;
//            continue;
//         }
//      }
//      
//      System.out.println("당신의 최종 선택은 "+final_choice+"입니다.");
      
      //방법2
//      String one[] = {"1", "2", "3", "4", "5", "6", "7", "8"};
//      Scanner scan = new Scanner(System.in);
//      String final_choice = null;
//      
//      for(int i = 0; i<one.length; i+=2) { // 0 2 4 6
//         System.out.println("당신의 선택은? ");
//         System.out.println("1번\t"+one[i]+"\t\t"+"2번\t"+one[i+1]);
//         int choice = scan.nextInt();
//         
//         if(choice==1) {
//            one[i+1] = one[i];
//         }
//         else if(choice==2) {
//            one[i] = one[i+1];
//         }
//         else {
//            System.out.println("1 또는 2만 입력해주세요..");
//            System.out.println();
//            i-=2;
//            continue;
//         }
//      }
//      
//      for(int i = 0; i<one.length; i+=4) { // 0 4
//         System.out.println("당신의 선택은? ");
//         System.out.println("1번\t"+one[i]+"\t\t"+"2번\t"+one[i+2]);
//         int choice = scan.nextInt();
//         
//         if(choice==1) {
//            one[i] = one[i];
//         }
//         else if(choice==2) {
//            one[i] = one[i+2];
//         }
//         else {
//            System.out.println("1 또는 2만 입력해주세요..");
//            System.out.println();
//            i-=2;
//            continue;
//         }
//      }
//      
//      for(int i = 0; i <one.length; i++) {
//    	  System.out.print(one[i] + "    ");
//      }
//      System.out.println();
//      System.out.println();
//      System.out.println("최종 선택은 " + one[0] + "입니다.");
      
      //방법 3 : 배열 및 반복문 한 번만 사용하기
	   String one[] = {"이우연", "송민호", "강승윤", "이승훈", "김진우", "매튜", "모건형", "일레이"};
	   Scanner sc = new Scanner(System.in);
	   String final_choice = null;
	   int length = one.length;		//length = 8;
	   int choice;
	   
	   for(int i = 0; i < 3; i++) {
		   System.out.println("당신의 선택은?");
		   for(int j = 0, x = 0; j < length; j +=2, x++) {
			   System.out.println((j+1) + "번 " + one[j] + "\t\t" + (j+2) + "번 " + one[j+1]);
			   choice = sc.nextInt();
			   
			   if(choice == (j+1) || choice == (j+2)) {
				   one[x] = one[choice-1];
			   }
			  else {
				  System.out.println("잘못 입력하셨군요...." + (j+1) + " 또는 " + (j+2) + "만 입력해주세요...");
				  System.out.println();
				  j -= 2;
				  x -= 1;
				  continue;
			   }
		   }
		   
		   for(int k = 0; k < one.length; k++) {
			   System.out.print(one[k] + "\t");
		   }
		   length = length / 2;
	   }
	   System.out.println();
	   System.out.println("당신의 이상형은 " + one[0] + "입니다.");
   }

}
