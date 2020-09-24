/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayutils;

/**
 * This class represents a single row in a test method table.
 */
public class Row {
    /**
     * Identification of the test case.
     */
    private String ID;
    /**
     * Description of the test case.
     */
    private String Description;
    /**
     * Input used to test the method.
     */
    private String Input = "";
    /**
     * Expected result of the method's processing.
     */
    private String ExpectedResult;
    /**
     * Actual result output.
     */
    private String ActualResult;
    /**
     * String value indicating whether it passed or not.
     */
    private String Pass;
    /**
     * Indicates if the row object is a header.
     */
    private final boolean isHeaderRow;
    /**
     * Default constructor that calls a custom constructor passing the value of false.
     */
    public Row() {
        this(false);
    }
    /**
     * Constructs a new row and stating whether it is a header row or not.
     * In case it is a header row, the fields will be constructed using <th> tags.
     * Otherwise, it will construct the fields using <td> tags.
     * 
     * @param isHeaderRow 
     */
    public Row(boolean isHeaderRow) {
        this.isHeaderRow = isHeaderRow;
    }
    /**
     * Gets the formatted ID field surrounded by the appropriate tag accordingly with the isHeaderRow field
     * @return String containing the ID
     */
    public String getID() {
        return ID;
    }
    /**
     * Sets the ID field by concatenating the String value with the appropriate tag accordingly with the isHeaderRow field
     * @param ID 
     */
    public void setID(String ID) {
        this.ID = buildTableCell(ID);
    }
    /**
     * Gets the formatted description field surrounded by the appropriate tag accordingly with the isHeaderRow field
     * @return String containing the Description
     */
    public String getDescription() {
        return Description;
    }
    /**
     * Sets the Description field by concatenating the String value with the appropriate tag accordingly with the isHeaderRow field
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = buildTableCell(Description);
    }
    /**
     * Gets the input filed 
     * @return String containing the Input
     */
    public String getInputs() {
        return Input;
    }
    /**
     * Sets the input field by concatenating the String value with the appropriate tag accordingly with the isHeaderRow field
     * @param Inputs 
     */
    public void setInput(String Inputs) {
        if(isHeaderRow) {
            this.Input = buildTableCell(Inputs);
        } else {
            this.Input += buildInput(Inputs);
        }
    }
    /**
     * Gets the ExpectedResult field surrounded by the appropriate tag accordingly with the isHeaderRow field
     * @return String containing the ExpectedResult
     */
    public String getExpectedResult() {
        return ExpectedResult;
    }
    /**
     * Sets the ExpectedResult field by concatenating the String value with the appropriate tag accordingly with the isHeaderRow field
     * @param ExpectedResult 
     */
    public void setExpectedResult(String ExpectedResult) {
        this.ExpectedResult = buildTableCell(ExpectedResult);
    }
    /**
     * Gets the ActualResult field surrounded by the appropriate tag accordingly with the isHeaderRow field
     * @return String containing the ActualResult
     */
    public String getActualResult() {
        return ActualResult;
    }
    /**
     * Sets the ActualResult field by concatenating the String value with the appropriate tag accordingly with the isHeaderRow field
     * @param ActualResult 
     */
    public void setActualResult(String ActualResult) {
        this.ActualResult = buildTableCell(ActualResult);
    }
    /**
     * Gets the Pass field surrounded by the appropriate tag accordingly with the isHeaderRow field
     * @return String containing the Pass
     */
    public String getPass() {
        return Pass;
    }
    /**
     * Sets the Pass field by concatenating the String value with the appropriate tag accordingly with the isHeaderRow field.
     * This method is different of the setPass(String Pass). This method, setPass(boolean Pass), sets the value to "true" or "false".
     * On the other hand, setPass(String Pass) sets whatever String value received in its argument. 
     * @param Pass 
     */
    public void setPass(boolean Pass) {
        this.Pass = buildTableCell(Pass ? "true" : "false");
    }
    /**
     * Sets the Pass field by concatenating the String value with the appropriate tag accordingly with the isHeaderRow field.
     * See setPass(boolean Pass) for more information.
     * @param Pass 
     */
    public void setPass(String Pass) {
        this.Pass = buildTableCell(Pass);
    }
    /**
     * Gets the boolean value value indicating whether the instance is a headerRow or not.
     * @return true or false.
     */
    public boolean isIsHeaderRow() {
        return isHeaderRow;
    }
    /**
     * Concatenates the value received in its argument with the appropriate html tag.
     * @param td
     * @return String containing the field formatted to build a HTML table. 
     */
    private String buildTableCell(String td) {
        if(isHeaderRow) {
            return "<th>" + td + "</th>";
        } else {
            return "<td>" + td + "</td>";
        }
    }
    /**
     * Constructs a single input to be displayed in a html unordered list.
     * @param input
     * @return String containing the field formatted to build a HTML table. 
     */
    private String buildInput(String input) {
        return "<li>" + input + "</li>";
    }
    /**
     * Constructs a html unordered list by appending trailing and ending <ul> tags to the input.
     * @return String containing the field formatted to build a HTML table.
     */
    public String buildInputList() {
        return "<td><ul>" + this.Input + "</ul></td>";
    }
    
}
