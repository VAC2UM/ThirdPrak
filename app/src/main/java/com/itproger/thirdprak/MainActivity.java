package com.itproger.thirdprak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ConstraintLayout constraintLayout = new ConstraintLayout(this);

        TextView textView = new TextView(this);
        textView.setText("Hello Android!");
        textView.setTextSize(26);

        // парметры размероов и расположение эл-та
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
//                (ViewGroup.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT, 200);
        // выравнивание по левому краю
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        // выравнивание по верхней границе
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        // установка параметров для textView
        textView.setLayoutParams(layoutParams);
        // добавление TextView в ConstraintLayout
        constraintLayout.addView(textView);
        setContentView(constraintLayout);

//        setContentView(R.layout.second_layout);
//        TextView textView = findViewById(R.id.header);
//        textView.setText("Hello from Java");
//
//        int valueInDp = 60;
//        int x = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, valueInDp, getResources().getDisplayMetrics());
//        setContentView(R.layout.activity_main);
    }



}