package arrayutils;

import java.util.Arrays;

public class ArrayUtilsTester {
    
    
    private Table[] tables = new Table[10];
    
    public void runTestsApplyMask() {
        //Tests for ApplyMask()
            tables[0] = new Table();
        //Test 1
            Row rowApplyMask1 = new Row();

            rowApplyMask1.setID("ApplyMask-1");
            rowApplyMask1.setDescription("Testing for ApplyMask(): Normal numbers <= 10");
            rowApplyMask1.setInput("1,20,13,4,5,3");
            rowApplyMask1.setInput("true, false, false, true, true, true");
            String expectedResult1 = "[1, 4, 5, 3]";
            rowApplyMask1.setExpectedResult(expectedResult1);

            int[] input1a = {1,20,13,4,5,3};
            boolean[] input2a = {true, false, false, true, true, true};
            int[] result1 = ArrayUtils.ApplyMask(input1a, input2a);
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
            rowApplyMask2.setInput("9,10,11,99,8,6");
            rowApplyMask2.setInput("true, true, false, false, true, true");
            String expectedResult2 = "[9, 10, 8, 6]";
            rowApplyMask2.setExpectedResult(expectedResult2);

            int[] input1b = {9,10,11,78,8,6};
            boolean[] input2b = {true, true, false, false, true, true};
            int[] result2 = ArrayUtils.ApplyMask(input1b, input2b);
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
            rowApplyMask3.setInput("11,-2,3,0,5,-6");
            rowApplyMask3.setInput("false, false, true, true, true, false");
            String expectedResult3 = "[3, 5]";
            rowApplyMask3.setExpectedResult(expectedResult3);

            int[] input1c = {11,-2,3,0,5,-6};
            boolean[] input2c = {false, false, true, true, true, false};
            int[] result3 = ArrayUtils.ApplyMask(input1c, input2c);
            rowApplyMask3.setActualResult(Arrays.toString(result3));
            //check if the expected result matches the actual result
            if(expectedResult3.equals(Arrays.toString(result3))){
                rowApplyMask3.setPass(true);
            }else{
                rowApplyMask3.setPass(false);
            }
            tables[0].AddRow(rowApplyMask3);
    }
    
    public void runTestsConcatenate() {
        //Tests for Concatenate()
            tables[1] = new Table();
        //Test 1
            Row rowConcatenate1 = new Row();

            rowConcatenate1.setID("Concatenate-1");
            rowConcatenate1.setDescription("Testing for Concatenating(): Normal integer arrays of same size");
            rowConcatenate1.setInput("1,2,3,4, 5");
            rowConcatenate1.setInput("6,7,8,9,10");
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
            rowConcatenate2.setInput("-1,0,2,-60,100");
            rowConcatenate2.setInput("200,-99,45,3,58,32,-50");
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
            rowConcatenate3.setInput("11,-2,3,0,5,-6");
            rowConcatenate3.setInput("");
            String expectedResult3 = "[11, -2,  3, 0, 5, -6]";
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
    
    public void runTestContains(){
        //Tests for Contains()
            tables[2] = new Table();
            
        //Test 1
            Row rowContains1 = new Row();

            rowContains1.setID("Contains-1");
            rowContains1.setDescription("Testing for Contains(): Normal key search");
            rowContains1.setInput("1,2,3,4,5");
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
            rowContains2.setInput("1,-2,3,4,-5");
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
            rowContains3.setInput("0,-2,3,4,-5");
            rowContains3.setInput("-0");
            String expectedResult3 = "false";
            rowContains3.setExpectedResult(expectedResult2);

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
    
    public void runTestCumulativeSums(){
        //Tests for CumulativeSum()
            tables[3] = new Table();
            
        //Test 1
            Row rowCumulativeSums1 = new Row();

            rowCumulativeSums1.setID("CumulativeSum-1");
            rowCumulativeSums1.setDescription("Testing for CumulativeSum(): Normal integers");
            rowCumulativeSums1.setInput("1,2,3,8,5");
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
            rowCumulativeSums2.setInput("1,-2,3,4,-5");
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
            rowCumulativeSums3.setInput("-7,-6,-5,-4,-3,-2");
            String expectedResult3 = "[-7, -13, -18, -22, -24]";
            rowCumulativeSums3.setExpectedResult(expectedResult3);

            int[] input3a = {-7,-6,-5,-4,-3,-2};
            int[] result3 = ArrayUtils.cumulativeSums(input3a);
            rowCumulativeSums3.setActualResult(Arrays.toString(result3));
            //check if the expected result matches the actual result
            if(expectedResult2.equals(Arrays.toString(result3))){
                rowCumulativeSums3.setPass(true);
            }else{
                rowCumulativeSums3.setPass(false);
            }
            tables[3].AddRow(rowCumulativeSums3);
           
    }
    
    public void runTestElementwiseSums(){
        //Tests for ElementwiseSums()
            tables[4] = new Table();
            
        //Test 1
            Row rowElementwiseSums1 = new Row();

            rowElementwiseSums1.setID("ElementwiseSums-1");
            rowElementwiseSums1.setDescription("Testing for ElementwiseSum(): Normal integers");
            rowElementwiseSums1.setInput("1,2,3,4,5");
            rowElementwiseSums1.setInput("6,7,8,9,10");
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
            rowElementwiseSums2.setInput("1,-2,3,-4,5");
            rowElementwiseSums2.setInput("6,7,-8,9,-10");
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
            rowElementwiseSums3.setInput("-1,-2,-3,-4,-5");
            rowElementwiseSums3.setInput("-6,-7,-8,-9,-10");
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
    
    public void runTests() {
        // Call test methods
            runTestsApplyMask();
            runTestsConcatenate();
            runTestContains();
            runTestCumulativeSums();
            runTestElementwiseSums();
    }
    
    public void showReport() {
        
    }
    
    public static void main (String[] args) {
        ArrayUtilsTester tester = new ArrayUtilsTester();
        tester.runTests();
        tester.showReport();
    } // end main
} // end class ArrayUtilsTester
