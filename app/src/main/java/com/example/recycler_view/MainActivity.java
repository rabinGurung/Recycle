package com.example.recycler_view;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.recycler_view.Adapter_Classes.ContactAdapter;
import com.example.recycler_view.Model.Contacts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Contacts> list_contacts;
    public static final String Profile_intention1 = "Profile_intention1";
    public static final String Profile_intention2 = "Profile_intention2";
    public static final String Profile_intention3 = "Profile_intention3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycle);
        list_contacts = new ArrayList<>();
        list_contacts.add(new Contacts("Saugat Malla","9810245638",R.drawable.saugat));
        list_contacts.add(new Contacts("Dayahyang Rai","980103455",R.drawable.dahayang));
        list_contacts.add(new Contacts("Rajesh Hamal","9810245638",R.drawable.rajesh));
        list_contacts.add(new Contacts("Bhuwan KC","9810245638",R.drawable.bhuwan));


        ContactAdapter contactAdapter = new ContactAdapter(this,list_contacts);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }






}
