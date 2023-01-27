import java.util.Scanner ;

/**
 * @author Laura Wysocki and Bryan DeFaria
 *
 * @version 1.0.0 2023-01-26 Initial implementation
 */
public class SelectionSort
    {

    /**
     * Uses selection sort to sort an unsorted array into chronological order from
     * least to greatest
     * 
     * @param array
     *     input of list of integers
     *
     * @return the array sorted from least to greatest
     */
    public static int[] selectionSort( final int[] array )
        {
        int min = array.length ;

        // nested for loop to compare each integer with one another
        for ( int i = 0 ; i < ( array.length - 1 ) ; i++ )
            {
            min = i ;
            for ( int j = i + 1 ; j < array.length ; j++ )
                {

                // if statement to compare current element to next element it needs
                // to be compared against
                if ( array[ j ] < array[ min ] )
                    {
                    min = j ;

                    } // end if

                } // end for

            int temp = array[ min ] ;
            array[ min ] = array[ i ] ;
            array[ i ] = temp ;

            } // end for

        return array ;

        }   // end selectionSort()


    /**
     * Main method for taking in an integer array from the console and printing out
     * the array sorted in chronological order.
     * 
     * @param args
     *     an array of command-line arguments for the application
     */
    public static void main( String[] args )
        {
        try ( Scanner input = new Scanner( System.in ) )
            {

            System.out.printf( "Please input size of array: " ) ;
            int arraySize = input.nextInt() ;

            int[] theArray = new int[ arraySize ] ;
            System.out.printf( "%nPlease input your array in the format of integers seperated by spaces: " ) ;

            // creates an array based on values provided in the console
            for ( int i = 0 ; i < arraySize ; i++ )
                {
                theArray[ i ] = input.nextInt() ;

                } // end for

            selectionSort( theArray ) ;

            // formats and prints new array of sorted integers
            String s = "" ;
            System.out.printf( "%nYour sorted array: " ) ;
            for ( int a : theArray )
                {
                System.out.printf( s + a ) ;
                s = ", " ;

                } // end for

            } // end try

        } // end main()

    }
// end class SelectionSort
