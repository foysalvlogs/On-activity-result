package com.foysaldev.onactivityresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class SecondActivity extends AppCompatActivity {

    private MaterialButton button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.ButtonidTwo);
        editText = findViewById(R.id.EditTextid);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                Intent intent = new Intent(SecondActivity.this,FirstActivity.class);
                intent.putExtra("key",text);
                setResult(1,intent);
                finish();
            }
        });
    }
}