package homework4;

import java.util.*;

public class GuGuDan2 {
	public void question5() {
		
		System.out.println("### 짝수단 홀수단 출력하기  ###");
		Scanner input = new Scanner(System.in);
		
		String value = null;
		
		while(true){
				System.out.print("E:짝수단, O:홀수단(Q:종료) >>> ");
				value = input.nextLine();
				
				if(value.equalsIgnoreCase("Q")) 
				{
					System.out.println("종료합니다.");	
					System.exit(0);
				}

				
				if(value.equalsIgnoreCase("E")) 
				{
					for(int i = 1; i<=9; i++)
					{
						for(int j = 2; j<=9; j+=2)
						{
							System.out.print(j + " * " + i + " = " + i*j + "\t"); 	//곱하려는 수 1~9까지를  tab키를 눌러서 반복 수행
						}				
						System.out.println();
					}					
					System.exit(0);
				}
				
				else if(value.equalsIgnoreCase("O")) 
				{
					for(int i = 1; i<=9; i++)
					{
						for(int j = 3; j<=9; j+=2)
						{
							System.out.print(j + " * " + i + " = " + i*j + "\t");	//곱하려는 수 1~9까지를  tab키를 눌러서 반복 수행
						}				
						System.out.println();
					}					
					System.exit(0);
				}
				
				else
				if(value.matches("^[a-zA-Z0-9가-R]*$"))		//영문자, 한글, 숫자를 입력하였을 때의 정규표현식 사용
				{
					System.out.println("다시 입력하십시오.");
					continue;
				}
				input.close();
			}
		
	}
}