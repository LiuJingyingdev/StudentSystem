package com.example.studentsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudent extends AppCompatActivity {

    private EditText numEdit;

    private EditText nameEdit;

    private EditText sexEdit;

    private Button addEnter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        numEdit = (EditText) findViewById(R.id.num_edit);
        nameEdit = (EditText) findViewById(R.id.name_edit);
        sexEdit = (EditText) findViewById(R.id.sex_edit);
        addEnter = (Button) findViewById(R.id.add_enter);
        addEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = new Student();
                long number = Long.valueOf(numEdit.getText().toString());
                String name = nameEdit.getText().toString();
                String sex = sexEdit.getText().toString();
                student.setNumber(number);
                student.setName(name);
                student.setSex(sex);
                student.save();
                Toast.makeText(AddStudent.this,"增加数据成功",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
