package com.zolghadr.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Dial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dial);

        Button btnCall=findViewById(R.id.btnCall);
        final EditText edtPhone=findViewById(R.id.edtPhone);

        edtPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent callIntent=new Intent(Intent.ACTION_DIAL);
             callIntent.setData(Uri.parse("tel:"+edtPhone.getText().toString()));
             startActivity(callIntent);

            }
        });


    }
}
