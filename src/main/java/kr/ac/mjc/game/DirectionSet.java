package kr.ac.mjc.game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DirectionSet extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 101;
    TextView text2;
    TextView text1;
    TextView text3;
    ImageView start;
    ImageView set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction_set);

        Button right = (Button)findViewById(R.id.right);
        Button left = (Button)findViewById(R.id.left);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Direction_L.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Direction_R.class);
                startActivityForResult(intent,REQUEST_CODE_MENU);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        set = findViewById(R.id.set);
        start = findViewById(R.id.start);


        if (requestCode == REQUEST_CODE_MENU) {
            text1.setVisibility(text1.INVISIBLE);
            text2.setVisibility(text1.INVISIBLE);
            text3.setText("오른쪽으로 가야합니다");

            set.setVisibility(set.INVISIBLE);
            start.setVisibility(start.VISIBLE);
        }

    }
}
