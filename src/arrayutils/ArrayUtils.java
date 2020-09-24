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
        //create a new array to store the results to retun
        int[] result = new int[mask.length];

        // run a loop to check the result and store the results accordingly
        for (int i = 0; i < arr.length; i++) {
            if (mask[i] == true) {
                result[i] = arr[i];
            }
        }
        // return the result array
        return result;
    }

    /**
     * Creates a new array containing all of the elements of two input arrays.
     *
     * @param arrA an input array
     * @param arrB another input array
     * @return a new array containing all the elements from both arrays
     */
    public static int[] concatenate(int[] arrA, int[] arrB) {
        // create new array to store the result
        int[] result = new int[arrA.length + arrB.length];

        // run a loop to combine the arrays and store the results
        for (int i = 0; i < result.length; i++) {
            while (i < arrA.length) {
                for (int a = 0; a < arrA.length; a++) {
                    result[i] = arrA[a];
                }
            }
            if (i > arrA.length) {
                for (int b = 0; b < arrB.length; b++) {
                    result[i] = arrB[b];
                }
            }
        }
        return result;
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
        // boolean variable to store the result
        boolean result = false;

        // run a loop to check if key is there or not
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                result = true;
                break;
            }
        }
        // return the result
        return result;
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
        // a new array to store the result
        int[] sum = new int[arr.length];
        // store the cumulative sum
        int prevIndex = 1;
        sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum[i] = sum[i - prevIndex] + arr[i];
        }
        // return the result
        return sum;
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
        // a new array to store the result
        int[] result = new int[arrA.length];

        // run a loop to add the corresponding elements of the two arrays
        for (int i = 0; i < arrA.length; i++) {
            result[i] = arrA[i] + arrB[i];
        }
        return result;
    }

    /**
     * Counts how many elements of an array are equal to a certain key.
     *
     * @param arr an array of numbers
     * @param key the key to match
     * @return the number of matches
     */
    public static int frequency(int[] arr, int key) {
        int count = 0;
        for (int number : arr) {
            if (number == key) {
                count++;
            }
        }
        return count;
    }

    /**
     * Determines whether an array of numbers is sorted in ascending order.
     *
     * @param arr an array of numbers
     * @return <strong>true</strong> if the array is sorted in ascending order;
     * <strong>false</strong> otherwise.
     */
    public static boolean isSorted(int[] arr) {
        boolean isSorted = false;
        switch (arr.length) {
            case 1:
                return true;
            case 2:
                return arr[1] > arr[0];
            default:
                for (int i = 1; i < (arr.length - 1); i++) {
                    int previousNumber = arr[i - 1];
                    int currentNumber = arr[i];
                    int nextNumber = arr[i + 1];
                    isSorted = currentNumber > previousNumber
                            && currentNumber < nextNumber;
                    if (!isSorted) {
                        break;
                    }
                }   break;
        }
        return isSorted;
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
        if(!isSorted(arrA) || !isSorted(arrB)) {
            return new int[0];
        }
        int[] newArray = new int[arrA.length + arrB.length];
        for(int i = 0; i < arrA.length; i++) {
            newArray[i] = arrA[i];
        }
        int arrBIndex = 0;
        for (int i = arrA.length; i < newArray.length; i++) {
            newArray[i] = arrB[arrBIndex++];
        }
        boolean sorted = false;
        while(!sorted) {
            sorted = !sorted;
            for (int i = 1; i < newArray.length; i++) {
                if(newArray[i-1] > newArray[i]) {
                    int temp = newArray[i-1];
                    newArray[i-1] = newArray[i];
                    newArray[i] = temp;
                    sorted = false;
                }
            }
        }
        return newArray;
    }

    /**
     * Creates a new array with the input array's elements reversed.
     *
     * @param arr the input array
     * @return a new array with the input array's elements in reverse order
     */
    public static int[] reverse(int[] arr) {
        int[] newArray = new int[arr.length];
        int first = 0;
        int last = arr.length-1;
        
        if(arr.length % 2 != 0) {
            int middleElementIndex = arr.length/2;
            newArray[middleElementIndex] = arr[middleElementIndex];
        }
        
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[first];
            newArray[first++] = arr[last];
            newArray[last--] = temp;
        }
        return newArray;
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
        int[] newArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i] * scalar;
        }
        return newArray;
    }

} // end class ArrayUtils
