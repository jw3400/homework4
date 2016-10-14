import java.util.*;

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


class SumofNumbers {
	
	public void question1() {

			System.out.println("### 1부터 입력한 수까지 더하기 ###");
			Scanner su1 = new Scanner(System.in);
			System.out.print("마지막 수를 입력하세요(Q:종료) >>> ");
						
			String answer1 = su1.nextLine();
			if(answer1.equals("Q") || answer1.equals("q")) 
				{
					System.out.println("종료합니다");
					System.exit(0);
				}
			
			int answer1_1 = Integer.parseInt(answer1);
			cal(answer1_1);
			
			su1.close();
		}

		public int cal(int answer1_1) {
			
			int result1 = 0;
			for(int i=1; i <= answer1_1; i++) 
			{
				result1 += i;
			}
			System.out.println("총 합은 " + result1 + "입니다.");
			return result1;
		
		}
}

class MaxAndMin {
	
	public void question2() {
		

			System.out.println("### 최대값/최소값구하기  ###");
			Scanner input = new Scanner(System.in);

			int size; 
			System.out.print("원하시는 배열의 크기를 입력하세요 : ");
			size = input.nextInt();
			if(size < 2) {
				System.out.print("배열의 크기는 최소 2이상이어야 합니다.");
				System.exit(0);
				}
			int[] answer2 = new int[size];
			
			for(int i=0; i < answer2.length; i++)
			{
					System.out.print("0~100사이의 숫자를 입력하세요(종료:Q) >>> ");						
					answer2[i] = input.nextInt();
					
					if(answer2[i]<0 && answer2[i]>100)
					{
						System.out.println("0~100사이의 숫자를 입력해야합니다. 다시 입력하십시오.");
					}

					 if(String.valueOf(answer2[i]).equals("Q") ||String.valueOf( answer2[i]).equals("q")) 
					{
						cal2(answer2);
						break;	
					}
			}		
			input.close();
		
	}
	
		public void cal2(int answer2[]) {
			
			
			int max_num, min_num, tmp;
			for(int i=0; i<answer2.length; i++)
			{
				for(int j=0; j<answer2.length-1; j++)
				{
					if(answer2[j] > answer2[j+1]) {
							tmp = answer2[j];
							answer2[j] = answer2[j+1];
							answer2[j+1] = tmp;
					}
				}
					
			}
			max_num = answer2[answer2.length-1];
			min_num = answer2[0];
			System.out.println("가장 큰 수는 " + max_num + " 이고, 가장 작은 수는 " + min_num + " 입니다!");
			
			
		}
	
}

class SumAndAvg {
	
	public void question3() {
		
	}
}

class  GuGuDan {
	
	public void question4() {
		
	}
}

class GuGuDan2 {
	
	public void question5() {
		
	}
	
}