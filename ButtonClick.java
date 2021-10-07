package com.example.calc;

import android.view.View;
import android.widget.TextView;

import com.example.calc.R;

public class ButtonClick implements View.OnClickListener{	
    private TextView output;
    CalcModel calcModel;
    ButtonClick(){
        calcModel =new CalcModel();
    }
    @Override
    public void onClick(View view) {
        //output.setText(buttonParm(view.getId()));
        calcModel.MainMode(buttonParm(view.getId()));
        output.setText(calcModel.getLineString());
    }
    void setOutputView(TextView out){
        output=out;
    }
    String buttonParm(int id){
        String ret = null;
        switch (id) {
            case R.id.button1:
                ret = "7";
                break;
            case R.id.button2:
                ret="8";
                break;
            case R.id.button3:
                ret="9";
                break;
            case R.id.button4:
                ret="*";
                break;
            case R.id.button5:
                ret="4";
                break;
            case R.id.button6:
                ret="5";
                break;
            case R.id.button7:
                ret="6";
                break;
            case R.id.button8:
                ret="/";
                break;
            case R.id.button9:
                ret="1";
                break;
            case R.id.button10:
                ret="2";
                break;
            case R.id.button11:
                ret="3";
                break;
            case R.id.button12:
                ret="-";
                break;
            case R.id.button13:
                ret="0";
                break;
            case R.id.button14:
                ret="=";
                break;
            case R.id.button15:
                ret="+";
                break;
            case R.id.button16:
                ret="C";
                break;
            case R.id.button17:
                ret="AC";
                break;
            case R.id.button18:
                ret=".";
                break;

            default:
                ret="E";
                break;
        }
        return ret;
    }
}
