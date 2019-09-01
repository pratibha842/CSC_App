package com.example.csccollege;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_profile,btn_education,btn_health,btn_goal,btn_finance,btn_comfort;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       btn_profile = (Button)findViewById(R.id.buttonprofile);
       btn_education = (Button)findViewById(R.id.buttoneducation);
       btn_health = (Button)findViewById(R.id.buttonhealth);
       btn_goal = (Button)findViewById(R.id.buttongoal);
       btn_finance = (Button)findViewById(R.id.buttonfinance);
       btn_comfort = (Button)findViewById(R.id.buttoncomfort);

       btn_profile.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent int1 = new Intent(MainActivity.this, Home.class);
              startActivity(int1);
          }
      });

      btn_education.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent int2 = new Intent(MainActivity.this, Home.class);
              startActivity(int2);
          }
      });

      btn_health.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent int3 = new Intent(MainActivity.this, Home.class);
              startActivity(int3);
          }
      });

      btn_goal.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent int4 = new Intent(MainActivity.this, Home.class);
              startActivity(int4);
          }
      });

      btn_finance.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent int5 = new Intent(MainActivity.this, Home.class);
              startActivity(int5);
          }
      });

      btn_comfort.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent int6 = new Intent(MainActivity.this, Home.class);
              startActivity(int6);
          }
      });
    }
}
