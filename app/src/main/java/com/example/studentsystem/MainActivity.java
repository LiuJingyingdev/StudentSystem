package com.example.studentsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button createStudent = (Button) findViewById(R.id.create_data);
        createStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LitePal.getDatabase();
                Toast.makeText(MainActivity.this,"建立数据库成功",Toast.LENGTH_SHORT).show();
            }
        });
        Button addStudent = (Button) findViewById(R.id.add_stu);
        Button deleteStudent = (Button) findViewById(R.id.delete_stu);
        Button updateStudent = (Button) findViewById(R.id.update_stu);
        Button queryStudent = (Button) findViewById(R.id.query_stu);
        Button exitSystem = (Button) findViewById(R.id.exit_stu);

        addStudent.setOnClickListener(this);
        deleteStudent.setOnClickListener(this);
        updateStudent.setOnClickListener(this);
        queryStudent.setOnClickListener(this);
        exitSystem.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.add_stu:
                Intent intent1 = new Intent(MainActivity.this,AddStudent.class);
                startActivity(intent1);
                break;
            case R.id.delete_stu:
                Intent intent2 = new Intent(MainActivity.this,DeleteStudent.class);
                startActivity(intent2);
                break;
            case R.id.update_stu:
                Intent intent3 = new Intent(MainActivity.this,UpdateStudent.class);
                startActivity(intent3);
                break;
            case R.id.query_stu:
                Intent intent4 = new Intent(MainActivity.this,QueryStudent.class);
                startActivity(intent4);
                break;
            case R.id.exit_stu:
                finish();
                break;
            default:
                break;
        }
    }
}
