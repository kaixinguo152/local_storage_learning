package com.example.local_storage_learning;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class datastore_learning extends AppCompatActivity {
    private Button btn_back_to_mainActivity;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout container = new LinearLayout(this);
        container.setOrientation(LinearLayout.HORIZONTAL);
        container.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        LinearLayout topContent = new LinearLayout(this);
        topContent.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                0,
                1.0f
        ));


        btn_back_to_mainActivity = new Button(this);
        btn_back_to_mainActivity.setText("back to main activity");
        btn_back_to_mainActivity.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
//        container.setBackground();


        container.addView(topContent);
        container.addView(btn_back_to_mainActivity);
        setContentView(container);
    }
}
