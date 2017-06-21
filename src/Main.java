
import java.util.Random;
import java.util.Scanner;


/*
 * Created by Student on 6/19/2017.
 */
public class Main {
    public static void Tombfordító(int a[])
    {
        int []reversetomb=new int [a.length];
        for (int i=0;i<a.length;i++)
        {
            reversetomb[a.length-1-i]=a[i];
        }

        System.out.println("Megfordítás után:"+" "+reversetomb[0]+" "+reversetomb[1]+" "+reversetomb[2]+" "+reversetomb[3]+" "+reversetomb[4]);
    }
    public static void main(String [] args)
    {//1. feladat
     System.out.print("Adj meg egy stringet!");
     Feladat_1 új=new Feladat_1 (null,null);
     Scanner s = new Scanner(System.in);
     új.elso=s.next();
     System.out.print("Adj meg egy másik stringet!");
     új.masodik=s.next();
     System.out.println(Feladat_1.Anagramma_e(új.elso,új.masodik));
     //2.feladat
     System.out.print("Add meg hogy medddig szeretnéd látni a Fibonacci sort!");
     int index=Integer.parseInt(s.next());
     System.out.println();
     Feladat_2.Fibonacci_sor_adott_elemig(index);
     //3.Feladat
     System.out.println();
     int [] tomb=new int [5];
     Random generator = new Random();
     for(int i=0; i<tomb.length ;i++)
        {
            tomb[i]=generator.nextInt(10)+1;
        }
     System.out.println("Random 5 elemből álló tömb elemei:"+" "+tomb[0]+" "+tomb[1]+" "+tomb[2]+" "+tomb[3]+" "+tomb[4]);
     Tombfordító(tomb);
    }

}
