package com.example.pocketservice;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChooseroleActivity extends AppCompatActivity {

    ImageView cainsImage,ipsImage;





    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chooserole);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.chooserole), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

            cainsImage = findViewById(R.id.cainsImage);
            ipsImage = findViewById(R.id.ipsImage);

            cainsImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent( ChooseroleActivity.this, SignupActivity.class);
                    startActivity(myIntent);
                }
            });

            ipsImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ipsIntent = new Intent(ChooseroleActivity.this, spsignupActivity.class);
                    startActivity(ipsIntent);
                }
            });




        });

    }

}