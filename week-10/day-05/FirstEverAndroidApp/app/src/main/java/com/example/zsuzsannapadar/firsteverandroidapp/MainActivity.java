package com.example.zsuzsannapadar.firsteverandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import static com.example.zsuzsannapadar.firsteverandroidapp.R.id.button;
import static com.example.zsuzsannapadar.firsteverandroidapp.R.layout.message;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private Button sendButton;
    private EditText editText;
    private MessageAdapter messageAdapter;

//    public MainActivity(MessageAdapter messageAdapter) {
//        this.messageAdapter = messageAdapter;
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendButton  = (Button) findViewById(button);
        listView = (ListView) findViewById(R.id.List);
        editText = (EditText) findViewById(R.id.Name);
        final MessageAdapter messageAdapter = new MessageAdapter(this);
        messageAdapter.add(new Message("Steg", "napi 16 ezer"));
        messageAdapter.add(new Message("Peti", "akarmegissertodhetnek"));
        messageAdapter.add(new Message("Tomi", "jaaaaaj"));
        listView.setAdapter(messageAdapter);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageAdapter.add(new Message("Zsuzsi", editText.getText().toString()));
            }
        });





    }



}
