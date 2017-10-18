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
        //每行一個星星
        for(i=0;i<5;i++)
        {
            //星星最前面加空白，讓他變成三角形
            for(k=5;k>i+1;k--)
            {
                a=a+"_";
            }
            //每一行星星前面要增加幾個星星
            //要分別增加0,1,2,3個，中間要夾空白
            for(j=1;j<i+1;j++)
            {
                a=a+"*1";
            }
            //每一行一個星星，跟換行
            a=a+"*\n";
        }
        ttv1.setText(a);

//        //反過來寫，由下往上堆
//
//        //每行一個星星
//        for(i=0;i<4;i++)
//        {
//            a="*"+a;
//            //每一行星星前面要增加幾個星星，因為String串起來的時候是由下往上算，所以要分別增加3,2,1個，中間要夾空白
//            for(j=4;j>i+1;j--)
//            {
//                a="* "+a;
//            }
//            //星星最前面也要加空白，讓他變成三角形
//            for(k=0;k<i+1;k++)
//            {
//                a=" "+a;
//            }
//            //換行
//            a="\n"+a;
//        }

    }

}
