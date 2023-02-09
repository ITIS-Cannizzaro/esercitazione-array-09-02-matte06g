import java.util.Scanner;
import java.lang.Math;
public class Nessi
{
	static Scanner in = new Scanner(System.in);
	static double[]arrayone = new double[5];
	static double[]arraytwo = new double[5];
	static double[]arraythree = new double [10];
	public static void main(String[] args)
	{
		while(true)
		{
			for(int i = 0; i < arrayone.length; i++)
			{
				System.out.println("Inserire elemento num" + (i+1));
				arrayone[i] = in.nextInt();
			}
			for(int i = 0; i < arraytwo.length; i++)
			{
				System.out.println("Inserire elemento num" + (i+1));
				arraytwo[i] = in.nextInt();
			}
			stampaMenu();
			int scelta = in.nextInt();
			switch(scelta)
			{
				case 1:
					es1(arrayone, arraytwo, arraythree);
				break;
				case 2:
					for(int i = 0; i< arrayone.length; i++)
					{
						arrayone[i]=Math.random()*20-10;
						
					}
					
				break;
				case 3:
					
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		
		System.out.println("1 - Es n. 1 - Titolo es.: Ordinamento dei valori di due array in ordine crescente, in un terzo array;");
		System.out.println("2 - Es n. * - Titolo es. *");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	static void es1(double[]arrayone, double[]arraytwo, double[]arraythree)
	{
		for(int i = 0; i < arrayone.length;i++)
		{
			arraythree[i] = arrayone[i];
		}
		for(int i = 0; i < arraytwo.length;i++)
		{
			arraythree[i+5] = arraytwo[i];
		}
		for(int i = 0; i <arraythree.length; i++)
		{
			for(int j = 0; j <arraythree.length; j++)
			{
				if(arraythree[i]<arraythree[j])
				{
					swap(i,j,arraythree);
				}
			}
		}
		for(int i = 0; i < arraythree.length; i++)
		{
		
			System.out.println("L'elemento alla posizione" + i + "del terzo array è" + arraythree[i]);
		}
	}
	static void swap(int a, int b, double[]V)
	{
		double temp = V[a];
		V[a] = V[b];
		V[b] = temp;
	}
	static void es2(int[]a, int[]b)
	{
		
		int contatore = -1;
		for(int i = 0; i < a.length;i++)
		{
			
			if(a[i]>= 0)
			{
				contatore += 1;
				b[contatore]=a[i];
			}
		}
		double[]banana = new double[b.length];
		for(int i = 0, j = b.length;)
	}
	
}
