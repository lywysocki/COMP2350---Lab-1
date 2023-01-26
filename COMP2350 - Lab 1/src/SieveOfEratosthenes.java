import java.util.Scanner ;

/**
 * 
 * 
 * @author Laura Wysocki and Bryan DeFaria
 * @version 1.0.0 2023-01-26 Initial implementation
 *
 */
public class SieveOfEratosthenes
    {

    /**
     * 
     * 
     * @param input
     */
    static void Sieve( int input )
        {
        // create a list of numbers that track whether a number is prime (in which
        // the value is maintained) or not (0). To start, all values below/ equal to
        // the input are iterated Numbers below 2 are ignored
        int numbers[] = new int[ input + 1 ] ;

        for ( int i = 2 ; i <= input ; i++ )
            {
            numbers[ i ] = i ;

            }

        // The main "logic" that determines if a number is prime or not
        int j;
        for ( int i = 2 ; ( i * i ) <= input ; i++ )
            {
                if( numbers[i] != 0 )
                    {
                    j = i*i;
                    while( j <= input )
                        {
                        numbers[j] = 0;
                        j+= i;
                        }
                    }
            }
        
        // Iterates another list that will contain all the prime numbers
        int prime[] = new int [input + 1];
        int count = 0;
        
        // Moves all non-zero numbers from numbers[] to prime[]
        for( int i = 2; i <= input; i++)
            {
            if( numbers[i] != 0)
                {
                prime[count] = numbers[ i ];
                count++;
                }
            }
        
        // The prime number list has excess entries toward the end, for loop prints out values until reaching "0", where it ends
        for( int i = 0; i < prime.length; i++ )
            {
            if( prime[i] == 0 )
                {
                break;
                }
            System.out.print( prime[i] );
            }

        }
    
    /**
     * 
     * 
     * @param args
     */
    public static void main( String args[] )
        {

        // Love me some flavor text
        System.out.print( "Sieve of Eratosthenes: Java Edition\n\nPlease enter a positive integer greater than 1: " ) ;
        try ( Scanner response = new Scanner( System.in ) )
            {
            int input = response.nextInt() ;
            
            Sieve( input ) ;

            }

        }

    }
   // end class SieveOfEratisthenes