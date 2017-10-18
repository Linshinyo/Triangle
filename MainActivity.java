package com.example.shinyo.triangle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ttv1;
    int i, j, k;
    String a="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ttv1=(TextView)findViewById(R.id.tv);

        for(i=0;i<4;i++)
        {
            a="*"+a;

            for(j=4;j>i+1;j--)
            {
                a="* "+a;
            }
            for(k=0;k<i+1;k++)
            {
                a=" "+a;
            }
            a="\n"+a;
        }
        ttv1.setText(a);

    }

}
