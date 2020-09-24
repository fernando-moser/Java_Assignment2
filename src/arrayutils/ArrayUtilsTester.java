package arrayutils;

import java.util.Arrays;

public class ArrayUtilsTester {
    
    
    private Table[] tables = new Table[10];
    
    public void runTests() {
        tables[0] = new Table();
        Row rowApplyMask = new Row();
        
        rowApplyMask.setID("ApplyMask-1");
        rowApplyMask.setDescription("Testing an array of positive integers");
        rowApplyMask.setInput("1,-2,-3,4,5,-6");
        rowApplyMask.setInput("true, false, false, true, true, false");
        String expectedResult = "[1,4,5]";
        rowApplyMask.setExpectedResult(expectedResult);
        
        int[] input1 = {1,-2,-3,4,5,-6};
        boolean[] input2 = {true, false, false, true, true, false};
        int[] result = ArrayUtils.applyMask(input1, input2);
        rowApplyMask.setActualResult(Arrays.toString(result));
        //check if the expected result matches the actual result
        if(expectedResult.equals(Arrays.toString(result))){
            rowApplyMask.setPass(true);
        }else{
            rowApplyMask.setPass(false);
        }
        tables[0].AddRow(rowApplyMask);
        System.out.println(tables[0].getTable());

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
    
    public void showReport() {
        
    }
    
    public static void main (String[] args) {
        ArrayUtilsTester tester = new ArrayUtilsTester();
        tester.runTests();
        tester.showReport();
    } // end main
} // end class ArrayUtilsTester
