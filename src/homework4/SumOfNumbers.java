package homework4;

import java.util.*;

public class SumOfNumbers {
	public void question1() {

		System.out.println("### 1���� �Է��� ������ ���ϱ� ###");
		Scanner su1 = new Scanner(System.in);
		System.out.print("������ ���� �Է��ϼ���(Q:����) >>> ");
					
		String answer1 = su1.nextLine();
		if(answer1.equalsIgnoreCase("Q")) 
			{
				System.out.println("�����մϴ�");
				System.exit(0);
			}
		
		int answer1_1 = Integer.parseInt(answer1);
		if(answer1_1 <= 0) 
		{
			System.out.println("0������ ���ڴ� �Է��� �� �����ϴ�.");
			System.exit(0);
		}
		
		cal(answer1_1);		 
		su1.close();
	}

	public int cal(int answer1_1) {
		
		int result1 = 0;
		
		for(int i=1; i <= answer1_1; i++) 
		{
			result1 += i;
		}
		System.out.println("�� ���� " + result1 + "�Դϴ�.");
		return result1;
	
	}
}
