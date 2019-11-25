package kr.ac.mjc.game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Direction_L extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 101;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction__l);

        Button walk = findViewById(R.id.walk);
        Button run = findViewById(R.id.run);
        Button avoid = findViewById(R.id.avoid);

        walk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Direction_L.this, Direction_L_walk.class);
                Toast.makeText(getApplicationContext(), "무사히 지나갔습니다", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "심부름 실패", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Direction_End02.class);
                startActivity(intent);


            }
        });

        avoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("text", "길을 돌아왔습니다. 오른쪽으로 가야합니다");
                setResult(RESULT_OK, intent);

                finish();

            }
        });


    }
}
