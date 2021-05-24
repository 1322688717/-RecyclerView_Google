package com.example.recyclerview_document;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_view;
    private RecyclerView.Adapter CustomAdapter;
    private String[] dateset = {"1","2","1","2","1","2","1","2","1","2","1","2","1","2",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_view =  findViewById(R.id.rc_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv_view.setLayoutManager(linearLayoutManager);
        CustomAdapter = new CustomAdapter(dateset);
        rv_view.setAdapter(CustomAdapter);
    }
}