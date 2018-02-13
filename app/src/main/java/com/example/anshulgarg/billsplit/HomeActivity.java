package com.example.anshulgarg.billsplit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView tn, no, n1, n2, n3, n4, n5;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tn = findViewById(R.id.textView);
        no = findViewById(R.id.textView4);
        n1 = findViewById(R.id.textView5);
        n2 = findViewById(R.id.textView6);
        n3 = findViewById(R.id.textView7);
        n4 = findViewById(R.id.textView8);
        n5 = findViewById(R.id.textView9);
        b=findViewById(R.id.button);
    }
    public void switch_activity(View l){
        Intent i=new Intent(HomeActivity.this,WorkActivity.class);
        startActivity(i);
    }


    private void split(View view) {
        tn.getText();
        no.getText();
        n1.getText();
        n2.getText();
        n3.getText();
        n4.getText();
        n5.getText();

    }
}
