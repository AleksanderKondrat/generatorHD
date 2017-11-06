package com.stencel;

import java.io.IOException;
import java.util.ArrayList;

public class Insert {
    private String table;
    private ArrayList<String> values;
    private File insertFile;
    private String insertIntoConst = "INSERT INTO ";
    private String valuesConst = " VALUES(";

    public Insert(String table, ArrayList<String> values) {
        this.table = table;
        this.values = values;
        this.insertFile = new File(this.table + ".sql",true);

        try {
            this.createInsert();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createInsert() throws IOException {
        String text = this.insertIntoConst + this.table + this.valuesConst;
        insertFile.saveToFile(text);
        insertFile.closeFile();
    }
}
