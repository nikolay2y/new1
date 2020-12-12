package zdalne3;

import java.util.Scanner;

//Utwórz klasê o nazwie MyNumber, której jedyny konstruktor przyjmuje liczbê. Klasa powinna mieæ nastêpuj¹ce metody
// MyNumber isOdd() – true jeœli atrybut jest nieparzysty,
//  MyNumber isEven() – true jeœli atrybut jest parzysty,
// MyNumber sqrt() – pierwiastek z atrybutu,
// MyNumber pow(MyNumber x) – atrybut podniesiony do potêgi x

public class MyNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Podaj liczbe: ");
		int liczba=scanner.nextInt();
	
	//1*****************************************************************	
		if (Metodap.isOdd(liczba))
		{
		 System.out.println("Liczba "+" jest parzysta");
		}
         else System.out.println("Liczba "+" nie jest parzysta");
//2**********************************************************************
		
		Metodap.sqrt(liczba);
		
//3*****************************************************************
		Metodap.pow(liczba);
	}

}
