package kr.ac.mjc.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Direction_R_Straight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direction__r__straight);

        Button left = (Button)findViewById(R.id.left);
        Button right = (Button)findViewById(R.id.right);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Direction_R_St_End.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "심부름 실패",Toast.LENGTH_SHORT).show();
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Direction_End.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "심부름 실패",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
