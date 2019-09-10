package com.example.amsalu_homework01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void helloprint(View v){
        Button hello = (Button) findViewById(R.id.hello_button);
        EditText namebox = (EditText) findViewById(R.id.namebox);

        TextView hello_response = (TextView) findViewById(R.id.firstresponse);

        hello_response.setText("Hello " + namebox.getText());
        hello_response.setVisibility(View.VISIBLE);
    }

    public void goodbyeprint(View v){
        Button goodbye = (Button) findViewById(R.id.goodbye_button);
        EditText namebox = (EditText) findViewById(R.id.namebox);

        TextView goodbyeresponse = (TextView) findViewById(R.id.secondrespone);

        goodbyeresponse.setText("GoodBye " + namebox.getText());
        goodbyeresponse.setVisibility(View.VISIBLE);

    }
}
