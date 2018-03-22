package com.example.studentsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.litepal.crud.DataSupport;

public class DeleteStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_student);
        final EditText deleteEdit = (EditText) findViewById(R.id.delete_edit);
        Button deleteEnter = (Button) findViewById(R.id.delete_enter);
        Button deleteButton = (Button) findViewById(R.id.delete_button);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataSupport.deleteAll(Student.class);
            }
        });
        deleteEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String deleteName = deleteEdit.getText().toString();
                DataSupport.deleteAll(Student.class,"number = ? or name = ?",deleteName,deleteName);
                Toast.makeText(DeleteStudent.this,"删除信息成功",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
