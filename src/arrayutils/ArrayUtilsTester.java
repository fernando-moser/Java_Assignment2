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
    }
    
    public void showReport() {
        
    }
    
    public static void main (String[] args) {
        ArrayUtilsTester tester = new ArrayUtilsTester();
        tester.runTests();
        tester.showReport();
    } // end main
} // end class ArrayUtilsTester
