package homework4;

import java.util.Scanner;

public class MaxAndMin {
	public void question2() {
		

		System.out.println("### 최대값/최소값구하기  ###");
		Scanner input = new Scanner(System.in);

		String value = "";
		int num = 0;
		
		while(true)
		{
				System.out.print("0~100사이의 숫자를 입력하세요(종료:Q) >>> ");						
				value = input.nextLine();
				input.close();
				num = Integer.parseInt(value);		
		
				if(input.equals("Q") || input.equals("q")) 
				{
					break;	
				}
				
				else if(Integer.parseInt(input.nextLine())<0 && Integer.parseInt(input.nextLine())>100)
				{
					System.out.println("0~100사이의 숫자를 입력해야합니다. 다시 입력하십시오.");
					continue;
				}
				 
				else
				 {
					 System.out.println("0~100사이의 숫자 이외의 것을 입력하셨습니다. 다시 입력하십시오.");
					 continue;
				 }
		}	 
		cal(num);
										 	
		
	public void cal(int num) {
		
	}
		
		
		

		
	
	}
}



