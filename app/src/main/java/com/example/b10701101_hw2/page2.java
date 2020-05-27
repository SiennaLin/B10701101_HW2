package com.example.b10701101_hw2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class page2 extends AppCompatActivity {
    public static final String EXTRA_number="com.example.b10701101_hw2.EXTRA_number";
    public static final String EXTRA_name="com.example.b10701101_hw2.EXTRA_name";
    
    private EditText inputname;
    private EditText inputnumber;
    private Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        inputnumber = findViewById(R.id.inputnumber);
        inputname = findViewById(R.id.inputname);
    }

    private void saveNote(){
        String number = inputnumber.getText().toString();
        String name = inputname.getText().toString();

        Intent data =new Intent();
        data.putExtra(EXTRA_number,number);
        data.putExtra(EXTRA_name,name);

        setResult(RESULT_OK,data);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save_note:
                saveNote();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
