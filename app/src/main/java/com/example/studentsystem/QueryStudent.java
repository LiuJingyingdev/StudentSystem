package com.example.studentsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.litepal.crud.DataSupport;

import java.util.List;

public class QueryStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query_student);
        final EditText queryEdit = (EditText) findViewById(R.id.query_edit);
        Button queryEnter = (Button) findViewById(R.id.query_enter);
        final TextView queryView = (TextView) findViewById(R.id.query_text_view);
        Button queryAll = (Button) findViewById(R.id.query_all);
        queryEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* List<Student> students = DataSupport.findAll(Student.class);
                for (Student student:students){
                    queryView.append("学号：  "+String.valueOf(student.getNumber())+"\n"+"姓名：  "+student.getName()+"\n"+"性别：  "+String.valueOf(student.getSex())+"\n");
                }*/
                queryView.setText("");
               String queryName = queryEdit.getText().toString();
                String queryNumber = queryEdit.getText().toString();
                List<Student> students = DataSupport.where("number = ? or name = ?",queryName,queryName).find(Student.class);
                for (Student student:students){
                    queryView.append("学号：  "+String.valueOf(student.getNumber())+"\n"+"姓名：  "+student.getName()+"\n"+"性别：  "+String.valueOf(student.getSex()));
                }
                Toast.makeText(QueryStudent.this,"查询学生信息成功",Toast.LENGTH_SHORT).show();
            }
        });
        queryAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Student> students = DataSupport.findAll(Student.class);
                queryView.setText("");
                for (Student student:students){
                    queryView.append("学号：  "+String.valueOf(student.getNumber())+"\n"+"姓名：  "+student.getName()+"\n"+"性别：  "+String.valueOf(student.getSex())+"\n");
                }
                Toast.makeText(QueryStudent.this,"查询信息成功",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
