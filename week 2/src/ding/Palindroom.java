package ding;

/**
 * Created by boybo on 26-6-2018.
 */
public class Palindroom
{
    public static void main (String [] args)
    {
        String st = "Anna";
        if (palindroom (st, 0, st.length() - 1))
            System.out.println ("Palindroom!");
        else
            System.out.println ("Geen Palindroom");

    }

    private static boolean palindroom (String s, int begin, int eind) {
        System.out.println(begin);
        if(begin == s.length()-1){
            return true;
        }
        if(s.toLowerCase().charAt(begin) == (s.toLowerCase().charAt(eind))){
            return palindroom(s,begin+1,eind-1);
        }
        return false;
    }}
