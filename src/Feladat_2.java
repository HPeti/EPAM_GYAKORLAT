/**
 * Created by Student on 6/21/2017.
 */
public class Feladat_2
{
    public int elso;
    public int masodik;
    public int index;
    public Feladat_2(int a)
    {
        elso=1;
        masodik=2;
        index=a;
    }
    public static void Fibonacci_sor_adott_elemig(int index)
    {
        if(index==1 )
        {
            System.out.println();
            System.out.print(1);
        }
        else if (index==2)
        {
            System.out.println();
            System.out.print(1+" ");
            System.out.print(2);
        }
        else
        {
            int [] elozok=new int [2];
            for(int i=3;i<index+1;i++)
            {
                if(i==3)
                {
                    System.out.println();
                    System.out.print(1+" ");
                    System.out.print(2+" ");
                    System.out.print(3+" ");
                    elozok[0]=2;
                    elozok[1]=3;
                }
                else
                {
                    int cs=elozok[0]+elozok[1];
                    elozok[0]=elozok[1];
                    elozok[1]=cs;
                    System.out.print(cs+" ");
                }
            }
        }
    }


}

