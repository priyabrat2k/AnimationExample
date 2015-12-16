package net.appifiedtech.animationexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.slide_in_prev,R.anim.slide_out_prev);
    }

    public void backPreviousActivity(View view) {
        finish();
        overridePendingTransition(R.anim.slide_in_prev, R.anim.slide_out_prev);
    }
}
