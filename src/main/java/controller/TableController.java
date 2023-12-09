package controller;

import model.Table;
import view.TableView;

import java.util.Arrays;
import java.util.Scanner;

public class TableController  {

    private Table tableModel;
    private TableView tableView;


    public TableController(Table tableModel,TableView tableView){
        this.tableModel=tableModel;
        this.tableView=tableView;
    }

    public TableController() {
    }

    //To control model Object


    public void setTableRow(int rowNumber){
        tableModel.setRowNumber(rowNumber);
    }

    public void setTableColumn(int columnNumber){
        tableModel.setColumnNumber(columnNumber);
    }

    public int getRowNumber(){
        return tableModel.getRowNumber();
    }

    public int getColumnNumber(){
        return tableModel.getColumnNumber();
    }

    public String[][] getTable(){
        return tableModel.getTable();
    }

    //to control view object

    public void updateView(){
        tableView.getTableView(tableModel.getTable());
    }





}
