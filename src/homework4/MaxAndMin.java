package homework4;

import java.util.Scanner;

public class MaxAndMin {
	public void question2() {
		

		System.out.println("### �ִ밪/�ּҰ����ϱ�  ###");
		Scanner input = new Scanner(System.in);

		String value = "";
		int num = 0;
		
		while(true)
		{
				System.out.print("0~100������ ���ڸ� �Է��ϼ���(����:Q) >>> ");						
				value = input.nextLine();
				input.close();
				num = Integer.parseInt(value);		
		
				if(input.equals("Q") || input.equals("q")) 
				{
					break;	
				}
				
				else if(Integer.parseInt(input.nextLine())<0 && Integer.parseInt(input.nextLine())>100)
				{
					System.out.println("0~100������ ���ڸ� �Է��ؾ��մϴ�. �ٽ� �Է��Ͻʽÿ�.");
					continue;
				}
				 
				else
				 {
					 System.out.println("0~100������ ���� �̿��� ���� �Է��ϼ̽��ϴ�. �ٽ� �Է��Ͻʽÿ�.");
					 continue;
				 }
		}	 
		cal(num);
										 	
		
	public void cal(int num) {
		
	}
		
		
		

		
	
	}
}



