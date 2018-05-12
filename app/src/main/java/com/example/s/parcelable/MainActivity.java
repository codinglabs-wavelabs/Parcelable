package com.example.s.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.name);
        et2 = findViewById(R.id.college);
        et3 = findViewById(R.id.qualification);
        button = findViewById(R.id.save);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = et1.getText().toString();
                String college = et2.getText().toString();
                String qualification = et3.getText().toString();
                Person person = new Person(name,college,qualification);
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("person",person);
                startActivity(intent);

            }
        });
    }
}
