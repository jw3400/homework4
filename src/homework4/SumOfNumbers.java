package homework4;

import java.util.*;

public class SumOfNumbers {
	public void question1() {

		System.out.println("### 1부터 입력한 수까지 더하기 ###");
		Scanner su1 = new Scanner(System.in);
		
		while(true) {
			
		System.out.print("마지막 수를 입력하세요(Q:종료) >>> ");	
		String answer1 = su1.nextLine();
		
		
		if(answer1.equalsIgnoreCase("Q")) 
		{
				System.out.println("종료합니다");
				System.exit(0);
		}
		
		if(!answer1.matches("^[0-9]*$"))		//숫자가 아닌 다른 것을 입력하였을 때의 정규표현식 사용
		{
			System.out.println("정수를 입력하셔야 합니다. 다시 입력하십시오");
			continue;
		}
		
		int answer1_1 = Integer.parseInt(answer1);
		cal(answer1_1);
		break;
		
		}
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