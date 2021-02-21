package com.example.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText editTextName;
    EditText editTextRollNo;
    EditText editTextDepartment;
    EditText editTextDepartmentCode;
    EditText editTextDOB;
    EditText editTextGender;
    Button add;
    DatabaseReference databaseReference;

    public void newEntry(View view){
        String name = editTextName.getText().toString();
        String rollNo= editTextRollNo.getText().toString();
        String department = editTextName.getText().toString();
        String departmentCode = editTextRollNo.getText().toString();
        String DOB = editTextDOB.getText().toString();
        String gender = editTextGender.getText().toString();

        if(!TextUtils.isEmpty(name)){
            String id = databaseReference.push().getKey();
            Student student = new Student(id,name, rollNo,department,departmentCode,DOB,gender);
            databaseReference.child(id).setValue(student);

        } else {
            Toast.makeText(this, "enter valid details", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextDepartment = (EditText) findViewById(R.id.editTextDepartment);
        editTextDepartmentCode = (EditText) findViewById(R.id.editTextDeprtmentCode);
        editTextDOB = (EditText) findViewById(R.id.editTextDOB);
        editTextRollNo = (EditText) findViewById(R.id.editTextDOB);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextGender = (EditText) findViewById(R.id.editTextGender);
        add = findViewById(R.id.button);

        databaseReference = FirebaseDatabase.getInstance().getReference();

    }
}