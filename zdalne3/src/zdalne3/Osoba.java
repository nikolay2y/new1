package zdalne3;

public class Osoba {
	int  wiek;
	int waga;
	 int wzrost;
	 String imie;
	 String	 plec;
	



	public Osoba(int wiek, int waga, int wzrost, String imie, String plec)
	{
		this.wiek=wiek;
		this.waga=waga;
		 this.wzrost=wzrost;
		 this.imie=imie;
		 this.plec=plec;
	}
	public void wyswietl()
	{
		System.out.println(wiek);
	System.out.println(waga);
	System.out.println(wzrost);
	System.out.println(imie);
	System.out.println(plec);
	
	
	}
	
	public void wyswietlwiek()
	{
		System.out.print(wiek+" ");
		}

	public void wyswietlwaga()
	{
		System.out.print(waga+" ");
		}
	

	public void wyswietlwzrost()
	{
		System.out.print(wzrost+" ");
		}

	public void wyswietlimie()
	{
		System.out.print(imie+" ");
		}

	public void wyswietlplec()
	{
		System.out.println(plec+" ");
		}
	
	}