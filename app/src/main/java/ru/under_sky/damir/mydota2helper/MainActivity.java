package ru.under_sky.damir.mydota2helper;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText ed1, ed2, ed3;
    TextView tv;
    String a, b, c;
    int a1, b1, c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1.findViewById(R.id.EditText1);
        ed2.findViewById(R.id.EditText2);
        ed3.findViewById(R.id.EditText3);
        tv.findViewById(R.id.TextView);
        a = ed1.getText().toString();
        b = ed2.getText().toString();
        c = ed3.getText().toString();
        try {
            a1 = new Integer(a);
        }catch (NumberFormatException e) {
            tv.setText("Неверный формат строки!");
        }
        try {
            b1 = new Integer(b);
        }catch (NumberFormatException e) {
            tv.setText("Неверный формат строки!");
        }
        try {
            c1 = new Integer(c);
        }catch (NumberFormatException e) {
            tv.setText("Неверный формат строки!");
        }
        switch (a1){
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 29:
                break;
        }
    }
}
