/**
 * Created by Student on 6/21/2017.
 */
public class Feladat_1
{
    public String elso;
    public String masodik;
    public Feladat_1 (String a,String b)
    {
        this.elso=a;
        this.masodik=b;
    }
    public static String Anagramma_e (String a,String b)
    {
        if(a.length()>b.length()) {
            for (int i = 0; i < a.length(); i++) {
                boolean volt_e = false;
                for (int j = 0; j < b.length(); j++) {
                    if (a.toCharArray()[i] == b.toCharArray()[j]) {
                        volt_e = true;
                    } else if (j == b.length() - 1 && volt_e == false) {
                        return "Feladat1: A két string nem anagrammája egymásnak.";

                    }
                }
            }
        }
        else
        {
            for (int i = 0; i < b.length(); i++) {
                boolean volt_e = false;
                for (int j = 0; j < a.length(); j++) {
                    if (b.toCharArray()[i] == a.toCharArray()[j]) {
                        volt_e = true;
                    } else if (j == a.length() - 1 && volt_e == false) {
                        return "Feladat1: A két string nem anagrammája egymásnak.";

                    }
                }
            }
        }
     return "Feladat1: A két string anagrammája egymásnak.";
    }
}
