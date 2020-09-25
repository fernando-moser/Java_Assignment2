package arrayutils;

import java.util.Arrays;

public class ArrayUtilsTester {
    
    
    private Table[] tables = new Table[10];
    
    public void runTests() {

            testApplyMask();
            testFrequency();
            testIsSorted();
            testMerge();
    }

    private void testApplyMask() {
        //Tests for ApplyMask(): For positive integer <= 10
        tables[0] = new Table();
        //Test 1
        Row rowApplyMask1 = new Row();
        
        rowApplyMask1.setID("ApplyMask-1");
        rowApplyMask1.setDescription("Testing an array for positive integers <= 10: Normal numbers");
        rowApplyMask1.setInput("1,20,13,4,5,3");
        rowApplyMask1.setInput("true, false, false, true, true, true");
        String expectedResult1 = "[1, 4, 5, 3]";
        rowApplyMask1.setExpectedResult(expectedResult1);
        
        int[] input1a = {1,20,13,4,5,3};
        boolean[] input2a = {true, false, false, true, true, true};
        int[] result1 = ArrayUtils.applyMask(input1a, input2a);
        rowApplyMask1.setActualResult(Arrays.toString(result1));
        //check if the expected result matches the actual result
        if(expectedResult1.equals(Arrays.toString(result1))){
            rowApplyMask1.setPass(true);
        }else{
            rowApplyMask1.setPass(false);
        }
        tables[0].AddRow(rowApplyMask1);
        
        //Test 2
        Row rowApplyMask2 = new Row();
        
        rowApplyMask2.setID("ApplyMask-1");
        rowApplyMask2.setDescription("Testing an array for positive integers <= 10: Numbers close to 10");
        rowApplyMask2.setInput("9,10,11,99,8,6");
        rowApplyMask2.setInput("true, true, false, false, true, true");
        String expectedResult2 = "[9, 10, 8, 6]";
        rowApplyMask2.setExpectedResult(expectedResult2);
        
        int[] input1b = {9,10,11,78,8,6};
        boolean[] input2b = {true, true, false, false, true, true};
        int[] result2 = ArrayUtils.applyMask(input1b, input2b);
        rowApplyMask2.setActualResult(Arrays.toString(result2));
        //check if the expected result matches the actual result
        if(expectedResult2.equals(Arrays.toString(result2))){
            rowApplyMask2.setPass(true);
        }else{
            rowApplyMask2.setPass(false);
        }
        tables[0].AddRow(rowApplyMask2);
        
        //Test 3
        Row rowApplyMask3 = new Row();
        
        rowApplyMask3.setID("ApplyMask-1");
        rowApplyMask3.setDescription("Testing an array for positive integers <= 10: Negative number and zero");
        rowApplyMask3.setInput("11,-2,3,0,5,-6");
        rowApplyMask3.setInput("false, false, true, true, true, false");
        String expectedResult3 = "[3, 5]";
        rowApplyMask3.setExpectedResult(expectedResult3);
        
        int[] input1c = {11,-2,3,0,5,-6};
        boolean[] input2c = {false, false, true, true, true, false};
        int[] result3 = ArrayUtils.applyMask(input1c, input2c);
        rowApplyMask3.setActualResult(Arrays.toString(result3));
        //check if the expected result matches the actual result
        if(expectedResult3.equals(Arrays.toString(result3))){
            rowApplyMask3.setPass(true);
        }else{
            rowApplyMask3.setPass(false);
        }
        tables[0].AddRow(rowApplyMask3);
    }
    
    private void testFrequency() {
    
//    Tests for frequency()  
        Table testFrequency = new Table();
        tables[5] = testFrequency;
//    Test 1:    
        Row rowTestFrequency1 = new Row();
        rowTestFrequency1.setID("Frequency-1");
        rowTestFrequency1.setDescription("Testing an array of 7 integers with number 3 repeated 2 times");
        int[] input1a = {1,5,10,3,5,7,3};
        int input1b = 3;
        rowTestFrequency1.setInput(Arrays.toString(input1a));
        rowTestFrequency1.setInput(String.valueOf(input1b));
        String expectedResult1 = "2";
        rowTestFrequency1.setExpectedResult(expectedResult1);
        
        
        int result = ArrayUtils.frequency(input1a, input1b);
        rowTestFrequency1.setActualResult(String.valueOf(result));
        rowTestFrequency1.setPass(Integer.valueOf(expectedResult1).equals(result));
        
        testFrequency.AddRow(rowTestFrequency1);
        
//        Test 2:

        Row rowTestFrequency2 = new Row();
        rowTestFrequency2.setID("Frequency-2");
        rowTestFrequency2.setDescription("Testing an array of 7 integers without a key");
        
        int[] input2a = {1,5,10,6,5,7,9};
        int input2b = 3;
        rowTestFrequency2.setInput(Arrays.toString(input2a));
        rowTestFrequency2.setInput(String.valueOf(input2b));
        String expectedResult2 = "0";
        rowTestFrequency2.setExpectedResult(expectedResult2);
        
        
        int result2 = ArrayUtils.frequency(input2a, input2b);
        rowTestFrequency2.setActualResult(String.valueOf(result2));
        rowTestFrequency2.setPass(Integer.valueOf(expectedResult2).equals(result2));
        
        testFrequency.AddRow(rowTestFrequency2);
        
//        System.out.println(testFrequency.getTable());
    }
    
    private void testIsSorted() {
        
        Table testIsSorted = new Table();
        tables[6] = testIsSorted;
//        Test 1
        Row rowTestIsSorted1 = new Row();
        rowTestIsSorted1.setID("isSorted-1");
        rowTestIsSorted1.setDescription("Passing an array not sorted");
        int[] input1 = {1,5,10,3,5,7,3};
        String expectedResult1 = "false";
        rowTestIsSorted1.setInput(Arrays.toString(input1));
        rowTestIsSorted1.setExpectedResult(expectedResult1);
        
        boolean result1 = ArrayUtils.isSorted(input1);
        rowTestIsSorted1.setActualResult(String.valueOf(result1));
        rowTestIsSorted1.setPass(expectedResult1.equals(String.valueOf(result1)));
        
        testIsSorted.AddRow(rowTestIsSorted1);
//        Test 2
        Row rowTestIsSorted2 = new Row();
        
        rowTestIsSorted2.setID("isSorted-2");
        rowTestIsSorted2.setDescription("Passing a sorted array");
        
        int[] input2 = {1,2,3,4,5};
        rowTestIsSorted2.setInput(Arrays.toString(input2));
        String expectedResult2 = "true";
        rowTestIsSorted2.setExpectedResult(expectedResult2);
        
        boolean result2 = ArrayUtils.isSorted(input2);
        rowTestIsSorted2.setActualResult(String.valueOf(result2));
        rowTestIsSorted2.setPass(expectedResult2.equals(String.valueOf(result2)));
        
        testIsSorted.AddRow(rowTestIsSorted2);
//        Test 3
        Row rowTestIsSorted3 = new Row();
        rowTestIsSorted3.setID("isSorted-3");
        rowTestIsSorted3.setDescription("Passing an array unsorted with 2 elements");
        
        int[] input3 = {3,10};
        rowTestIsSorted3.setInput(Arrays.toString(input3));
        String expectedResult3 = "true";
        rowTestIsSorted3.setExpectedResult(expectedResult3);
        boolean result3 = ArrayUtils.isSorted(input3);
        rowTestIsSorted3.setActualResult(String.valueOf(result3));
        rowTestIsSorted3.setPass(expectedResult3.equals(String.valueOf(result3)));
        
        testIsSorted.AddRow(rowTestIsSorted3);
//        Test 4
        Row rowTestIsSorted4 = new Row();
        rowTestIsSorted4.setID("isSorted-4");
        rowTestIsSorted4.setDescription("Passing an array unsorted with 1 element");
        
        int[] input4 = {20};
        rowTestIsSorted4.setInput(Arrays.toString(input4));
        String expectedResult4 = "true";
        rowTestIsSorted4.setExpectedResult(expectedResult4);
        boolean result4 = ArrayUtils.isSorted(input4);
        rowTestIsSorted4.setActualResult(String.valueOf(result4));
        rowTestIsSorted4.setPass(expectedResult4.equals(String.valueOf(result4)));
        
        testIsSorted.AddRow(rowTestIsSorted4);
        
//        Display table
//        System.out.println(testIsSorted.getTable());
    }
    
    private void testMerge() {
        
        Table testMerge = new Table();
        tables[7] = testMerge;
//        Test 1
        Row rowTestMerge1 = new Row();
        rowTestMerge1.setID("testMerge-1");
        rowTestMerge1.setDescription("Passing 2 sorted arrays same size");
        
        int[] input1a = {2,7,9,15}, input1b = {5,12,24,26};
        int[] expectedResult1 = {2,5,7,9,12,15,24,26};
        
        rowTestMerge1.setInput(Arrays.toString(input1a));
        rowTestMerge1.setInput(Arrays.toString(input1b));
        
        rowTestMerge1.setExpectedResult(Arrays.toString(expectedResult1));
        
        int[] result1 = ArrayUtils.merge(input1a, input1b);
        
        rowTestMerge1.setActualResult(Arrays.toString(result1));
        rowTestMerge1.setPass(Arrays.equals(expectedResult1, result1));
        
        testMerge.AddRow(rowTestMerge1);
//        Test 2
        Row rowTestMerge2 = new Row();
        rowTestMerge2.setID("testMerge-2");
        rowTestMerge2.setDescription("Passing 2 unsorted arrays same size");
        
        int[] input2a = {7,2,15,9}, input2b = {26,12,24,5};
        int[] expectedResult2 = {}; //empty array
        
        rowTestMerge2.setInput(Arrays.toString(input2a));
        rowTestMerge2.setInput(Arrays.toString(input2b));
        
        rowTestMerge2.setExpectedResult(Arrays.toString(expectedResult2));
        
        int[] result2 = ArrayUtils.merge(input2a, input2b);
        
        rowTestMerge2.setActualResult(Arrays.toString(result2));
        rowTestMerge2.setPass(Arrays.equals(expectedResult2, result2));
        
        testMerge.AddRow(rowTestMerge2);
//        Test 3
        Row rowTestMerge3 = new Row();
        rowTestMerge3.setID("testMerge-3");
        rowTestMerge3.setDescription("Passing 2 sorted arrays different size");
        
        int[] input3a = {2,7,9,15,18,90}, input3b = {5,12,24,26};
        int[] expectedResult3 = {2,5,7,9,12,15,18,24,26,90};
        
        rowTestMerge3.setInput(Arrays.toString(input3a));
        rowTestMerge3.setInput(Arrays.toString(input3b));
        
        rowTestMerge3.setExpectedResult(Arrays.toString(expectedResult3));
        
        int[] result3 = ArrayUtils.merge(input3a, input3b);
        
        rowTestMerge3.setActualResult(Arrays.toString(result3));
        rowTestMerge3.setPass(Arrays.equals(expectedResult3, result3));
        
        testMerge.AddRow(rowTestMerge3);
//        Test 4
        Row rowTestMerge4 = new Row();
        rowTestMerge4.setID("testMerge-4");
        rowTestMerge4.setDescription("Passing 2 sorted arrays different size one of them empty");
        
        int[] input4a = {}, input4b = {5,12,24,26};
        int[] expectedResult4 = {5,12,24,26};
        
        rowTestMerge4.setInput(Arrays.toString(input4a));
        rowTestMerge4.setInput(Arrays.toString(input4b));
        
        rowTestMerge4.setExpectedResult(Arrays.toString(expectedResult4));
        
        int[] result4 = ArrayUtils.merge(input4a, input4b);
        
        rowTestMerge4.setActualResult(Arrays.toString(result4));
        rowTestMerge4.setPass(Arrays.equals(expectedResult4, result4));
        
        testMerge.AddRow(rowTestMerge4);
//        Test 5
        Row rowTestMerge5 = new Row();
        rowTestMerge5.setID("testMerge-5");
        rowTestMerge5.setDescription("Passing 2 empty arrays");
        
        int[] input5a = {}, input5b = {};
        int[] expectedResult5 = {};
        
        rowTestMerge5.setInput(Arrays.toString(input5a));
        rowTestMerge5.setInput(Arrays.toString(input5b));
        
        rowTestMerge5.setExpectedResult(Arrays.toString(expectedResult5));
        
        int[] result5 = ArrayUtils.merge(input5a, input5b);
        
        rowTestMerge5.setActualResult(Arrays.toString(result5));
        rowTestMerge5.setPass(Arrays.equals(expectedResult5, result5));
        
        testMerge.AddRow(rowTestMerge5);  
//        Test 6
        Row rowTestMerge6 = new Row();
        rowTestMerge6.setID("testMerge-6");
        rowTestMerge6.setDescription("Passing 2 arrays with 1 element");
        
        int[] input6a = {9}, input6b = {3};
        int[] expectedResult6 = {3,9};
        
        rowTestMerge6.setInput(Arrays.toString(input6a));
        rowTestMerge6.setInput(Arrays.toString(input6b));
        
        rowTestMerge6.setExpectedResult(Arrays.toString(expectedResult6));
        
        int[] result6 = ArrayUtils.merge(input6a, input6b);
        
        rowTestMerge6.setActualResult(Arrays.toString(result6));
        rowTestMerge6.setPass(Arrays.equals(expectedResult6, result6));
        
        testMerge.AddRow(rowTestMerge6);
//        Test 7
        Row rowTestMerge7 = new Row();
        rowTestMerge7.setID("testMerge-7");
        rowTestMerge7.setDescription("Passing 1 unsorted array and 1 empty array");
        
        int[] input7a = {}, input7b = {3,2,100,37};
        int[] expectedResult7 = {}; // empty array
        
        rowTestMerge7.setInput(Arrays.toString(input7a));
        rowTestMerge7.setInput(Arrays.toString(input7b));
        
        rowTestMerge7.setExpectedResult(Arrays.toString(expectedResult7));
        
        int[] result7 = ArrayUtils.merge(input7a, input7b);
        
        rowTestMerge7.setActualResult(Arrays.toString(result7));
        rowTestMerge7.setPass(Arrays.equals(expectedResult7, result7));
        
        testMerge.AddRow(rowTestMerge7);
    }
    
    public void showReport() {
        
        for(Table table : tables) {
            if(table != null)
                System.out.println(table.getTable());
        }
    }
    
    public static void main (String[] args) {
        ArrayUtilsTester tester = new ArrayUtilsTester();
        tester.runTests();
        tester.showReport();
    } // end main
} // end class ArrayUtilsTester
