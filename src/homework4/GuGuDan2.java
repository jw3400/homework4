package homework4;

import java.util.*;

public class GuGuDan2 {
	public void question5() {
		
		System.out.println("### ¬¶ºˆ¥‹ »¶ºˆ¥‹ √‚∑¬«œ±‚  ###");
		Scanner input = new Scanner(System.in);
		
		String value = null;
		
		while(true){
				System.out.print("E:¬¶ºˆ¥‹, O:»¶ºˆ¥‹(Q:¡æ∑·) >>> ");
				value = input.nextLine();
				
				if(value.equalsIgnoreCase("Q")) 
				{
					System.out.println("¡æ∑·«’¥œ¥Ÿ.");	
					System.exit(0);
				}

				
				if(value.equalsIgnoreCase("E")) 
				{
					for(int i = 1; i<=9; i++)
					{
						for(int j = 2; j<=9; j+=2)
						{
							System.out.print(j + " * " + i + " = " + i*j + "\t"); 	//∞ˆ«œ∑¡¥¬ ºˆ 1~9±Ó¡ˆ∏¶  tab≈∞∏¶ ¥≠∑Øº≠ π›∫π ºˆ«‡
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
							System.out.print(j + " * " + i + " = " + i*j + "\t");	//∞ˆ«œ∑¡¥¬ ºˆ 1~9±Ó¡ˆ∏¶  tab≈∞∏¶ ¥≠∑Øº≠ π›∫π ºˆ«‡
						}				
						System.out.println();
					}					
					System.exit(0);
				}
				
				else
				if(value.matches("^[a-zA-Z0-9∞°-∆R]*$"))		//øµπÆ¿⁄, «—±€, º˝¿⁄∏¶ ¿‘∑¬«œø¥¿ª ∂ß¿« ¡§±‘«•«ˆΩƒ ªÁøÎ
				{
					System.out.println("¥ŸΩ√ ¿‘∑¬«œΩ Ω√ø¿.");
					continue;
				}
				input.close();
			}
		
	}
}
