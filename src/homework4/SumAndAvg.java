package homework4;

import java.util.*;

public class SumAndAvg {
	public void question3() {
	
		System.out.println("### �Է¹��� ������ �հ�� ��� ���ϱ� ###");
		Scanner input = new Scanner(System.in);
		
		String value = null;
		int sum = 0;
		double avg = 0;
		double avg2 = 0;
		int count = 0;
		
		while(true){
			System.out.print("���ڸ� �Է�(Q:����) >>> ");
			value = input.nextLine();
			
			if(value.equalsIgnoreCase("Q")) 
			{
				System.out.println("�հ�� " + sum + "�̰�, ����� " + avg2 + "�Դϴ�.");		
				break;	
			}
			
			if(!value.matches("^[0-9]*$"))		//���ڰ� �ƴ� �ٸ� ���� �Է��Ͽ��� ���� ����ǥ���� ���
			{
				System.out.println("���ڸ� �Է��ϼž� �մϴ�. �ٽ� �Է��Ͻʽÿ�.");
				continue;
			}
			
			int num = Integer.parseInt(value);	
			sum += num;
			count++;		//�Է��� ������ ���� ��� count�� �ؼ� ������Ų��. -> ���߿� ��� ����� �ϱ� ���ؼ� ���	
			avg = sum / count;
			avg2 = Double.parseDouble(String.format("%.2f",avg));		//avg�� ���� �Ҽ��� ��°¥������ ǥ���ϱ� ���� ���
			
		}
		input.close();
		
	}
}
