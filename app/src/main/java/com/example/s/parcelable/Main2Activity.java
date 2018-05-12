package com.example.s.parcelable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView name;
    TextView college;
    TextView qualification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.name);
        college = findViewById(R.id.college);
        qualification = (TextView) findViewById(R.id.qualification);

        Person person = (Person) getIntent().getExtras().getParcelable("person");

        name.setText("Name: " + person.name);
        college.setText("College: " + person.college);
        qualification.setText("Qualification: " + person.qualification);
    }
}
