package com.example.saibunglows;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate Finished", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity", "onCreate");
        //defining card



    }

      @Override
      protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onCreate Finished",Toast.LENGTH_SHORT).show();
          Log.i("Mainactivity","onCreate");

      }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume Finished", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause Finished", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity", "onPause");


    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop Finished", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity", "onStop");


    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart Finished", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity", "onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy Finished", Toast.LENGTH_SHORT).show();
        Log.i("Mainactivity", "onDestroy");

    }


    public void doSomething(View view) {

        Intent i1 = new Intent(this, AboutUsActivity.class);
        startActivity(i1);
    }

        


    }






