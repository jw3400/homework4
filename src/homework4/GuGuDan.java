package homework4;

import java.util.*;

public class GuGuDan {
	public void question4() {
		
		System.out.println("### 원하는 구구단 출력하기  ###");
		Scanner input = new Scanner(System.in);
		
		String value = null;
		
		while(true){
				System.out.print("출력하고 싶은 단(Q:종료) >>> ");
				value = input.nextLine();
				
				if(value.equalsIgnoreCase("Q")) 
				{
					System.out.println("종료합니다.");	
					System.exit(0);
				}
				
				if(!value.matches("^[0-9]*$"))		//숫자가 아닌 다른 것을 입력하였을 때의 정규표현식 사용
				{
					System.out.println("숫자를 입력하셔야 합니다. 다시 입력하십시오.");
					continue;
				}
				
				int num = Integer.parseInt(value);		
				if(!(num>=2 && num<=9))
				{
					System.out.println("잘못 입력하셨습니다. 2~9단까지 가능합니다.");
				}
				else
				{
					for(int i = 1; i<=9; i++)
					{
						if(i%2 == 1) 
						{
							System.out.print (num + " * " + i + " = " + num*i + "\t");		//곱하려는 수가 홀수일 때 Tab문자 적용  
						}
						else					
						System.out.println(num + " * " + i + " = " + num*i );					//곱하려는 수가 짝수일 때 줄바꿈을 적용
					}											
					System.exit(0);
				}
				input.close();
			}
			
	}
}
