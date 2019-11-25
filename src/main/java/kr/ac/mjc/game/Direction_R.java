
package kr.ac.mjc.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Direction_R extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dirction__r);

        Button left = (Button)findViewById(R.id.left);
        Button right = (Button)findViewById(R.id.right);
        Button straight = (Button)findViewById(R.id.straight);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Direction_R_End.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "심부름 성공",Toast.LENGTH_SHORT).show();

            }
        });

        straight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Direction_R_Straight.class);
                startActivity(intent);

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