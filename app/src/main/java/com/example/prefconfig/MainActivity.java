package com.example.prefconfig;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button button;
    String t1;
    boolean change = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button1);
        //save eden zadyny cekya 
        t1=prefconfig.loadAIRTimeKey(getApplicationContext());


        button.setOnClickListener(new View.OnClickListener() {
            private String loadAIRTimeKey;
            private String saveAIRTimeKey;


            @Override
            public void onClick(View view) {
                t1 = editText.getText().toString();
                textView.setText(t1);
                prefconfig.saveAIRTimeKey(getApplicationContext(), loadAIRTimeKey);

            }

        });



    }
}