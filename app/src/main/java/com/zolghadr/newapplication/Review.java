package com.zolghadr.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.preference.PreferenceManager;


public class Review extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        final TextView txtName=findViewById(R.id.txtName);
        final TextView txtLastName=findViewById(R.id.txtLastName);
        final TextView txtAge=findViewById(R.id.txtAge);
        final TextView txtNumber=findViewById(R.id.txtNumber);
        final TextView txtAddress=findViewById(R.id.txtAddress);
        Button btnEdit=findViewById(R.id.btnEdit);
        Button btnConfirm=findViewById(R.id.btnConfirm);




        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Review.this,Profile.class);
                finish();
            }
        });

        Intent i=getIntent();
        String name=i.getStringExtra("name");
        txtName.setText(name);


        Intent lastName=getIntent();
        final String lastname=lastName.getStringExtra("lastname");
        txtLastName.setText(lastname);

        Intent a=getIntent();
        String age=a.getStringExtra("age");
        txtAge.setText(age);

        Intent n=getIntent();
        String number=n.getStringExtra("number");
        txtNumber.setText(number);

        Intent ad=getIntent();
        String address=ad.getStringExtra("address");
        txtAddress.setText(address);

         btnConfirm.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String name=txtName.getText().toString();
              PreferenceManager.getDefaultSharedPreferences(Review.this)
                              .edit()
                              .putString("name",name)
                              .apply();

              String lastName=txtLastName.getText().toString();
              PreferenceManager.getDefaultSharedPreferences(Review.this)
                      .edit()
                      .putString("lastname",lastname)
                      .apply();

              String age=txtAge.getText().toString();
              PreferenceManager.getDefaultSharedPreferences(Review.this)
                      .edit()
                      .putString("age",age)
                      .apply();

              String number=txtNumber.getText().toString();
              PreferenceManager.getDefaultSharedPreferences(Review.this)
                      .edit()
                      .putString("number",number)
                      .apply();

              String address=txtAddress.getText().toString();
              PreferenceManager.getDefaultSharedPreferences(Review.this)
                      .edit()
                      .putString("address",address)
                      .apply();


              Intent finalPage=new Intent();
              setResult(Activity.RESULT_OK,finalPage);
              finish();
          }
           });



    }



}
