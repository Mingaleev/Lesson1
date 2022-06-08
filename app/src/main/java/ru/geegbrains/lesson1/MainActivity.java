package ru.geegbrains.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText editTextTop = findViewById(R.id.et_top);
        EditText editTextBottom = findViewById(R.id.et_bottom);
        Button button = findViewById(R.id.btn_button);
        TextView textView = findViewById(R.id.tv_result);

        button.setOnClickListener(v -> {
            try {
                Integer val1 = Integer.valueOf(editTextTop.getText().toString());
                Integer val2 = Integer.valueOf(editTextBottom.getText().toString());

                if (val1.equals(val2)) {
                    textView.setText("Равно");
                } else {
                    textView.setText("Не равно!!");
            }

            } catch (NumberFormatException e) {
                textView.setText("Поля не могут быть пустыми!!!123");
            }
        });
    }
}