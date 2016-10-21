package homework4;

import java.util.Scanner;

public class ExamForWhile {

		
	public static void main(String[] args) {
		
		System.out.println("******************************************");
		System.out.println("               반복문 연습하기1                    ");
		System.out.println("******************************************");
		System.out.println("    1.  1부터 입력한 수까지 더하기 ");
		System.out.println("    2.  최대값/최소값 구하기");
		System.out.println("    3.  입력받은 숫자의 합계와 평균 구하기");
		System.out.println("    4.  원하는 구구단 출력하기");
		System.out.println("    5.  짝수단/홀수단 출력하기");
		System.out.println("    6.  종료하기");
		
		new ExamForWhile().input();

	}
	
	public void input () {
		
		Scanner su = new Scanner(System.in);
		System.out.print("\n");
		
		while(true) {
			System.out.print("원하는 메뉴는 무엇입니까? >>> ");
			String select = su.nextLine();
 		
				if(!select.matches("^[0-9]*$"))		//숫자가 아닌 다른 것을 입력하였을 때의 정규표현식 사용
				{
					System.out.println("숫자를 입력하셔야 합니다. 다시 입력하십시오.");
					continue;
				}

				int num = Integer.parseInt(select);
				if(num == 1) {
		 			System.out.println("1번 호출");
				    SumOfNumbers cal1 = new SumOfNumbers();
				    cal1.question1();
				    break;
		 		}
			
		 		else if(num == 2) {
		 			System.out.println("2번 호출");
		 			MaxAndMin cal2 = new MaxAndMin();
		 			cal2.question2();
		 			break;
		 		}
			
		 		else if(num == 3) {
		 			System.out.println("3번 호출");
		 			SumAndAvg cal3 = new SumAndAvg(); 
		 			cal3.question3();
		 			break;
		 		}
			
		 		else if(num == 4) {
		 			System.out.println("4번 호출");
		 			GuGuDan cal4 = new GuGuDan(); 
		 			cal4.question4();
		 			break;
		 		}
			
		 		else if(num == 5) {
		 			System.out.println("5번 호출");
		 			GuGuDan2 cal5 = new GuGuDan2(); 
		 			cal5.question5();
		 			break;
		 		}
			
		 		else if(num == 6) {  
		 			System.out.println("6번 호출-종료");
		 			System.exit(0);
		 		}
				
		 		else
		 			System.out.println("1~6번 사이에 입력하셔야 합니다. 다시 입력하십시오.");
					continue;
							
		}
		su.close(); 
	}
 	
}