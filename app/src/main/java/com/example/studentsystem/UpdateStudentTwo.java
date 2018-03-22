package com.example.studentsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateStudentTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_student_two);

        final EditText numberUpdate = (EditText) findViewById(R.id.num_update);
        final EditText nameUpdate = (EditText) findViewById(R.id.name_update);
        final EditText sexUpdate = (EditText) findViewById(R.id.sex_update);
        Button updateEnter2 = (Button) findViewById(R.id.update_enter2);
        updateEnter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                String inputNum = intent.getStringExtra("num");
                String inputName = intent.getStringExtra("name");
                long newNume = Long.valueOf(numberUpdate.getText().toString());
                String newName = nameUpdate.getText().toString();
                String newSex = sexUpdate.getText().toString();
                Student student = new Student();
                student.setNumber(newNume);
                student.setName(newName);
                student.setSex(newSex);
                student.updateAll("number = ? and name = ?",inputNum,inputName);
                Toast.makeText(UpdateStudentTwo.this,"更新学生信息成功",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
