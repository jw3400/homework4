package homework4;

import java.util.*;

public class MaxAndMin {
	public void question2() {
		
		System.out.println("### �ִ밪/�ּҰ����ϱ�  ###");
		Scanner input = new Scanner(System.in);

		String value = null;
		int max = 0;
		int min = 0;
		
		while(true)
		{
			System.out.print("0~100������ ���ڸ� �Է��ϼ���(Q:����) >>> ");						
			value = input.nextLine();
	
			if(value.equalsIgnoreCase("Q")) 
			{
				System.out.println("���� ū ���� " + max + "�̰�, ���� ���� ���� " + min + "�Դϴ�.");		
				break;	
			}
			
			if(!value.matches("^[0-9]*$"))		//���ڰ� �ƴ� �ٸ� ���� �Է��Ͽ��� ���� ����ǥ���� ���
			{
				System.out.println("���ڸ� �Է��ϼž� �մϴ�. �ٽ� �Է��Ͻʽÿ�.");
				continue;
			}
			
			int num = Integer.parseInt(value);		
								 
			if(num <0 || num >100)
			{
				System.out.println("0~100������ ���ڸ� �Է��ؾ��մϴ�. �ٽ� �Է��Ͻʽÿ�.");
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



