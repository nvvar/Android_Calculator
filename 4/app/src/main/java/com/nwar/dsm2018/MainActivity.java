package com.nwar.dsm2018;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView textView, texting;
    process p1 = new process();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.oResult);
        texting = (TextView)findViewById(R.id.texting);
    }
    public void zero(View v)
    {
        texting.setText(p1.total(0));
    }
    public void one(View v)
    {
        texting.setText(p1.total(1));
    }
    public void two(View v)
    {
        texting.setText(p1.total(2));
    }
    public void three(View v)
    {
        texting.setText(p1.total(3));
    }
    public void four(View v)
    {
        texting.setText(p1.total(4));
    }
    public void five(View v)
    {
        texting.setText(p1.total(5));
    }
    public void six(View v)
    {
        texting.setText(p1.total(6));
    }
    public void seven(View v)
    {
        texting.setText(p1.total(7));
    }
    public void eight(View v)
    {
        texting.setText(p1.total(8));
    }
    public void nine(View v)
    {
        texting.setText(p1.total(9));
    }
    public void plus(View v)
    {
        textView.setText(p1.symbol('+'));
        texting.setText("0");
    }
    public void minus(View v)
    {
        textView.setText(p1.symbol('-'));
        texting.setText("0");
    }
    public void multiply(View v)
    {
        textView.setText(p1.symbol('*'));
        texting.setText("0");
    }
    public void division(View v)
    {
        textView.setText(p1.symbol('/'));
        texting.setText("0");
    }
    public void reset(View v)
    {
        p1.fReset();
        textView.setText("0");
        texting.setText("0");
    }
    public void backSpace(View v)
    {
        textView.setText(p1.backsp());
        texting.setText(Integer.toString(p1.sum));
    }
    public void result(View v)
    {
        textView.setText(p1.setresult());
        texting.setText("0");
    }

}
class pro{
    int sum;
    int total_o;
    public pro(){
        sum = 0;
        total_o=sum;
    }

}
class process extends pro{
    char sym;
    int sReturn;
    public process(){
        this.sym = '0';
    }
    public String total(int input)
    {
        sum*=10;
        sum+=input;
        return Integer.toString(sum);
    }
    public String setresult()
    {
        String Return = symbol('0');
        sum = 0;
        total_o = 0;
        return Return;
    }
    public String symbol(char sym)
    {

        if(this.sym == '0')
        {
            sReturn = sum;
        }
        else if(this.sym=='+')
        {
            sReturn =sum + total_o;
        }
        else if(this.sym=='-')
        {
            sReturn =total_o - sum;
        }
        else if(this.sym=='*')
        {
            sReturn =sum*total_o;
        }
        else if(this.sym=='/')
        {
            sReturn =total_o/sum;
        }
        total_o = sReturn;
        sum = 0;
        this.sym = sym;
        return Integer.toString(sReturn);
    }
    public void fReset()
    {
        total_o = 0;
        sum = 0;
        sReturn = 0;
        sym = 0;
    }
    public String backsp()
    {
        sum /= 10;
        return Integer.toString(sum);
    }
}