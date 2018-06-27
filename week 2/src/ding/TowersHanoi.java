package ding;

public class TowersHanoi
{
    public static void main (String [] args)
    {
        print (5);
    }


    static void print( int n ) {
        System.out.print( n-1 );
        if( n > 2 ){
            print( n-1 );
        }

    }

}
