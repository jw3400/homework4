package homework4;

import java.util.Scanner;

public class MaxAndMin {
	public void question2() {
		

		System.out.println("### �ִ밪/�ּҰ����ϱ�  ###");
		Scanner input = new Scanner(System.in);

		String size = null; 
		System.out.print("���Ͻô� �迭�� ũ�⸦ �Է��ϼ��� : ");
		size = input.nextLine();
		 if(Integer.parseInt(size) < 2) {
			System.out.print("�迭�� ũ��� �ּ� 2�̻��̾�� �մϴ�.");
			System.exit(0);
			} 
		String[] answer2 = new String[Integer.parseInt(size)];
		
		for(int i=0; i < answer2.length; i++)
		{
				System.out.print("0~100������ ���ڸ� �Է��ϼ���(����:Q) >>> ");						
				answer2[i] = input.nextLine();
				
				 if(input.equals("Q") ||input.equals("q")) 
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
		System.out.println("���� ū ���� " + max_num + " �̰�, ���� ���� ���� " + min_num + " �Դϴ�!");
		
		
	}
}
