package com.zolghadr.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
                String name=edtName.getText().toString();
                Intent nameIntent= new Intent(Profile.this,Review.class);
                startActivity(nameIntent);
                nameIntent.putExtra("name",name);

                String lastname=edtLastName.getText().toString();
                Intent lastnameIntent= new Intent(Profile.this,Review.class);
                startActivity(lastnameIntent);
                lastnameIntent.putExtra("lastname",lastname);

                String number=edtNumber.getText().toString();
                Intent numberIntent= new Intent(Profile.this,Review.class);
                startActivity(numberIntent);
                numberIntent.putExtra("number",number);

                String age=edtAge.getText().toString();
                Intent ageIntent= new Intent(Profile.this,Review.class);
                startActivity(ageIntent);
                ageIntent.putExtra("age",age);

                String address=edtAddress.getText().toString();
                Intent addressIntent= new Intent(Profile.this,Review.class);
                startActivity(addressIntent);
                addressIntent.putExtra("address",address);
            }
        });




    }
}
