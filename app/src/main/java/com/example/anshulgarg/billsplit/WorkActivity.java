package com.example.anshulgarg.billsplit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WorkActivity extends AppCompatActivity {
 TextView t1,t2,t3,t4,t5,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        t1=findViewById(R.id.textView14);
        t2=findViewById(R.id.textView15);
        t3=findViewById(R.id.textView16);
        t4=findViewById(R.id.textView17);
        t5=findViewById(R.id.textView18);
        result=findViewById(R.id.textView19);
    }

                public void splitBill(View view){
              double[] arr=new double[5];
              double sum=0.0,equal=0.0;
              int i=0,j=0;
              String s0=t1.getText().toString();
                arr[0]=Double.parseDouble(s0);
                    String s1=t2.getText().toString();
                    arr[1]=Double.parseDouble(s1);
                    String s2=t1.getText().toString();
                    arr[2]=Double.parseDouble(s2);
                    String s3=t1.getText().toString();
                    arr[3]=Double.parseDouble(s3);
                    String s4=t1.getText().toString();
                    arr[4]=Double.parseDouble(s4);
                sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
                   equal=sum/5.0;





            double[] rec=new double[5];
            double[] give=new double[5];
            for(i=0;i<5;i++){
                if(arr[i]>equal){
                    rec[i]=arr[i]-equal;
                    give[i]=0.0;}
                else{
                    give[i]=equal-arr[i];
                    rec[i]=0.0;}
            }
            for(i=0;i<5;i++){
                if(rec[i]==0.0)
                {continue;
                }
                for(j=0;j<5;j++){
                    if(give[j]==0.0 || rec[i]==0.0){
                        continue;}
                    if(give[j]<rec[i]){
                        result.setText(+" will receive Rs."+give[j]+" from "+name[j]);
                        System.out.println(name[i]+" will receive Rs."+give[j]+" from "+name[j]);
                        give[j]=0.0;rec[i]=rec[i]-give[j];
                        continue;}
                    if(rec[i] < give[j]){
                        result.setText();
                        result.setText(name[i]+" will receive Rs. "+rec[i]+" from "+name[j]);
                        rec[i]=0.0;
                        give[j]=give[j]-rec[i];
                        break;}
                    if(give[j]==rec[i]){
                        result.setText(name[i]+"will receive Rs."+rec[i]+" from "+name[j]);
                        rec[i]=0.0;
                        give[j]=0.0;
                        break;}
                }
            }
        }
    }
}
