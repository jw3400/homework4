package homework4;

import java.util.*;

public class MaxAndMin {
	public void question2() {
		
		System.out.println("### 최대값/최소값구하기  ###");
		Scanner input = new Scanner(System.in);

		String value = null;
		int max = 0;
		int min = 0;
		
		while(true)
		{
			System.out.print("0~100사이의 숫자를 입력하세요(Q:종료) >>> ");						
			value = input.nextLine();
	
			if(value.equalsIgnoreCase("Q")) 
			{
				System.out.println("가장 큰 수는 " + max + "이고, 가장 작은 수는 " + min + "입니다.");		
				break;	
			}
			
			if(!value.matches("^[0-9]*$"))		//숫자가 아닌 다른 것을 입력하였을 때의 정규표현식 사용
			{
				System.out.println("숫자를 입력하셔야 합니다. 다시 입력하십시오.");
				continue;
			}
			
			int num = Integer.parseInt(value);		
								 
			if(num <0 || num >100)
			{
				System.out.println("0~100사이의 숫자를 입력해야합니다. 다시 입력하십시오.");
				continue;
			}
			

				
			if(max==0 && min==0)
			{
				max = num;
				min = num;
			}
						
			if(num > max){	max = num;  }
			else if(num < min) { min = num; }
				
		}	 											
		input.close();
		
	}


}



