package com.example.aromal.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.lang.*;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.aromal.bmi.R.id.weight;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText height=(EditText)findViewById(R.id.height);
        final EditText weight=(EditText)findViewById(R.id.weight);
        final TextView t =(TextView)findViewById(R.id.final_bmi);
        final TextView res =(TextView)findViewById(R.id.res);
        Button r= (Button) findViewById(R.id.reset);


        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                height.setText("");
                weight.setText("");
                t.setText("0");
                res.setText("Result");
            }
        });


    }
    public void onclick(View v)
    {
        final EditText height=(EditText)findViewById(R.id.height);
        final EditText weight=(EditText)findViewById(R.id.weight);
        float h= Integer.parseInt(height.getText().toString());
        float w= Integer.parseInt(weight.getText().toString());
       float h2=h/100;



       float bmi=  (w/(h2*h2));
        //float fbmi=(float)bmi;
        TextView t =(TextView)findViewById(R.id.final_bmi);
        TextView res =(TextView)findViewById(R.id.res);
String Bmi=Double.toString(bmi);
        t.setText(Bmi);

        if(bmi<18.5)
        {
            res.setText("You are Underweight!");
        }else
        if(bmi>18.5&&bmi<24.9)
        {
            res.setText("You are Healthy!");
        }
        else
        if(bmi>25)
        {
            res.setText("You are Overweight!");
        }




    }

}
