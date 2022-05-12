package com.example.calculadorajavamelhorada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1,num2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etvalor1=(EditText)findViewById(R.id.etvalor1);
        EditText etvalor2=(EditText)findViewById(R.id.etvalor2);
        Button btnsoma=(Button)findViewById(R.id.btnsoma);
        Button btnsubtracao=(Button)findViewById(R.id.btnsubtracao);
        Button btnmultiplicacao=(Button)findViewById(R.id.btnmultiplicacao);
        Button btndivisao=(Button)findViewById(R.id.btndivisao);
        TextView tvresultado=(TextView)findViewById(R.id.tvresultado);


        btnsoma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1=Double.parseDouble(etvalor1.getText().toString());
                num2=Double.parseDouble(etvalor2.getText().toString());
                res=num1+num2;
                tvresultado.setText(String.valueOf(res));
            }
        });

        btnsubtracao.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1=Double.parseDouble(etvalor1.getText().toString());
                num2=Double.parseDouble(etvalor2.getText().toString());
                res=num1-num2;
                tvresultado.setText(String.valueOf(res));
            }
        });

        btnmultiplicacao.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1=Double.parseDouble(etvalor1.getText().toString());
                num2=Double.parseDouble(etvalor2.getText().toString());
                res=num1+num2;
                tvresultado.setText(String.valueOf(res));
            }
        });

        btndivisao.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1=Double.parseDouble(etvalor1.getText().toString());
                num2=Double.parseDouble(etvalor2.getText().toString());
                res=num1/num2;
                tvresultado.setText(String.valueOf(res));
            }
        });
    }
}