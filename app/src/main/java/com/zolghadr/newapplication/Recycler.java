package com.zolghadr.newapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Recycler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);

        RecyclerView recycler=findViewById(R.id.recycler);
        Button btnMenu=findViewById(R.id.btnMenu);




        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DrawerLayout drwMenu=findViewById(R.id.drwMenu);
                drwMenu.openDrawer(GravityCompat.START);


            }
        });


        List<String> list= new ArrayList<>();

        list.add("Dial");
        list.add("Profile");
        list.add("Months");

        RecyclerAdapter adapter=new RecyclerAdapter(list,this);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(Recycler.this,RecyclerView.VERTICAL,false));
    }
}
