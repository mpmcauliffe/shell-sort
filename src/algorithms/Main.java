package algorithms;

public class Main {

    public static void main(String[] args) {
        /**  initialize unsorted array with assigned elements **/
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };


        //  for printing only
        for (int num: intArray) {
            System.out.print(num + "  ");
        }
        System.out.print("\n");


    /**
     * SHELL SORT ALGORITHM (optimized on insertion sort)
     *
     *      Optimizing insertion sort with this method means shell sort sets order the array before insertion
     *      sort sorts the array entirely. Shell sort requires a gap value which is the value that is compared
     *      to the values in the sorted partition. The difference is that these values are not adjacent.
     *      Each iteration of the outer loop closes the space between the gap value and the sorted partition
     *      until the gap value is 1. When the gap value is 1, this algorithm proceeds as insertion sort.

     **/
        /**
         *      OUTER LOOP
         *          In this implementation the gap value is array.length / 2, so the gap value is
         *          initialized at 3. So the value at index 3 is compared to the value(s) in the sorted
         *          partition.
         *
         *          Incrementation:
         *              This loop increments by dividing the gap value by 2.
         *              Because the gap value
         **/
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];

                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }
    /****/



        //  for printing only
        for (int num: intArray) {
            System.out.print(num + "  ");
        }
    }
}
