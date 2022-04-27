package com.example.jobdata;

import java.util.ArrayList;

public class DataObject {
    private String empname;
    private String empemail;
    private String empdesignation;

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpemail() {
        return empemail;
    }

    public void setEmpemail(String empemail) {
        this.empemail = empemail;
    }

    public String getEmpdesignation() {
        return empdesignation;
    }

    public void setEmpdesignation(String empdesignation) {
        this.empdesignation = empdesignation;
    }
    private static int lastContactId = 0;

    public static ArrayList<DataObject> CreateFakeList() {
        ArrayList<DataObject> sampleDatalist = new ArrayList<DataObject>();
        DataObject object = new DataObject();
        object.setEmpname("Nitin");
        object.setEmpemail("sitinoldae@gmail.com");
        object.setEmpdesignation("Android Developer");
        sampleDatalist.add(object);
        return sampleDatalist;
    }
}
