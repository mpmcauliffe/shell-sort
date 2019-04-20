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
         *          Decrementation:
         *              This loop decrements by dividing the gap value by 2.
         *              Because the gap value is initialized at 3 in this example, the second iteration of this
         *              loop divides 3 / 2 = 1.5. This value is casted to 1 because the variable is of type int.
         *              Because the gap value is 1, insertion sort begins at the second iteration of this loop.
         **/
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            /**
             *      INNER LOOP
             *          The outer loop establishes the space between the end of the sorted partition and the
             *          the element to be evaluated against the sorted partition. This inner loop maintains the
             *          space between the gap and moves it from left to right evaluating elements as it passes.
             *
             *          Incrementation:
             *              --int i is set to the value of gap and moves from that position to the right until
             *                  it hits the end of the array then the loop TERMINATES.
             **/
            for (int i = gap; i < intArray.length; i++) {

                /**
                 *      Variables:
                 *          --int newElement is the element value at gap to be compared to the sorted partition
                 *          --int j maintains the space of the gap and is used to establish the right end of
                 *              the sorted partition
                 **/
                int newElement = intArray[i];
                int j = i;

                /**
                 *      INNER WHILE LOOP
                 *          This loop facilitates the first part of the element swap. If the element at the
                 *          position at the end of the sorted partition is > than the element value at gap
                 *          (newElement) the greater value is moved up in the array replacing the position of
                 *          the lesser value.
                 *
                 *          TERMINATION:
                 *              This loop terminates or doesn't initiate if the value on the left side of the
                 *              gap is less than the value on the right. This means that each value is in its
                 *              correct position with respect to each other. The loop also terminates when
                 *              int j is less than gap. In this example, gap and j initiate at 3. The while
                 *              loop DECREMENTS by three meaning this it TERMINATES after the first iteration.
                 **/
                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];

                    j -= gap;
                }

                /**
                 *      This expression completes the second half of the swap by either moving the smaller
                 *      value to the left or by keeping it the same.
                 **/
                intArray[j] = newElement;
            }
        }
    /****/



        //  for printing only
        for (int num: intArray) {
            System.out.print(num + "  ");
        }
        int x = 1;
        System.out.println(x / 2);
    }
}
