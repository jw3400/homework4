package homework4;

import java.util.*;

public class SumOfNumbers {
	public void question1() {

		System.out.println("### 1���� �Է��� ������ ���ϱ� ###");
		Scanner su1 = new Scanner(System.in);
		
		while(true) {
			
		System.out.print("������ ���� �Է��ϼ���(Q:����) >>> ");	
		String answer1 = su1.nextLine();
		
		
		if(answer1.equalsIgnoreCase("Q")) 
		{
				System.out.println("�����մϴ�");
				System.exit(0);
		}
		
		if(!answer1.matches("^[0-9]*$"))		//���ڰ� �ƴ� �ٸ� ���� �Է��Ͽ��� ���� ����ǥ���� ���
		{
			System.out.println("������ �Է��ϼž� �մϴ�. �ٽ� �Է��Ͻʽÿ�");
			continue;
		}
		
		int answer1_1 = Integer.parseInt(answer1);
		cal(answer1_1);
		break;
		
		}
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
