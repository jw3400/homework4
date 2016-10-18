package homework4;

import java.util.*;

public class GuGuDan {
	public void question4() {
		
		System.out.println("### ���ϴ� ������ ����ϱ�  ###");
		Scanner input = new Scanner(System.in);
		
		String value = null;
		
		while(true){
				System.out.print("����ϰ� ���� ��(Q:����) >>> ");
				value = input.nextLine();
				
				if(value.equalsIgnoreCase("Q")) 
				{
					System.out.println("�����մϴ�.");	
					System.exit(0);
				}
				
				if(!value.matches("^[0-9]*$"))		//���ڰ� �ƴ� �ٸ� ���� �Է��Ͽ��� ���� ����ǥ���� ���
				{
					System.out.println("���ڸ� �Է��ϼž� �մϴ�. �ٽ� �Է��Ͻʽÿ�.");
					continue;
				}
				
				int num = Integer.parseInt(value);		
				if(!(num>=2 && num<=9))
				{
					System.out.println("�߸� �Է��ϼ̽��ϴ�. 2~9�ܱ��� �����մϴ�.");
				}
				else
				{
					for(int i = 1; i<=9; i++)
					{
						if(i%2 == 1) 
						{
							System.out.print (num + " * " + i + " = " + num*i + "\t");		//���Ϸ��� ���� Ȧ���� �� Tab���� ���� 
						}
						else					
						System.out.println(num + " * " + i + " = " + num*i );					//���Ϸ��� ���� ¦���� �� �ٹٲ��� ����
					}											
					System.exit(0);
				}
				input.close();
			}
			
	}
}
