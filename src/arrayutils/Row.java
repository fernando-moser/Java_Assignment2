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
    private String id;
    /**
     * description of the test case.
     */
    private String description;
    /**
     * input used to test the method.
     */
    private String input = "";
    /**
     * Expected result of the method's processing.
     */
    private String expectedResult;
    /**
     * Actual result output.
     */
    private String actualResult;
    /**
     * String value indicating whether it passed or not.
     */
    private String pass;
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
     * Gets the formatted id field surrounded by the appropriate tag accordingly with the isHeaderRow field
     * @return String containing the id
     */
    public String getId() {
        return id;
    }
    /**
     * Sets the id field by concatenating the String value with the appropriate tag accordingly with the isHeaderRow field
     * @param id 
     */
    public void setId(String id) {
        this.id = buildTableCell(id);
    }
    /**
     * Gets the formatted description field surrounded by the appropriate tag accordingly with the isHeaderRow field
     * @return String containing the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * Sets the description field by concatenating the String value with the appropriate tag accordingly with the isHeaderRow field
     * @param Description 
     */
    public void setDescription(String Description) {
        this.description = buildTableCell(Description);
    }
    /**
     * Gets the input filed 
     * @return String containing the input
     */
    public String getInputs() {
        return input;
    }
    /**
     * Sets the input field by concatenating the String value with the appropriate tag accordingly with the isHeaderRow field
     * @param Inputs 
     */
    public void setInput(String Inputs) {
        if(isHeaderRow) {
            this.input = buildTableCell(Inputs);
        } else {
            this.input += buildInput(Inputs);
        }
    }
    /**
     * Gets the expectedResult field surrounded by the appropriate tag accordingly with the isHeaderRow field
     * @return String containing the expectedResult
     */
    public String getExpectedResult() {
        return expectedResult;
    }
    /**
     * Sets the expectedResult field by concatenating the String value with the appropriate tag accordingly with the isHeaderRow field
     * @param ExpectedResult 
     */
    public void setExpectedResult(String ExpectedResult) {
        this.expectedResult = buildTableCell(ExpectedResult);
    }
    /**
     * Gets the actualResult field surrounded by the appropriate tag accordingly with the isHeaderRow field
     * @return String containing the actualResult
     */
    public String getActualResult() {
        return actualResult;
    }
    /**
     * Sets the actualResult field by concatenating the String value with the appropriate tag accordingly with the isHeaderRow field
     * @param ActualResult 
     */
    public void setActualResult(String ActualResult) {
        this.actualResult = buildTableCell(ActualResult);
    }
    /**
     * Gets the pass field surrounded by the appropriate tag accordingly with the isHeaderRow field
     * @return String containing the pass
     */
    public String getPass() {
        return pass;
    }
    /**
     * Sets the Pass field by concatenating the String value with the appropriate tag accordingly with the isHeaderRow field.
     * This method is different of the setPass(String Pass). This method, setPass(boolean Pass), sets the value to "true" or "false".
     * On the other hand, setPass(String Pass) sets whatever String value received in its argument. 
     * @param Pass 
     */
    public void setPass(boolean Pass) {
        this.pass = buildTableCell(Pass ? "true" : "false");
    }
    /**
     * Sets the Pass field by concatenating the String value with the appropriate tag accordingly with the isHeaderRow field.
     * See setPass(boolean Pass) for more information.
     * @param Pass 
     */
    public void setPass(String Pass) {
        this.pass = buildTableCell(Pass);
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
        return "<td><ul>" + this.input + "</ul></td>";
    }
    
}
