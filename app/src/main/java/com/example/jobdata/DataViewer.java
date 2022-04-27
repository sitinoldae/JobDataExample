package com.example.jobdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class DataViewer extends AppCompatActivity {

    ArrayList<DataObject> dataObjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_viewer);
        RecyclerView rvDataObject = (RecyclerView) findViewById(R.id.rvDataObject);
        dataObjects=DataObject.CreateFakeList();

    }
}