package homework4;

import java.util.Scanner;

public class MaxAndMin {
	public void question2() {
		

		System.out.println("### 최대값/최소값구하기  ###");
		Scanner input = new Scanner(System.in);

		String size = null; 
		System.out.print("원하시는 배열의 크기를 입력하세요 : ");
		size = input.nextLine();
		 if(Integer.parseInt(size) < 2) {
			System.out.print("배열의 크기는 최소 2이상이어야 합니다.");
			System.exit(0);
			} 
		String[] answer2 = new String[Integer.parseInt(size)];
		
		for(int i=0; i < answer2.length; i++)
		{
				System.out.print("0~100사이의 숫자를 입력하세요(종료:Q) >>> ");						
				answer2[i] = input.nextLine();
				
				 if(input.equals("Q") ||input.equals("q")) 
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
		cal2(answer2);
		input.close();
	
}

	public void cal2(String answer2[]) {
		
		int [] answer2_1 = new int[answer2.length];
		for(int a=0; a<answer2.length; a++)
		{
			answer2_1[a] = Integer.parseInt(answer2[a]);
		}
		
		int max_num, min_num, tmp;
		for(int i=0; i<answer2.length; i++)
		{
			for(int j=0; j<answer2.length-1; j++)
			{
				if(answer2_1[j] > answer2_1[j+1]) {
						tmp = answer2_1[j];
						answer2_1[j] = answer2_1[j+1];
						answer2_1[j+1] = tmp;
				}
			}
				
		}
		max_num = answer2_1[answer2_1.length-1];
		min_num = answer2_1[0];
		System.out.println("가장 큰 수는 " + max_num + " 이고, 가장 작은 수는 " + min_num + " 입니다!");
		
		
	}
}
