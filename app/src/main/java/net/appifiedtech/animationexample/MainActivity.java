package net.appifiedtech.animationexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goNextActivity(View view) {
        Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_next,R.anim.slide_out_next);
    }
}
