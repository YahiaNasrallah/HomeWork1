package com.example.homwwork1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean flag=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ed_name=findViewById(R.id.ed_name);
        RadioButton rb_one=findViewById(R.id.rb_choice_one);
        RadioButton rb_tow=findViewById(R.id.rb_choice_tow);
        RadioButton rb_three=findViewById(R.id.rb_choice_three);
        RadioButton rb_male=findViewById(R.id.rb_male);
        RadioButton rb_female=findViewById(R.id.rb_female);
        RadioGroup rg_gender=findViewById(R.id.rg_gender);
        RadioGroup rg_age=findViewById(R.id.rg_age);
        Button btn_save=findViewById(R.id.btn_save);
        LinearLayout main_lay=findViewById(R.id.main_layout);
        TextView tv_result=findViewById(R.id.tv_result);
        TextView tv_enterage=findViewById(R.id.enter_age);
        TextView tv_entergender=findViewById(R.id.enter_gender);
        TextView tv_proglang=findViewById(R.id.programlang);
        ConstraintLayout toolbar=findViewById(R.id.toolbar);
        CheckBox cb_1=findViewById(R.id.cb_1);
        CheckBox cb_2=findViewById(R.id.cb_2);
        CheckBox cb_3=findViewById(R.id.cb_3);
        CheckBox cb_4=findViewById(R.id.cb_4);
        CheckBox cb_5=findViewById(R.id.cb_5);
        CheckBox cb_6=findViewById(R.id.cb_6);
        CheckBox cb_7=findViewById(R.id.cb_7);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {


                if (!ed_name.getText().toString().equals("") &&(rb_one.isChecked()||rb_tow.isChecked()||rb_three.isChecked())&&(cb_1.isChecked()||cb_2.isChecked()||cb_3.isChecked()
                ||cb_4.isChecked()||cb_5.isChecked()||cb_6.isChecked()||cb_7.isChecked())){

                    if (rb_one.isChecked()){
                        tv_result.setText("Young");
                    }else if (rb_tow.isChecked()){
                        tv_result.setText("Youths");
                    }else if(rb_three.isChecked()){
                        tv_result.setText("Older");
                    }else {
                        tv_result.setText("NO Selected");

                    }

                    if (flag){
                        main_lay.setBackgroundColor(getResources().getColor(R.color.back));
                        toolbar.setBackgroundResource(R.drawable.toolbar_deign2);
                        btn_save.setBackgroundResource(R.drawable.btn_design3);
                        rb_one.setTextColor(getResources().getColor(R.color.white));
                        rb_tow.setTextColor(getResources().getColor(R.color.white));
                        rb_three.setTextColor(getResources().getColor(R.color.white));
                        rb_male.setTextColor(getResources().getColor(R.color.white));
                        rb_female.setTextColor(getResources().getColor(R.color.white));
                        cb_1.setTextColor(getResources().getColor(R.color.white));
                        cb_2.setTextColor(getResources().getColor(R.color.white));
                        cb_3.setTextColor(getResources().getColor(R.color.white));
                        cb_4.setTextColor(getResources().getColor(R.color.white));
                        cb_5.setTextColor(getResources().getColor(R.color.white));
                        cb_6.setTextColor(getResources().getColor(R.color.white));
                        cb_7.setTextColor(getResources().getColor(R.color.white));
                        tv_result.setTextColor(getResources().getColor(R.color.white));
                        tv_enterage.setTextColor(getResources().getColor(R.color.white));
                        tv_entergender.setTextColor(getResources().getColor(R.color.white));
                        tv_proglang.setTextColor(getResources().getColor(R.color.white));
                        ed_name.setBackgroundResource(R.drawable.deign2);
                        rb_one.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                        rb_tow.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                        rb_three.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                        rb_male.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                        rb_female.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                        cb_1.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                        cb_2.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                        cb_3.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                        cb_4.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                        cb_5.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                        cb_6.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));
                        cb_7.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.red)));




                        flag=false;
                    }else {
                        main_lay.setBackgroundColor(getResources().getColor(R.color.white));
                        toolbar.setBackgroundResource(R.drawable.toolbar_deign);
                        btn_save.setBackgroundResource(R.drawable.btn_design2);
                        rb_one.setTextColor(getResources().getColor(R.color.black));
                        rb_tow.setTextColor(getResources().getColor(R.color.black));
                        rb_three.setTextColor(getResources().getColor(R.color.black));
                        rb_male.setTextColor(getResources().getColor(R.color.black));
                        rb_female.setTextColor(getResources().getColor(R.color.black));
                        cb_1.setTextColor(getResources().getColor(R.color.black));
                        cb_2.setTextColor(getResources().getColor(R.color.black));
                        cb_3.setTextColor(getResources().getColor(R.color.black));
                        cb_4.setTextColor(getResources().getColor(R.color.black));
                        cb_5.setTextColor(getResources().getColor(R.color.black));
                        cb_6.setTextColor(getResources().getColor(R.color.black));
                        cb_7.setTextColor(getResources().getColor(R.color.black));
                        tv_result.setTextColor(getResources().getColor(R.color.black));
                        tv_enterage.setTextColor(getResources().getColor(R.color.black));
                        tv_entergender.setTextColor(getResources().getColor(R.color.black));
                        tv_proglang.setTextColor(getResources().getColor(R.color.black));
                        ed_name.setBackgroundResource(R.drawable.deign);
                        rb_one.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.blue)));
                        rb_tow.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.blue)));
                        rb_three.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.blue)));
                        rb_male.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.blue)));
                        rb_female.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.blue)));
                        cb_1.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.blue)));
                        cb_2.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.blue)));
                        cb_3.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.blue)));
                        cb_4.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.blue)));
                        cb_5.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.blue)));
                        cb_6.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.blue)));
                        cb_7.setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.blue)));

                        flag=true;
                    }






                    ed_name.setText("");
                    rg_gender.clearCheck();
                    rg_age.clearCheck();
                    cb_1.setChecked(false);
                    cb_2.setChecked(false);
                    cb_3.setChecked(false);
                    cb_4.setChecked(false);
                    cb_5.setChecked(false);
                    cb_6.setChecked(false);
                    cb_7.setChecked(false);


                }else {
                    Toast.makeText(MainActivity.this, "Enter All", Toast.LENGTH_SHORT).show();
                }

            }
        });




    }
}