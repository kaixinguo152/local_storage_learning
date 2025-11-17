package com.example.local_storage_learning;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.local_storage_learning.Utils.window_utils.window_GetSize_utils;

public class MainActivity extends AppCompatActivity {
    private Button btn_submit;
    private TextView my_tv;
    private EditText my_et;

    private SharedPreferences shared;

    private Button btn_jump_to_activity_datastore_learning;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        shared = getSharedPreferences("share", MODE_PRIVATE);

        View.OnClickListener my_OnClickListener = new my_onclicklistener();

        LinearLayout container = new LinearLayout(this);
        container.setGravity(Gravity.CENTER);
        container.setOrientation(LinearLayout.VERTICAL);


        my_tv = new TextView(this);
        my_tv.setText(shared.getString("content", "getting content failure"));


        LinearLayout ll_input = new LinearLayout(this);
        ll_input.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        window_GetSize_utils window_size_utils = new window_GetSize_utils();
        final int screen_width = window_size_utils.getScreenWidth(this);
        final int screnn_height = window_size_utils.getScreenHeight(this);
        my_et = new EditText(this);
        int width_my_et = (int) ((int) screen_width * 0.8);
        my_et.setWidth(width_my_et);

        btn_submit = new Button(this);
        btn_submit.setText("submit");
        int width_btn_submit = (int) ((int) screen_width * 0.2);
        btn_submit.setWidth(width_btn_submit);
        btn_submit.setId(View.generateViewId());
        btn_submit.setOnClickListener(my_OnClickListener);
        ll_input.addView(my_et);
        ll_input.addView(btn_submit);

        btn_jump_to_activity_datastore_learning = new Button(this);
        btn_jump_to_activity_datastore_learning.setText("jump to datastore learning activity");
        btn_jump_to_activity_datastore_learning.setOnClickListener(my_OnClickListener);
        btn_jump_to_activity_datastore_learning.setId(View.generateViewId());

        container.addView(my_tv);
        container.addView(ll_input);
        container.addView(btn_jump_to_activity_datastore_learning);
        setContentView(container);
    }

    public class my_onclicklistener implements View.OnClickListener {
        public void onClick(View v) {
            if (v.getId() == btn_submit.getId()) {
                String content_my_ed = my_et.getText().toString();
                if (content_my_ed.isEmpty()) return;
                my_tv.setText(content_my_ed);
                my_et.setText("");

                SharedPreferences.Editor editor = shared.edit();
                editor.putString("content", my_et.getText().toString());
                editor.apply();
            }
            if (v.getId() == btn_jump_to_activity_datastore_learning.getId()) {
                Intent intent = new Intent(MainActivity.this, datastore_learning.class);
                startActivity(intent);
            }
        }
    }
}
