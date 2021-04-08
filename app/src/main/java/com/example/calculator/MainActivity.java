package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button zero,one,two,three,four,five,six,seven,eight,nine,clear,add,sub,divide,multi,result;
TextView output;
String operator;
int finalresult;

int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10;
String digits;
EditText display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero=(Button) findViewById(R.id.button19);
    one=(Button)findViewById(R.id.button20);
    two=(Button)findViewById(R.id.button21);
    three=(Button)findViewById(R.id.button15);
    four=(Button) findViewById(R.id.button16);
    five=(Button)findViewById(R.id.button17);
    six=(Button)findViewById(R.id.button11);
    seven=(Button)findViewById(R.id.button12);
    eight=(Button)findViewById(R.id.button13);
    nine=(Button)findViewById(R.id.button7);
    result=(Button)findViewById(R.id.button8);
   add=(Button)findViewById(R.id.button9);
    sub=(Button)findViewById(R.id.button10);
    multi=(Button)findViewById(R.id.button14);
    divide=(Button)findViewById(R.id.button18);
    clear=(Button)findViewById(R.id.button22);
    output=(TextView) findViewById(R.id.textView);
display=(EditText)findViewById(R.id.editText2);


    }
    public void nineclicked(View view)
    {

      Toast.makeText(getApplicationContext(),"nine is pressed",Toast.LENGTH_LONG).show();
     display.setText("9");
     num1=Integer.parseInt("9");


    }
    public void sixclicked(View view)
    {
      Toast.makeText(getApplicationContext(),"six is pressed",Toast.LENGTH_LONG).show();
      display.setText("6");
      num2=Integer.parseInt("6");
    }
    public void fiveclicked(View view)
    {
Toast.makeText(getApplicationContext(),"five is pressed",Toast.LENGTH_LONG).show();
display.setText("5");
num3=Integer.parseInt("5");
    }
    public void fourclicked(View view)
    {
        Toast.makeText(getApplicationContext(),"four is pressed",Toast.LENGTH_LONG).show();
        display.setText("4");
        num4=Integer.parseInt("4");
    }
    public void sevenclicked(View view)
    {
        Toast.makeText(getApplicationContext(),"seven is pressed",Toast.LENGTH_LONG).show();
        display.setText("7");
        num5=Integer.parseInt("7");
    }
    public void eightclicked(View view)
    { Toast.makeText(getApplicationContext(),"eight is pressed",Toast.LENGTH_LONG).show();
        display.setText("8");
        num6=Integer.parseInt("8");

    }
    public void threeclicked(View view)
    {Toast.makeText(getApplicationContext(),"three is pressed",Toast.LENGTH_LONG).show();
        display.setText("3");
        num7=Integer.parseInt("3");

    }
    public void twoclicked(View view)
    {
        Toast.makeText(getApplicationContext(),"two is pressed",Toast.LENGTH_LONG).show();
        display.setText("2");
        num8=Integer.parseInt("2");


    }
    public void oneclicked(View view)
    {
        Toast.makeText(getApplicationContext(),"one is pressed",Toast.LENGTH_LONG).show();
        display.setText("1");
        num9=Integer.parseInt("1");
    }
    public void zeroclicked(View view)
    {
        Toast.makeText(getApplicationContext(),"zero is pressed",Toast.LENGTH_LONG).show();
        display.setText("0");
        num10=Integer.parseInt("0");
    }

    public void pluss(View view)
    {
        Toast.makeText(getApplicationContext(),"adder is pressed",Toast.LENGTH_LONG).show();
        display.setText("+");
        operator="+";
    }
    public void minus(View view)
    {
        Toast.makeText(getApplicationContext(),"subractor is pressed",Toast.LENGTH_LONG).show();
        display.setText("-");
        operator="-";
    }
    public void multiplier(View view)

    { Toast.makeText(getApplicationContext(),"multiplier is pressed",Toast.LENGTH_LONG).show();
        display.setText("*");
        operator="*";

    }
    public void resulting(View view)
    {
      finaloutput(num1,num2,operator,num3,num4,num5,num6,num7,num8,num9,num10);
    }

    public void finaloutput(int num1,int num2,String operator,int num3,int num4,int num5,int num6,int num7,int num8,int num9,int num10){
        if(operator=="+")
        {
            finalresult=num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
            output.setText(String.valueOf(finalresult));
        }
        else if(operator=="*")
        {
            finalresult=num1*num2*num3*num4*num5*num6*num7*num8*num9*num10;
            output.setText(String.valueOf(finalresult));
        }
    }

public void clearingtext(View view)
{
    display.getText().clear();
    output.setText("");


}


}
