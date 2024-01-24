package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemSelectedListener{
    protected EditText txtName;
    protected RadioGroup radioGroup2;
    protected EditText txtPhone;
    protected Spinner spinner1;
    protected Button btnAdd;
    protected ListView lstsv;
    protected ArrayAdapter<String> adapter;
    protected ArrayList<String> listsv;
    String[] courses = { "Hà Nội", "Nam Định", "Hải Phòng", "Hà Nam", "HCM", "Đà Nẵng" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listsv = new ArrayList<>();
        listsv.add("Nguyễn Văn An - Nam - 0963113494 - Hà Nội");
        listsv.add("Trần Thị Bích - Nữ - 0963114657 - Nam Định");
        listsv.add("Lương Thị Thu - Nữ - 0963117658 - HCM");
        Spinner spino = findViewById(R.id.spinner2);
        spino.setOnItemSelectedListener(this);
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, courses);

        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spino.setAdapter(ad);
        lstsv = findViewById(R.id.listView);
        adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                listsv
        );
        lstsv.setAdapter(adapter);
        txtName = findViewById(R.id.editTextText);
        radioGroup2 = findViewById(R.id.radioGroup);
        txtPhone = findViewById(R.id.editTextText2);
        spinner1 = findViewById(R.id.spinner2);
        btnAdd = findViewById(R.id.button);
        listsv = new ArrayList<>();

        adapter = new ArrayAdapter<>(this, R.layout.activity_main,listsv);



    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(getApplicationContext(),courses[position],Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}