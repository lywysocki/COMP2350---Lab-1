import java.util.Scanner ;

/**
 * @author Laura Wysocki and Bryan DeFaria
 *
 * @version 1.0.0 2023-01-26 Initial implementation
 */
public class SelectionSort
    {

    /**
     * @param array
     *
     * @return
     */
    public static int[] selectionSort( final int[] array )
        {
        int min = array.length ;

        for ( int i = 0 ; i < ( array.length - 1 ) ; i++ )
            {
            min = i ;
            for ( int j = i + 1 ; j < array.length ; j++ )
                {
                if ( array[ j ] < array[ min ] )
                    {
                    min = j ;

                    }

                }

            int temp = array[ min ] ;
            array[ min ] = array[ i ] ;
            array[ i ] = temp ;

            } // end for

        return array ;

        }   // end selectionSort()


    /**
     * @param args
     */
    public static void main( String[] args )
        {
        try ( Scanner input = new Scanner( System.in ) )
            {

            System.out.printf( "Please input size of array: " ) ;
            int arraySize = input.nextInt() ;

            int[] theArray = new int[ arraySize ] ;
            System.out.printf( "%nPlease input your array in the format of integers seperated by spaces: " ) ;

            for ( int i = 0 ; i < arraySize ; i++ )
                {
                theArray[ i ] = input.nextInt() ;

                }

            selectionSort( theArray ) ;

            String s = "" ;
            System.out.printf( "%nYour sorted array: " ) ;
            for ( int a : theArray )
                {
                System.out.printf( s + a ) ;
                s = ", " ;

                }

            }

        }

    }
// end class SelectionSort
