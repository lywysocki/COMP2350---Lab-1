
/**
 * 
 * 
 * @author Laura Wysocki and Bryan DeFaria
 * @version 1.0.0 2023-01-26 Initial implementation
 *
 */
public class SelectionSort
    {
    
    /**
     * 
     * 
     * @param array
     * @return 
     */
    public static int[] selectionSort( final int[] array )
        {
        int min = array[0] ;

        for ( int i = 0 ; i < array.length ; i++ )
            {
            min = array[i] ;
            for (int j = i + 1 ; j < array.length - 1 ; j++)
                {
                if (array[j] < array[i])
                    {
                    min = array[j] ;
                    }
                }
            int temp = array[i] ;
            array[i] = min;
            min = temp ;
            } // end for
        return array;

        }   // end selectionSort()


    /**
     * 
     * 
     * @param args
     */
    public static void main( String[] args )
        {
        // TODO Auto-generated method stub

        }

    }
   // end class SelectionSort