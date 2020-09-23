package arrayutils;

public class ArrayUtils {

    /**
     * Creates a new array by applying a boolean mask to an input array.
     *
     * @param arr an array of numbers (input array)
     * @param mask an array of boolean values (mask array)
     * @return a new array containing each element of the input array whose
     * corresponding mask value is <code>true</code>, or an empty array if the
     * two input arrays are different lengths.
     *
     * <br><strong>Example:</strong><br>
     * If <var>arr</var> is [7,2,8,3,9,4], and <var>mask</var> is [1,1,0,1,0,0],
     * then the result should be [7,2,3].
     */
    public static int[] applyMask(int[] arr, boolean[] mask) {
        return new int[0];
    }

    /**
     * Creates a new array containing all of the elements of two input arrays.
     *
     * @param arrA an input array
     * @param arrB another input array
     * @return a new array containing all the elements from both arrays
     */
    public static int[] concatenate(int[] arrA, int[] arrB) {
        return new int[0];
    }

    /**
     * Determines whether an array of numbers contains a certain key.
     *
     * @param arr an array of numbers
     * @param key the key to match
     * @return <strong>true</strong> if the key is in the array;
     * <strong>false</strong> otherwise
     */
    public static boolean contains(int[] arr, int key) {
        return false;
    }

    /**
     * Creates an array containing the cumulative sums of the input array.
     *
     * @param arr the input array
     * @return a new array containing the cumulative sums
     *
     * <br><strong>Example:</strong><br>
     * If <var>arr</var> is [7,2,8,3,6], then the result should be
     * [7,9,17,20,26].
     */
    public static int[] cumulativeSums(int[] arr) {
        return new int[0];
    }

    /**
     * Creates an array containing the element-wise sums of two input arrays.
     *
     * @param arrA one input array
     * @param arrB the second input array
     * @return a new array containing the element-wise sums, or an empty array
     * if the two input arrays are different lengths.
     *
     * <br><strong>Example:</strong><br>
     * If <var>arrA</var> is [7,2,8,3,6], and <var>arrB</var> is [8,3,2,6,9],
     * then the result should be [15,5,10,9,15].
     */
    public static int[] elementwiseSums(int[] arrA, int[] arrB) {
        return new int[0];
    }

    /**
     * Counts how many elements of an array are equal to a certain key.
     *
     * @param arr an array of numbers
     * @param key the key to match
     * @return the number of matches
     */
    public static int frequency(int[] arr, int key) {
        return 0;
    }

    /**
     * Determines whether an array of numbers is sorted in ascending order.
     *
     * @param arr an array of numbers
     * @return <strong>true</strong> if the array is sorted in ascending order;
     * <strong>false</strong> otherwise.
     */
    public static boolean isSorted(int[] arr) {
        return false;
    }

    /**
     * Merges two sorted arrays.
     *
     * @param arrA an sorted array in ascending order
     * @param arrB another array sorted in ascending order
     * @return the array that results from merging the two arrays while
     * preserving sorting, or an empty array if either input array is not
     * sorted.
     *
     * <br><strong>Example:</strong><br>
     * If <var>arrA</var> is [2,7,9,15,18], and <var>arrB</var> is [5,12,24,26],
     * then the result should be [2,5,7,9,12,15,18,24,26].
     */
    public static int[] merge(int[] arrA, int[] arrB) {
        return new int[0];
    }

    /**
     * Creates a new array with the input array's elements reversed.
     *
     * @param arr the input array
     * @return a new array with the input array's elements in reverse order
     */
    public static int[] reverse(int[] arr) {
        return new int[0];
    }

    /**
     * Multiplies each element of an array by a scalar.
     *
     * @param arr an array of numbers
     * @param scalar the scalar to multiply each array element by
     * @return a new array of numbers such that each element is the original
     * element multiplied by the scalar.
     *
     * <br><strong>Example:</strong><br>
     * If <var>arr</var> is [7,2,8,3] and <var>scalar</var> is 5, then the
     * result should be [35,10,40,15].
     */
    public static int[] scale(int[] arr, int scalar) {
        System.out.println("Test");
        return new int[0];
    }

} // end class ArrayUtils
