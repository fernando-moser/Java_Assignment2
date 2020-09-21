/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayutils;

/**
 *
 * @author ferna
 */
public final class Table {
    
    private String table = "<table>";
    
    public Table() {
        Row headerRow = new Row(true);
        headerRow.setID("Test ID");
        headerRow.setDescription("Description");
        headerRow.setInput("Inputs");
        headerRow.setExpectedResult("Expected Result");
        headerRow.setActualResult("Actual Result");
        headerRow.setPass("Pass?");
        AddRow(headerRow);
    }
    
    public void AddRow(Row row) {
        StringBuilder sBuilder = new StringBuilder();
        
        if(row.getPass().contains("false")) {
            sBuilder.append("<tr class=\"fail\">");
        } else {
            sBuilder.append("<tr>");
        }
        sBuilder.append(row.getID());
        sBuilder.append(row.getDescription());
        sBuilder.append(row.isIsHeaderRow() ? row.getInputs() : row.buildInputList());
        sBuilder.append(row.getExpectedResult());
        sBuilder.append(row.getActualResult());
        sBuilder.append(row.getPass());
        sBuilder.append("</tr>");
        
        this.table += sBuilder.toString();
    }
    
    public String getTable() {
        return table + "</table>";
    }
}
