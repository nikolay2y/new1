package zdalne3;

import java.util.Scanner;

//Utw�rz klas� o nazwie MyNumber, kt�rej jedyny konstruktor przyjmuje liczb�. Klasa powinna mie� nast�puj�ce metody
// MyNumber isOdd() � true je�li atrybut jest nieparzysty,
//  MyNumber isEven() � true je�li atrybut jest parzysty,
// MyNumber sqrt() � pierwiastek z atrybutu,
// MyNumber pow(MyNumber x) � atrybut podniesiony do pot�gi x

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
