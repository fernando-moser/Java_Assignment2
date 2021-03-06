/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayutils;

/**
 * This Class represents a HTML table results.
 * @author Fernando
 */
public final class Table {
    /**
     * Method name
     */
    private String methodName = "";
    /**
     * String containing the concatenated string as a HTML table.
     */
    private String table = "<table>";
    
    /**
     * Instantiates a table object and adds the header of a HTML table results
     * @param methodName
     */
    public Table(String methodName) {
        this.methodName = "<h1> Method: " + methodName + "</h1>";
        
        Row headerRow = new Row(true);
        headerRow.setId("Test ID");
        headerRow.setDescription("Description");
        headerRow.setInput("Inputs");
        headerRow.setExpectedResult("Expected Result");
        headerRow.setActualResult("Actual Result");
        headerRow.setPass("Pass?");
        addRow(headerRow);
    }
    /**
     * Adds a Row object into the table
     * @param row object with the test case. 
     */
    public void addRow(Row row) {
        //String builder to concatanate the strings
        StringBuilder sBuilder = new StringBuilder();
        //If Pass result is false, appends to the <tr> tag the css class "fail"
        if(row.getPass().contains("false")) {
            sBuilder.append("<tr class=\"fail\">");
        } else {
            sBuilder.append("<tr>");
        }
        sBuilder.append(row.getId());
        sBuilder.append(row.getDescription());
        sBuilder.append(row.isIsHeaderRow() ? row.getInputs() : row.buildInputList());
        sBuilder.append(row.getExpectedResult());
        sBuilder.append(row.getActualResult());
        sBuilder.append(row.getPass());
        sBuilder.append("</tr>");
        
        this.table += sBuilder.toString();
    }
    /**
     * Puts the closing </table> tag into the table string 
     * @return String containing the HTML table
     */
    public String getTable() {
        return methodName + table + "</table>";
    }
}
