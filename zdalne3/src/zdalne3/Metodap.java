package zdalne3;

import java.util.Scanner;

public class Metodap {

	int strona1;
	int strona2;
	
	public Metodap(int strona1, int strona2)
	{
		this.strona1=strona1;
		this.strona2=strona2;
		
		
	}
	
	public void wyswietl()
	{
		System.out.println("pole: " + (strona1*strona2));
	System.out.println("obwod: "+(strona1*2+strona2*2));
	
	System.out.println("d³ugoœæ przek¹tnej: "+Math.sqrt(strona1*strona1+strona2*strona2));
	}
	
	//1*********************************************************************************
	 public static boolean isOdd(int liczba) {

	        if (liczba%2==0) {
	            return true;

	        } else {
	            return false;
	        }
	    }
	 //2*********************************************************************************
	 public static void sqrt(int liczba)
		{
			System.out.println("sqrt: " + Math.sqrt(liczba));
		}
		
	//3********************************************************************************************
			public static void pow(int liczba)
			{
				Scanner scanner= new Scanner(System.in);
				System.out.println("Podaj potêgi: ");
				int potegi=scanner.nextInt();
				System.out.println("Potega "+potegi+" liczby "+ liczba+" beda "+Math.pow(liczba, potegi));
							}
				
		
	 
	 
}
