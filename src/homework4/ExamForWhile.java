package homework4;

import java.util.Scanner;

public class ExamForWhile {

		
	public static void main(String[] args) {
		
		System.out.println("*************************************");
		System.out.println("                       반복문 연습하기1                             ");
		System.out.println("*************************************");
		System.out.println("    1.  1부터 입력한 수까지 더하기 ");
		System.out.println("    2.  최대값/최소값 구하기");
		System.out.println("    3.  입력받은 숫자의 합계와 평균 구하기");
		System.out.println("    4   원하는 구구단 출력하기");
		System.out.println("    5.  짝수단/홀수단 출력하기");
		System.out.println("    6.  종료하기");
		
		new ExamForWhile().input();

	}
	
	public void input () {
		
		Scanner su = new Scanner(System.in);
		System.out.print("\n");
		System.out.print("원하는 메뉴는  무엇입니까? >>> ");
		int select = su.nextInt();
		count(select);
		su.close(); 
		
	}
	
	 public void count(int select) {

		 		if(select == 1) {
		 			System.out.print("1번 호출");
				    SumofNumbers cal1 = new SumofNumbers();
				    cal1.question1();
		 		}
			
		 		else if(select == 2) {
		 			System.out.print("2번 호출");
		 			MaxAndMin cal2 = new MaxAndMin();
		 			cal2.question2();
		 		}
			
		 		else if(select == 3) {
		 			System.out.print("3번 호출");
		 			SumAndAvg cal3 = new SumAndAvg(); 
		 			cal3.question3();
		 		}
			
		 		else if(select == 4) {
		 			System.out.print("4번 호출");
		 			GuGuDan cal4 = new GuGuDan(); 
		 			cal4.question4();
		 		}
			
		 		else if(select ==5) {
		 			System.out.print("5번 호출");
		 			GuGuDan2 cal5 = new GuGuDan2(); 
		 			cal5.question5();
		 		}
			
		 		else if(select ==6) {  
		 			System.out.print("6번 호출-종료");
		 			System.exit(0);
		 		}
		 		
		 		else
		 			System.out.println("1~6까지의 해당 번호만 입력할 수 있습니다. 다시 입력하십시오.");
		 			System.exit(select);
	 }
		 	
		 	
}