package com.example.rasharun.listviewwithcustomadapter2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Student> students = new ArrayList<Student>();
        for(int i = 0 ; i<100 ; i++)
        {   Student std ;
            if(i%2 == 0) {
                std = new Student(" Girl " + i, R.drawable.girl, "85%");
            }
            else {
                std = new Student(" Boy "+ i , R.drawable. boy,"80%") ;
            }
            students.add(std);
        }


        ListView studentList = (ListView) findViewById(R.id.list_student);

        studentAdapter adapter = new studentAdapter(this ,students);

        studentList.setAdapter(adapter);
        studentList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // get the position of item
                Student std = students.get(i);

                Toast.makeText(view.getContext() ,std.name ,Toast.LENGTH_SHORT).show();
                if (i%2 == 0)
                {
                    Intent intent = new Intent(MainActivity.this , girlActivity2.class);
                    startActivity(intent);
                }
            }

        });
    }
}
