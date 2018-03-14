package sdu.cs58.wipawee.animalapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {
    //Explicit ประกาศตัวแปล
    Button btn1,btn2,btn3,btn4;
    ImageView questionImageView;
    ImageButton volumnImageButton;
    MediaPlayer mediaPlayer;// เล่นไฟล์เสียง
    int questionCount = 10;// เก็บขจำนวนข้อคำถาม
    ArrayList<Integer> qID = new ArrayList<Integer>();//ตัวแปลqID เป็นตัวแปลสุชนิดarrayแบบสุ่มคำถาม
    String answer;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //Initial view ผูกตัวแปลบน java
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        questionImageView = findViewById(R.id.imvQuestion);
        volumnImageButton = findViewById(R.id.imbVolumn);

        //แสดงคำถาม
        for (int i=1;i<= questionCount;i++) {
            qID.add(i);
        }
        Collections.shuffle(qID);//กำหนดให้คำถามแบบสุ่ม
        setQueastion(qID.remove(0));
    }// end onCreate Method

    private void setQueastion(int qID) {//ใช้กำหนดข้อคำถามและเฉลยในแต่ละข้อ

        if (qID == 1){
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird);
            mediaPlayer = MediaPlayer.create(this, R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>(); // กำหนดการแรนด้อมช้อย
            choice.add("นก");
            choice.add("ยุง");
            choice.add("หมู");
            choice.add("แมว");
            Collections.shuffle(choice);//กำหนดแรนด้อม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 2){
            answer = "แมว";
            questionImageView.setImageResource(R.drawable.cat);
            mediaPlayer = MediaPlayer.create(this, R.raw.cat);

            ArrayList<String> choice = new ArrayList<String>(); // กำหนดการแรนด้อมช้อย
            choice.add("แมว");
            choice.add("ช้าง");
            choice.add("หมู");
            choice.add("สิงโต");
            Collections.shuffle(choice);//กำหนดแรนด้อม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 3){
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow);
            mediaPlayer = MediaPlayer.create(this, R.raw.cow);

            ArrayList<String> choice = new ArrayList<String>(); // กำหนดการแรนด้อมช้อย
            choice.add("วัว");
            choice.add("แกะ");
            choice.add("ยัง");
            choice.add("ช้าง");
            Collections.shuffle(choice);//กำหนดแรนด้อม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 4){
            answer = "สุนัข";
            questionImageView.setImageResource(R.drawable.dog);
            mediaPlayer = MediaPlayer.create(this, R.raw.dog);

            ArrayList<String> choice = new ArrayList<String>(); // กำหนดการแรนด้อมช้อย
            choice.add("สุนัข");
            choice.add("ม้า");
            choice.add("หมู");
            choice.add("วัว");
            Collections.shuffle(choice);//กำหนดแรนด้อม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 5){
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant);
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant);

            ArrayList<String> choice = new ArrayList<String>(); // กำหนดการแรนด้อมช้อย
            choice.add("ช้าง");
            choice.add("แมว");
            choice.add("ยุง");
            choice.add("วัว");
            Collections.shuffle(choice);//กำหนดแรนด้อม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 6){
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse);
            mediaPlayer = MediaPlayer.create(this, R.raw.horse);

            ArrayList<String> choice = new ArrayList<String>(); // กำหนดการแรนด้อมช้อย
            choice.add("ม้า");
            choice.add("สุนัข");
            choice.add("แกะ");
            choice.add("นก");
            Collections.shuffle(choice);//กำหนดแรนด้อม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 7){
            answer = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion);
            mediaPlayer = MediaPlayer.create(this, R.raw.lion);

            ArrayList<String> choice = new ArrayList<String>(); // กำหนดการแรนด้อมช้อย
            choice.add("สิงโต");
            choice.add("ช้าง");
            choice.add("แมว");
            choice.add("ยุง");
            Collections.shuffle(choice);//กำหนดแรนด้อม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 8){
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito);
            mediaPlayer = MediaPlayer.create(this, R.raw.mosquito);

            ArrayList<String> choice = new ArrayList<String>(); // กำหนดการแรนด้อมช้อย
            choice.add("ยุง");
            choice.add("ม้า");
            choice.add("หมู");
            choice.add("ช้าง");
            Collections.shuffle(choice);//กำหนดแรนด้อม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 9){
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig);
            mediaPlayer = MediaPlayer.create(this, R.raw.pig);

            ArrayList<String> choice = new ArrayList<String>(); // กำหนดการแรนด้อมช้อย
            choice.add("หมู");
            choice.add("นก");
            choice.add("สิงโต");
            choice.add("ม้า");
            Collections.shuffle(choice);//กำหนดแรนด้อม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

        if (qID == 10){
            answer = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep);
            mediaPlayer = MediaPlayer.create(this, R.raw.sheep);

            ArrayList<String> choice = new ArrayList<String>(); // กำหนดการแรนด้อมช้อย
            choice.add("แกะ");
            choice.add("แมว");
            choice.add("สุนัข");
            choice.add("นก");
            Collections.shuffle(choice);//กำหนดแรนด้อม
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

    }//end setQuestion Method

    public void choiceAns(View view){ //ตรวจคำตอบ
        Button button = (Button) view;
        String buttonString = button.getText().toString();//เอาข้อความบนปุ่มมาเก็บในตัวแปลbuttonString
        if (buttonString.equals(answer)){
            score++;
        }
        if (qID.isEmpty()) {//ถ้าทำครบทุกข้อqIDจะเป็นค่าว่าง
            dialogboxScore(); //เรียน Method dialogboxScore() สำหรับแสดงคะแนน
        } else {//ถ้ายังทำไม่ครบทุกข้อ
            setQueastion(qID.remove(0));//เรียก Method setQueastion() แสดงคำถามถัดไป
        }


    }//end choiceAns Method

    private void dialogboxScore() {// Method สำหรับแสดงคะแนน
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage("ได้คะแนน " + score + " คะแนน")
            .setCancelable(false)
            .setPositiveButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                 finish();//ปิด Activity ออกจากแอป
                }
            })
        .setNegativeButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }//end dialogboxScore Method

    public void playSound(View view){
        mediaPlayer.start();


    }//end playSound Method
}//end Class
