package com.example.activity2_lopez;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);
        EditText edtName = findViewById(R.id.edtName);
        TextView txtResult = findViewById(R.id.txtResult);
        Button btnHello = findViewById(R.id.btnHello);

        btnHello.setOnClickListener(v->{
            String name = edtName.getText().toString().trim();
            if (name.isEmpty()) {
                Toast.makeText(this, "Enter your ex-name", Toast.LENGTH_SHORT).show();
            } else {
                txtResult.setText("Hello: " + name + "!");
            }

            });
        }
    }
