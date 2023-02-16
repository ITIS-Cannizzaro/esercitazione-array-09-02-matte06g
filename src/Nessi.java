import java.util.Scanner;
import java.lang.Math;
public class Nessi
{
	static Scanner in = new Scanner(System.in);
	static double[] arrayone = new double[5];
	static double[] arraytwo = new double[5];
	static double[] arraythree = new double [10];
	static double[]arrayfour  = new double [10];
	static double[]banana=new double[10];
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = in.nextInt();
			switch(scelta)
			{
				case 1:
					es1();
				break;
				case 2:
					es2(arrayfour,banana);

					
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
		System.out.println("2 - Es n. 2 - Titolo es.: Es2");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	static void es1()
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
	static void es2(double[]a,double[]b)
	{		
		for(int i = 0; i <a.length;i++)
		{
			a[i]=Math.random()*20-10;
			System.out.println(a[i]);
		}
		int contatore = -1;
		for(int i = 0; i < a.length;i++)
		{			
			if(a[i]>= 0)
			{
				contatore += 1;
				b[contatore]=a[i];
			}
		}
		for(int i = 0; i < b.length;i++)
		{
			for(int j = 0; j < b.length;j++)
			{
				if(b[i]>b[j])
				{
					swap(i,j,b);
				}
			}
		}
		for(int i =0; i <= contatore; i++)
		{
			System.out.println("Elementi maggiori uguali a 0 riordinati:" +b[i]);
		}
	}
	
}
