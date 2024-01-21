package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Stack;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText et_Num;
    private Button btn_Push;
    private Button btn_Pop;
    private TextView tv_Res;
    private Stack<Integer> stack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Num = findViewById(R.id.num_input_main);
        btn_Push = findViewById(R.id.push_btn_main);
        btn_Pop = findViewById(R.id.pop_btn_main);
        tv_Res = findViewById(R.id.numview_tv_home);

        stack = new Stack<>();

        btn_Push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = et_Num.getText().toString();
                if (input.equals("")) {
                    return;
                }
                stack.push(Integer.parseInt(input));
                tv_Res.setText("Current Stack: " + stack.toString());
            }
        });

        btn_Pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (stack.isEmpty()) {
                    tv_Res.setText("Stack is empty.");
                } else {
                    stack.pop();
                    tv_Res.setText("Current Stack: " + stack.toString());
                }
            }
        });
    }
}

