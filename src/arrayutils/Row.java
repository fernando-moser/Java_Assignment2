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
public class Row {
    
    private String ID;
    private String Description;
    private String Input = "";
    private String ExpectedResult;
    private String ActualResult;
    private String Pass;
    private final boolean isHeaderRow;
    
    public Row() {
        this(false);
    }
    
    public Row(boolean isHeaderRow) {
        this.isHeaderRow = isHeaderRow;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = buildTableCell(ID);
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = buildTableCell(Description);
    }

    public String getInputs() {
        return Input;
    }

    public void setInput(String Inputs) {
        if(isHeaderRow) {
            this.Input = buildTableCell(Inputs);
        } else {
            this.Input += buildInput(Inputs);
        }
    }

    public String getExpectedResult() {
        return ExpectedResult;
    }

    public void setExpectedResult(String ExpectedResult) {
        this.ExpectedResult = buildTableCell(ExpectedResult);
    }

    public String getActualResult() {
        return ActualResult;
    }

    public void setActualResult(String ActualResult) {
        this.ActualResult = buildTableCell(ActualResult);
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(boolean Pass) {
        this.Pass = buildTableCell(Pass ? "true" : "false");
    }
    
    public void setPass(String Pass) {
        this.Pass = buildTableCell(Pass);
    }

    public boolean isIsHeaderRow() {
        return isHeaderRow;
    }
    
    private String buildTableCell(String td) {
        if(isHeaderRow) {
            return "<th>" + td + "</th>";
        } else {
            return "<td>" + td + "</td>";
        }
    }
    
    private String buildInput(String input) {
        return "<li>" + input + "</li>";
    }
    
    public String buildInputList() {
        return "<td><ul>" + this.Input + "</ul></td>";
    }
    
}
