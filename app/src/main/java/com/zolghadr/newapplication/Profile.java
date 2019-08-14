package com.zolghadr.newapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        final EditText edtName=findViewById(R.id.edtName);
        final EditText edtLastName=findViewById(R.id.edtLastName);
        final EditText edtNumber=findViewById(R.id.edtNumber);
        final EditText edtAge=findViewById(R.id.edtAge);
        final EditText edtAddress=findViewById(R.id.edtAddress);
        Button btnReview=findViewById(R.id.btnReview);



        btnReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i= new Intent(Profile.this,Review.class);
                String name=edtName.getText().toString();
                String lastname=edtLastName.getText().toString();
                String number=edtNumber.getText().toString();
                String age=edtAge.getText().toString();
                String address=edtAddress.getText().toString();

                i.putExtra("name",name);
                i.putExtra("lastname",lastname);
                i.putExtra("number",number);
                i.putExtra("age",age);
                i.putExtra("address",address);

                startActivityForResult(i,500);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==500)
            if (resultCode== Activity.RESULT_OK){
                Toast.makeText(Profile.this, "Your information has been saved successfully", Toast.LENGTH_LONG).show();
            }
    }
}
