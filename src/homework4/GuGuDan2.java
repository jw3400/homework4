package homework4;

import java.util.*;

public class GuGuDan2 {
	public void question5() {
		
		System.out.println("### ¦���� Ȧ���� ����ϱ�  ###");
		Scanner input = new Scanner(System.in);
		
		String value = null;
		
		while(true){
				System.out.print("E:¦����, O:Ȧ����(Q:����) >>> ");
				value = input.nextLine();
				
				if(value.equalsIgnoreCase("Q")) 
				{
					System.out.println("�����մϴ�.");	
					System.exit(0);
				}

				
				if(value.equalsIgnoreCase("E")) 
				{
					for(int i = 1; i<=9; i++)
					{
						for(int j = 2; j<=9; j+=2)
						{
							System.out.print(j + " * " + i + " = " + i*j + "\t"); 	//���Ϸ��� �� 1~9������  tabŰ�� ������ �ݺ� ����
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
							System.out.print(j + " * " + i + " = " + i*j + "\t");	//���Ϸ��� �� 1~9������  tabŰ�� ������ �ݺ� ����
						}				
						System.out.println();
					}					
					System.exit(0);
				}
				
				else
				if(value.matches("^[a-zA-Z0-9��-�R]*$"))		//������, �ѱ�, ���ڸ� �Է��Ͽ��� ���� ����ǥ���� ���
				{
					System.out.println("�ٽ� �Է��Ͻʽÿ�.");
					continue;
				}
				input.close();
			}
		
	}
}
