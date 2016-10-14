package homework4;

import java.util.Scanner;

public class SumOfNumbers {
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
