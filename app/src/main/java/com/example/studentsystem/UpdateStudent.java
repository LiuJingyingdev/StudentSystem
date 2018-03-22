package com.example.studentsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateStudent extends AppCompatActivity {

    private String inputNum;
    private  String inputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_student);

        final EditText updateNum = (EditText) findViewById(R.id.input_update_num);
        final EditText updateName = (EditText) findViewById(R.id.input_update_name);

        Button updateEnter1 = (Button) findViewById(R.id.update_enter1);


        updateEnter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum = updateNum.getText().toString();
                inputName = updateName.getText().toString();
                Intent intent = new Intent(UpdateStudent.this,UpdateStudentTwo.class);
                intent.putExtra("num",inputNum);
                intent.putExtra("name",inputName);
                startActivity(intent);
                Toast.makeText(UpdateStudent.this, "已经确定学生位置，请在下面输入新的信息", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
