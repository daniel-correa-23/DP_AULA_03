package com.desenvmovel.aula3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    //Depois
    private TextView mTextSelected;
    private NumberPicker.OnValueChangeListener valorAlteradoListener = new NumberPicker.OnValueChangeListener() {

        @Override
        public void onValueChange(NumberPicker numberPicker, int oldvalue, int newValue) {

            mTextSelected.setText("Valor selecionado:" + String.valueOf(newValue));

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumberPicker mNumberPicker = findViewById(R.id.numberPicker);
        mNumberPicker.setMinValue(0);
        mNumberPicker.setMaxValue(10);

        //Depois esses
        mNumberPicker.setOnValueChangedListener(valorAlteradoListener);
        mTextSelected = findViewById(R.id.textoSelecionado);

    }
}