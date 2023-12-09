package model;

public class Table {

    private String[][] table={{"","",""},{"","",""},{"","",""}};
    private int rowNumber;
    private int columnNumber;

    public String[][] getTable() {
        return table;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getColumnNumber() {
        return getColumnNumber();
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber=rowNumber;
    }

    public void setColumnNumber(int columnNumber) {
        this.columnNumber=columnNumber;
    }
}
