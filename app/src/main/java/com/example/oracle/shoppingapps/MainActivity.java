package com.example.oracle.shoppingapps;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int TEXT_REQUEST = 1;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private int position = 1;
    private TextView mTextView1;
    private TextView mTextView2;
    private TextView mTextView3;
    private TextView mTextView4;
    private TextView mTextView5;
    private TextView mTextView6;
    private TextView mTextView7;
    private TextView mTextView8;
    private TextView mTextView9;
    private TextView mTextView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView1 = findViewById(R.id.textView1);
        mTextView2 = findViewById(R.id.textView2);
        mTextView3 = findViewById(R.id.textView3);
        mTextView4 = findViewById(R.id.textView4);
        mTextView5 = findViewById(R.id.textView5);
        mTextView6 = findViewById(R.id.textView6);
        mTextView7 = findViewById(R.id.textView7);
        mTextView8 = findViewById(R.id.textView8);
        mTextView9 = findViewById(R.id.textView9);
        mTextView10 = findViewById(R.id.textView10);
    }

    public void addItem(View view) {
        Intent intent = new Intent(this, AdditemActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == TEXT_REQUEST) {
            if(resultCode == RESULT_OK) {
                String item = data.getStringExtra(AdditemActivity.EXTRA_ITEM);
                switch (position) {
                    case 1:
                        mTextView1.setText(item);
                        position++;
                        break;
                    case 2:
                        mTextView2.setText(item);
                        position++;
                        break;
                    case 3:
                        mTextView3.setText(item);
                        position++;
                        break;
                    case 4:
                        mTextView4.setText(item);
                        position++;
                        break;
                    case 5:
                        mTextView5.setText(item);
                        position++;
                        break;
                    case 6:
                        mTextView6.setText(item);
                        position++;
                        break;
                    case 7:
                        mTextView7.setText(item);
                        position++;
                        break;
                    case 8:
                        mTextView8.setText(item);
                        position++;
                        break;
                    case 9:
                        mTextView9.setText(item);
                        position++;
                        break;
                    case 10:
                        mTextView10.setText(item);
                        position++;
                        break;
                    default:
                        Toast.makeText(this, "Item List Already Full", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        }
    }
}
