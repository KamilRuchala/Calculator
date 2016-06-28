package com.example.kamil.calculator;

import android.util.StringBuilderPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Kamil on 26.06.2016.
 */

public class Listeners {

    private MainActivity _mainActivity;
    TextView result;

    public Listeners(MainActivity mActivity)
    {
        this._mainActivity = mActivity;
        result = Listeners.this._mainActivity.getResultTextView();
    }

    public class NumberListener implements View.OnClickListener {

        @Override
        public void onClick (View v) {

            String btnValue = ((Button)v).getText().toString();

            _mainActivity.setIsClearComma(true);
            _mainActivity.setIsClearOperation(true);

            if(result.getText().toString().equals("0") && !btnValue.equals("0"))
            {
                result.setText("");
            }
            else if(result.getText().toString().equals("0") && btnValue.equals("0"))
            {
                return;
            }

            result.setText(result.getText() + btnValue);
        }
    }

    public class OperationListener implements View.OnClickListener {

        @Override
        public void onClick (View v) {

            String btnValue = ((Button)v).getText().toString();

            result.setText(result.getText() + btnValue);
            _mainActivity.setIsClearComma(false);
            _mainActivity.setIsClearOperation(false);

        }
    }

    public class CommaListener implements View.OnClickListener {

        @Override
        public void onClick (View v) {

            result.setText(result.getText() + ",");
            _mainActivity.setIsClearComma(false);
            _mainActivity.setIsClearOperation(false);
        }
    }

    public class BackspaceListener implements View.OnClickListener {

        @Override
        public void onClick (View v) {

            String str = result.getText().toString();

            if (str!= null && str.length() > 0) {
                str = str.substring(0, str.length()-1);
                result.setText(str);
            }
            char lastChar = str.charAt(str.length()-1);

            if(lastChar == '+' || lastChar == '-' || lastChar == '*' || lastChar == '/' || lastChar == ',' || lastChar == '%')
            {
                _mainActivity.setIsClearComma(false);
                _mainActivity.setIsClearOperation(false);
            }
            else
            {
                _mainActivity.setIsClearComma(true);
                _mainActivity.setIsClearOperation(true);
            }
        }
    }

    public class ClearListener implements View.OnClickListener {

        @Override
        public void onClick (View v) {

            result.setText("0");
        }
    }

    public class ResultListener implements View.OnClickListener {

        @Override
        public void onClick (View v) {

            result.setText("RESULT");
        }

        private double calculateResult(String input)
        {
            char[] ops = {'+','-','*','/','%'};
            String[] values = input.split("\\+|\\-|\\*|/|%");

            double result = 0.0;
            int operationposition;

            for(int i = 0; i < values.length; i++)
            {

            }
        }
    }
}
