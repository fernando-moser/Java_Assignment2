package arrayutils;

public class ArrayUtilsTester {

    String html = ""; // this is a class variable, so it's accessible by all methods.
    
    public void runTests() {
        
    }
    
    public void showReport() {
        
        //Test classes Table and Row to display results
        //Builds a table
        Table table = new Table();
        //Builds a row
        Row row = new Row();
        //Sets row's cells
        row.setID("ID test1");
        row.setDescription("Description test");
        row.setInput("Input 1");
        row.setInput("Input 2");
        row.setInput("Input 3");
        row.setExpectedResult("Expected result");
        row.setActualResult("Actual result");
        row.setPass(false);
        //Adds the row to the table
        table.AddRow(row);
        //Builds another row
        Row row2 = new Row();
        //Sets row's cells
        row2.setID("ID test2");
        row2.setDescription("Description test2");
        row2.setInput("Input 4");
        row2.setInput("Input 5");
        row2.setInput("Input 6");
        row2.setExpectedResult("Expected result");
        row2.setActualResult("Actual result");
        row2.setPass(true);
        //Adds the row to the table
        table.AddRow(row2);
        //Gets a HTML string of the table
        String table1 = table.getTable();
        //Prints out the string (for now, we need to copy it and paste in a HTML document. We'll make Java build the entire HTML file soon)
        System.out.println(table1);
        
        //**************
        
    }
    
    public static void main (String[] args) {
        ArrayUtilsTester tester = new ArrayUtilsTester();
        tester.runTests();
        tester.showReport();
    } // end main
} // end class ArrayUtilsTester
