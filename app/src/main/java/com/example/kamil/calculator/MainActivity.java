package com.example.kamil.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView _resultView;
    private boolean _clearComma;
    private boolean _clearNumber;
    private boolean _clearOpe;
    private UIElements.MainElements _uiElements;
    private List<Button> numbers;
    private List<Button> operations;

    public boolean getIsClearComma()
    {
        return this._clearComma;
    }

    public void setIsClearComma(boolean value)
    {
        _uiElements.get_comma().setEnabled(value);
        this._clearComma = value;
    }

    public boolean getIsClearNumber()
    {
        return this._clearNumber;
    }

    public void setIsClearNumber(boolean value)
    {
        for(Button nmb : numbers)
        {
            nmb.setEnabled(value);
        }
        this._clearNumber = value;
    }

    public boolean getIsClearOperation()
    {
        return this._clearOpe;
    }

    public void setIsClearOperation(boolean value)
    {
        for(Button op : operations)
        {
            op.setEnabled(value);
        }
        _uiElements.get_result().setEnabled(value);
        this._clearOpe = value;
    }

    public TextView  getResultTextView()
    {
        return this._resultView;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this._resultView = (TextView) findViewById(R.id.result_text);

        getUIElements();
        bindButtons();
        addListeners();
    }

    private void getUIElements()
    {
        if(_uiElements == null)
        {
            _uiElements = new UIElements.MainElements(this);
        }
    }

    private void bindButtons()
    {
        numbers = Arrays.asList(_uiElements.get_one(), _uiElements.get_two(), _uiElements.get_three(),
                _uiElements.get_four(), _uiElements.get_five(), _uiElements.get_six(),
                _uiElements.get_seven(), _uiElements.get_eight(), _uiElements.get_nine(),
                _uiElements.get_zero());

        operations = Arrays.asList(_uiElements.get_modulo(), _uiElements.get_add(), _uiElements.get_sub(),
                _uiElements.get_power(), _uiElements.get_divide(), _uiElements.get_multiply());
    }

    private void addListeners()
    {
        Listeners list = new Listeners(this);

        for(Button nmb : numbers)
        {
            nmb.setOnClickListener(list.new NumberListener());
        }

        for(Button op : operations)
        {
            op.setOnClickListener(list.new OperationListener());
        }

        _uiElements.get_result().setOnClickListener(list.new ResultListener());
        _uiElements.get_comma().setOnClickListener(list.new CommaListener());
        _uiElements.get_backspace().setOnClickListener(list.new BackspaceListener());
        _uiElements.get_clear().setOnClickListener(list.new ClearListener());
    }
}
