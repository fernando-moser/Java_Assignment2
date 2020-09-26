package arrayutils;

import java.util.Arrays;

import cputils.FileUtils;
import java.io.*;

public class ArrayUtilsTester {
    
    
    private Table[] tables = new Table[10];
    
    private void runTestsApplyMask() {
        //Tests for ApplyMask()
            tables[0] = new Table("applyMask");
        //Test 1
            Row rowApplyMask1 = new Row();

            rowApplyMask1.setID("ApplyMask-1");
            rowApplyMask1.setDescription("Testing for ApplyMask(): Normal numbers <= 10");
            rowApplyMask1.setInput("[1, 20, 13, 4, 5, 3]");
            rowApplyMask1.setInput("[true, false, false, true, true, true]");
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

            rowApplyMask2.setID("ApplyMask-2");
            rowApplyMask2.setDescription("Testing for ApplyMask(): Numbers close to 10");
            rowApplyMask2.setInput("[9, 10, 11, 99, 8, 6]");
            rowApplyMask2.setInput("[true, true, false, false, true, true]");
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

            rowApplyMask3.setID("ApplyMask-3");
            rowApplyMask3.setDescription("Testing for ApplyMask(): Negative numbers and zero");
            rowApplyMask3.setInput("[11, -2, 3, 0, 5, -6]");
            rowApplyMask3.setInput("[false, false, true, true, true, false]");
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
    
    private void runTestsConcatenate() {
        //Tests for Concatenate()
            tables[1] = new Table("concatenate");
        //Test 1
            Row rowConcatenate1 = new Row();

            rowConcatenate1.setID("Concatenate-1");
            rowConcatenate1.setDescription("Testing for Concatenating(): Normal integer arrays of same size");
            rowConcatenate1.setInput("[1, 2, 3, 4, 5]");
            rowConcatenate1.setInput("[6, 7, 8, 9, 10]");
            String expectedResult1 = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]";
            rowConcatenate1.setExpectedResult(expectedResult1);

            int[] input1a = {1,2,3,4,5};
            int[] input2a = {6,7,8,9,10};
            int[] result1 = ArrayUtils.concatenate(input1a, input2a);
            rowConcatenate1.setActualResult(Arrays.toString(result1));
            //check if the expected result matches the actual result
            if(expectedResult1.equals(Arrays.toString(result1))){
                rowConcatenate1.setPass(true);
            }else{
                rowConcatenate1.setPass(false);
            }
            tables[1].AddRow(rowConcatenate1);
        
        //Test 2
            Row rowConcatenate2 = new Row();

            rowConcatenate2.setID("Concatenate-2");
            rowConcatenate2.setDescription("Testing for Concatenating(): Integer arrays of different sizes");
            rowConcatenate2.setInput("[-1, 0, 2, -60, 100]");
            rowConcatenate2.setInput("[200, -99, 45, 3, 58, 32, -50]");
            String expectedResult2 = "[-1, 0, 2, -60, 100, 200, -99, 45, 3, 58, 32, -50]";
            rowConcatenate2.setExpectedResult(expectedResult2);

            int[] input1b = {-1,0,2,-60,100};
            int[] input2b = {200,-99,45,3,58,32,-50};
            int[] result2 = ArrayUtils.concatenate(input1b, input2b);
            rowConcatenate2.setActualResult(Arrays.toString(result2));
            //check if the expected result matches the actual result
            if(expectedResult2.equals(Arrays.toString(result2))){
                rowConcatenate2.setPass(true);
            }else{
                rowConcatenate2.setPass(false);
            }
            tables[1].AddRow(rowConcatenate2);
            
        //Test 3
            Row rowConcatenate3 = new Row();

            rowConcatenate3.setID("Concatenate-3");
            rowConcatenate3.setDescription("Testing for Concatenating(): An integer array with a null array");
            rowConcatenate3.setInput("[11, -2, 3, 0, 5, -6]");
            rowConcatenate3.setInput("[]");
            String expectedResult3 = "[11, -2, 3, 0, 4, -6]";
            rowConcatenate3.setExpectedResult(expectedResult3);

            int[] input1c = {11,-2,3,0,5,-6};
            int[] input2c = {};
            int[] result3 = ArrayUtils.concatenate(input1c, input2c);
            rowConcatenate3.setActualResult(Arrays.toString(result3));
            //check if the expected result matches the actual result
            if(expectedResult3.equals(Arrays.toString(result3))){
                rowConcatenate3.setPass(true);
            }else{
                rowConcatenate3.setPass(false);
            }
            tables[1].AddRow(rowConcatenate3);
    }
    
    private void runTestContains(){
        //Tests for Contains()
            tables[2] = new Table("contains");
            
        //Test 1
            Row rowContains1 = new Row();

            rowContains1.setID("Contains-1");
            rowContains1.setDescription("Testing for Contains(): Normal key search");
            rowContains1.setInput("[1, 2, 3, 4, 5]");
            rowContains1.setInput("3");
            String expectedResult1 = "true";
            rowContains1.setExpectedResult(expectedResult1);

            int[] input1a = {1,2,3,4,5};
            int input2a = 3;
            boolean result1 = ArrayUtils.contains(input1a, input2a);
            rowContains1.setActualResult(Boolean.toString(result1));
            //check if the expected result matches the actual result
            if(expectedResult1.equals(Boolean.toString(result1))){
                rowContains1.setPass(true);
            }else{
                rowContains1.setPass(false);
            }
            tables[2].AddRow(rowContains1);
            
        //Test 2
            Row rowContains2 = new Row();

            rowContains2.setID("Contains-2");
            rowContains2.setDescription("Testing for Contains(): Negative integer key search");
            rowContains2.setInput("[1, -2, 3, 4, -5]");
            rowContains2.setInput("-2");
            String expectedResult2 = "true";
            rowContains2.setExpectedResult(expectedResult2);

            int[] input1b = {1,-2,3,4,-5};
            int input2b = 3;
            boolean result2 = ArrayUtils.contains(input1b, input2b);
            rowContains2.setActualResult(Boolean.toString(result2));
            //check if the expected result matches the actual result
            if(expectedResult2.equals(Boolean.toString(result2))){
                rowContains2.setPass(true);
            }else{
                rowContains2.setPass(false);
            }
            tables[2].AddRow(rowContains2);
            
        //Test 3
            Row rowContains3 = new Row();

            rowContains3.setID("Contains-3");
            rowContains3.setDescription("Testing for Contains(): A non existing value");
            rowContains3.setInput("[0, -2, 3, 4, -5]");
            rowContains3.setInput("-0");
            String expectedResult3 = "false";
            rowContains3.setExpectedResult(expectedResult3);

            int[] input1c = {0,-2,3,4,-5};
            int input2c = -0;
            boolean result3 = ArrayUtils.contains(input1c, input2c);
            rowContains3.setActualResult(Boolean.toString(result3));
            //check if the expected result matches the actual result
            if(expectedResult3.equals(Boolean.toString(result3))){
                rowContains3.setPass(true);
            }else{
                rowContains3.setPass(false);
            }
            tables[2].AddRow(rowContains3);
            
            //System.out.println(tables[2].getTable());
    }
    
    private void runTestCumulativeSums(){
        //Tests for CumulativeSum()
            tables[3] = new Table("cumulativeSums");
            
        //Test 1
            Row rowCumulativeSums1 = new Row();

            rowCumulativeSums1.setID("CumulativeSum-1");
            rowCumulativeSums1.setDescription("Testing for CumulativeSum(): Normal integers");
            rowCumulativeSums1.setInput("[1, 2, 3, 8, 5]");
            String expectedResult1 = "[1, 3, 6, 10, 15]";
            rowCumulativeSums1.setExpectedResult(expectedResult1);

            int[] input1a = {1,2,3,8,5};
            int[] result1 = ArrayUtils.cumulativeSums(input1a);
            rowCumulativeSums1.setActualResult(Arrays.toString(result1));
            //check if the expected result matches the actual result
            if(expectedResult1.equals(Arrays.toString(result1))){
                rowCumulativeSums1.setPass(true);
            }else{
                rowCumulativeSums1.setPass(false);
            }
            tables[3].AddRow(rowCumulativeSums1);
            
        //Test 2
            Row rowCumulativeSums2 = new Row();

            rowCumulativeSums2.setID("CumulativeSum-2");
            rowCumulativeSums2.setDescription("Testing for CumulativeSum(): Negative and positive integers");
            rowCumulativeSums2.setInput("[1, -2, 3, 4, -5]");
            String expectedResult2 = "[1, -1, 2, 6, 1]";
            rowCumulativeSums2.setExpectedResult(expectedResult2);

            int[] input2a = {1,-2,3,4,-5};
            int[] result2 = ArrayUtils.cumulativeSums(input2a);
            rowCumulativeSums2.setActualResult(Arrays.toString(result2));
            //check if the expected result matches the actual result
            if(expectedResult2.equals(Arrays.toString(result2))){
                rowCumulativeSums2.setPass(true);
            }else{
                rowCumulativeSums2.setPass(false);
            }
            tables[3].AddRow(rowCumulativeSums2);
            
        //Test 3
            Row rowCumulativeSums3 = new Row();

            rowCumulativeSums3.setID("CumulativeSum-3");
            rowCumulativeSums3.setDescription("Testing for CumulativeSum(): Negative integers");
            rowCumulativeSums3.setInput("[-7, -6, -5, -4, -3, -2]");
            String expectedResult3 = "[-7, -13, -18, -22, -25, -27]";
            rowCumulativeSums3.setExpectedResult(expectedResult3);

            int[] input3a = {-7,-6,-5,-4,-3,-2};
            int[] result3 = ArrayUtils.cumulativeSums(input3a);
            rowCumulativeSums3.setActualResult(Arrays.toString(result3));
            //check if the expected result matches the actual result
            if(expectedResult3.equals(Arrays.toString(result3))){
                rowCumulativeSums3.setPass(true);
            }else{
                rowCumulativeSums3.setPass(false);
            }
            tables[3].AddRow(rowCumulativeSums3);
           
    }
    
    private void runTestElementwiseSums(){
        //Tests for ElementwiseSums()
            tables[4] = new Table("elementwiseSums");
            
        //Test 1
            Row rowElementwiseSums1 = new Row();

            rowElementwiseSums1.setID("ElementwiseSums-1");
            rowElementwiseSums1.setDescription("Testing for ElementwiseSum(): Normal integers");
            rowElementwiseSums1.setInput("[1, 2,3 ,4, 5]");
            rowElementwiseSums1.setInput("[6, 7, 8, 9, 10]");
            String expectedResult1 = "[7, 9, 11, 13, 15]";
            rowElementwiseSums1.setExpectedResult(expectedResult1);

            int[] input1a = {1,2,3,4,5};
            int[] input2a = {6,7,8,9,10};
            int[] result1 = ArrayUtils.elementwiseSums(input1a, input2a);
            rowElementwiseSums1.setActualResult(Arrays.toString(result1));
            //check if the expected result matches the actual result
            if(expectedResult1.equals(Arrays.toString(result1))){
                rowElementwiseSums1.setPass(true);
            }else{
                rowElementwiseSums1.setPass(false);
            }
            tables[4].AddRow(rowElementwiseSums1);
            
        //Test 2
            Row rowElementwiseSums2 = new Row();

            rowElementwiseSums2.setID("ElementwiseSums-2");
            rowElementwiseSums2.setDescription("Testing for ElementwiseSum(): Positive and negative integers");
            rowElementwiseSums2.setInput("[1, -2, 3, -4, 5]");
            rowElementwiseSums2.setInput("[6, 7, -8, 9, -10]");
            String expectedResult2 = "[7, 5, 6, 5, 5]";
            rowElementwiseSums2.setExpectedResult(expectedResult2);

            int[] input1b = {1,-2,3,-4,5};
            int[] input2b = {6,7,-8,9,-10};
            int[] result2 = ArrayUtils.elementwiseSums(input1b, input2b);
            rowElementwiseSums2.setActualResult(Arrays.toString(result2));
            //check if the expected result matches the actual result
            if(expectedResult2.equals(Arrays.toString(result2))){
                rowElementwiseSums2.setPass(true);
            }else{
                rowElementwiseSums2.setPass(false);
            }
            tables[4].AddRow(rowElementwiseSums2);
            
        //Test 3
            Row rowElementwiseSums3 = new Row();

            rowElementwiseSums3.setID("ElementwiseSums-3");
            rowElementwiseSums3.setDescription("Testing for ElementwiseSum(): Negative integer arrays");
            rowElementwiseSums3.setInput("[-1, -2, -3, -4, -5]");
            rowElementwiseSums3.setInput("[-6, -7, -8, -9, -10]");
            String expectedResult3 = "[-7, -9, -11, -13, -15]";
            rowElementwiseSums3.setExpectedResult(expectedResult3);

            int[] input1c = {-1,-2,-3,-4,-5};
            int[] input2c = {-6,-7,-8,-9,-10};
            int[] result3 = ArrayUtils.elementwiseSums(input1c, input2c);
            rowElementwiseSums3.setActualResult(Arrays.toString(result3));
            //check if the expected result matches the actual result
            if(expectedResult3.equals(Arrays.toString(result3))){
                rowElementwiseSums3.setPass(true);
            }else{
                rowElementwiseSums3.setPass(false);
            }
            tables[4].AddRow(rowElementwiseSums3);
    }
   
    private void runTestFrequency() {
    
//    Tests for frequency()  
        Table testFrequency = new Table("frequency");
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
    
    private void runTestIsSorted() {
        
        Table testIsSorted = new Table("isSorted");
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
    
    private void runTestMerge() {
        
        Table testMerge = new Table("merge");
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
    
    private void runTestReverse() {
        Table testReverse = new Table("reverse");
        tables[8] = testReverse;
//        Test 1
        Row rowTestReverse1 = new Row();
        rowTestReverse1.setID("testReverse-1");
        rowTestReverse1.setDescription("Passing an array with 3 items");
        
        int[] input1 = {2,7,9};
        int[] expectedResult1 = {9,7,2};
        
        rowTestReverse1.setInput(Arrays.toString(input1));
        
        rowTestReverse1.setExpectedResult(Arrays.toString(expectedResult1));
        
        int[] result1 = ArrayUtils.reverse(input1);
        
        rowTestReverse1.setActualResult(Arrays.toString(result1));
        rowTestReverse1.setPass(Arrays.equals(expectedResult1, result1));
        
        testReverse.AddRow(rowTestReverse1);
        
//        Test 2
        Row rowTestReverse2 = new Row();
        rowTestReverse2.setID("testReverse-2");
        rowTestReverse2.setDescription("Passing an array with 2 items");
        
        int[] input2 = {2,7};
        int[] expectedResult2 = {7,2};
        
        rowTestReverse2.setInput(Arrays.toString(input2));
        
        rowTestReverse2.setExpectedResult(Arrays.toString(expectedResult2));
        
        int[] result2 = ArrayUtils.reverse(input2);
        
        rowTestReverse2.setActualResult(Arrays.toString(result2));
        rowTestReverse2.setPass(Arrays.equals(expectedResult2, result2));
        
        testReverse.AddRow(rowTestReverse2);

//        Test 3
        Row rowTestReverse3 = new Row();
        rowTestReverse3.setID("testReverse-3");
        rowTestReverse3.setDescription("Passing an array with 1 item");
        
        int[] input3 = {7};
        int[] expectedResult3 = {7};
        
        rowTestReverse3.setInput(Arrays.toString(input3));
        
        rowTestReverse3.setExpectedResult(Arrays.toString(expectedResult3));
        
        int[] result3 = ArrayUtils.reverse(input3);
        
        rowTestReverse3.setActualResult(Arrays.toString(result3));
        rowTestReverse3.setPass(Arrays.equals(expectedResult3, result3));
        
        testReverse.AddRow(rowTestReverse3);

//        Test 4
        Row rowTestReverse4 = new Row();
        rowTestReverse4.setID("testReverse-4");
        rowTestReverse4.setDescription("Passing an empty array");
        
        int[] input4 = {};
        int[] expectedResult4 = {};
        
        rowTestReverse4.setInput(Arrays.toString(input4));
        
        rowTestReverse4.setExpectedResult(Arrays.toString(expectedResult4));
        
        int[] result4 = ArrayUtils.reverse(input4);
        
        rowTestReverse4.setActualResult(Arrays.toString(result4));
        rowTestReverse4.setPass(Arrays.equals(expectedResult4, result4));
        
        testReverse.AddRow(rowTestReverse4);         
    }
    
    private void runTestScale() {
        Table testScale = new Table("scale");
        tables[9] = testScale;
//        Test 1
        Row rowTestScale1 = new Row();
        rowTestScale1.setID("testScale-1");
        rowTestScale1.setDescription("Passing an array with 3 items and a scale");
        
        int[] input1a = {2,7,9};
        int input1b = 2;
        int[] expectedResult1 = {4,14,18};
        
        rowTestScale1.setInput(Arrays.toString(input1a));
        rowTestScale1.setInput(String.valueOf(input1b));
        
        rowTestScale1.setExpectedResult(Arrays.toString(expectedResult1));
        
        int[] result1 = ArrayUtils.scale(input1a,input1b);
        
        rowTestScale1.setActualResult(Arrays.toString(result1));
        rowTestScale1.setPass(Arrays.equals(expectedResult1, result1));
        
        testScale.AddRow(rowTestScale1);
        
//        Test 2
        Row rowTestScale2 = new Row();
        rowTestScale2.setID("testScale-2");
        rowTestScale2.setDescription("Passing an array with 1 item and a scale");
        
        int[] input2a = {11};
        int input2b = 7;
        int[] expectedResult2 = {77};
        
        rowTestScale2.setInput(Arrays.toString(input2a));
        rowTestScale2.setInput(String.valueOf(input2b));
        
        rowTestScale2.setExpectedResult(Arrays.toString(expectedResult2));
        
        int[] result2 = ArrayUtils.scale(input2a,input2b);
        
        rowTestScale2.setActualResult(Arrays.toString(result2));
        rowTestScale2.setPass(Arrays.equals(expectedResult2, result2));
        
        testScale.AddRow(rowTestScale2);
        
//        Test 3
        Row rowTestScale3 = new Row();
        rowTestScale3.setID("testScale-3");
        rowTestScale3.setDescription("Passing an array with negative numbers and a scale");
        
        int[] input3a = {-10,-3,-50};
        int input3b = 5;
        int[] expectedResult3 = {-50,-15,-250};
        
        rowTestScale3.setInput(Arrays.toString(input3a));
        rowTestScale3.setInput(String.valueOf(input3b));
        
        rowTestScale3.setExpectedResult(Arrays.toString(expectedResult3));
        
        int[] result3 = ArrayUtils.scale(input3a,input3b);
        
        rowTestScale3.setActualResult(Arrays.toString(result3));
        rowTestScale3.setPass(Arrays.equals(expectedResult3, result3));
        
        testScale.AddRow(rowTestScale3);
        
//        Test 4
        Row rowTestScale4 = new Row();
        rowTestScale4.setID("testScale-4");
        rowTestScale4.setDescription("Passing an array with an empty array");
        
        int[] input4a = {};
        int input4b = 5;
        int[] expectedResult4 = {};
        
        rowTestScale4.setInput(Arrays.toString(input4a));
        rowTestScale4.setInput(String.valueOf(input4b));
        
        rowTestScale4.setExpectedResult(Arrays.toString(expectedResult4));
        
        int[] result4 = ArrayUtils.scale(input4a,input4b);
        
        rowTestScale4.setActualResult(Arrays.toString(result4));
        rowTestScale4.setPass(Arrays.equals(expectedResult4, result4));
        
        testScale.AddRow(rowTestScale4);
    }
  
    private void runTests() {
    // Call test methods
        runTestsApplyMask();
        runTestsConcatenate();
        runTestContains();
        runTestCumulativeSums();
        runTestElementwiseSums();
        runTestFrequency();
        runTestIsSorted();
        runTestMerge();
        runTestReverse();
        runTestScale();
    }
    
    private void showReport() {
        String testResultTable = "<!DOCTYPE html><html><head><title>Test</title><meta charset=\"utf-8\"><style>\n" +
        "html {margin: 2%;} th{font-size:1.3em;}\n" +
        "table,th, td {border: 1px solid black;border-collapse: collapse;padding: 6px;}\n" +
        "table {width: 95%;}td:first-child, td:nth-child(6) {width: 6%;}\n" +
        "td {width: 22%;}.fail {background-color: pink;}</style></head><body>\n" +
        "<h1>Test Result:</h1>";
        
        for(Table table : tables) {
            if(table != null)
                testResultTable += table.getTable();
        }
        testResultTable += "</body></html>";
        
        //System.out.println(testResultTable);
        // create an html file and write the output in the file
        String filePath = "C:\\Users\\tendh\\OneDrive\\Documents\\IT-PA\\4-Fall Term\\PROG1303E-Java Programming\\Assignments\\Java_Assignment2\\src\\arrayutils\\TestResult.html";
        try {
            
            // write output to html file
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write(testResultTable);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
    
    public static void main (String[] args) {
        ArrayUtilsTester tester = new ArrayUtilsTester();
        tester.runTests();
        tester.showReport();
    } // end main
} // end class ArrayUtilsTester
