package sdu.cs58.wipawee.animalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Explicit
    EditText nameEditText;
    Button startButton;
    String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกตัวแปล Initial View
        nameEditText = findViewById(R.id.edtName);
        startButton = findViewById(R.id.btnStart);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nameString = nameEditText.getText().toString().trim();//การเอาข้อความnameEditTextมาเก็บ namestring

               //check ค่าว่างในตัวแปล nameString
                if (nameString.length() == 0) {
                    Toast.makeText(getApplicationContext(), "กรุณากรอกชื่อด้วยค่ะ", Toast.LENGTH_SHORT).show();
                } else {
                    //เปิดหน้า Game
                    Intent startIntent = new Intent(MainActivity.this, GameActivity.class);
                    startIntent.putExtra("Name", nameString);
                    startActivity(startIntent);
                }
            }
        });
    }//end onCreate Method
}//end Class
