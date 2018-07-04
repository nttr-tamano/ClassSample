package com.example.nttr.classsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //private Car car = new Car("赤い車");
    private Car car = new SafeCar("赤い車");   // 親クラスに子クラスを代入できる
    private TextView textInfo;
    private Button btnUp;
    private Button btnDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInfo = (TextView) findViewById(R.id.textInfo);
        btnUp = (Button) findViewById(R.id.btnUp);
        btnDown = (Button) findViewById(R.id.btnDown);

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car.speedUp();
                textInfo.setText(car.getInfo()
                        + "のスピードは"
                        + car.getSpeed()
                        + "キロメートル毎時");
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car.speedDown();
                textInfo.setText(car.getInfo()
                        + "のスピードは"
                        + car.getSpeed()
                        + "キロメートル毎時");
            }
        });
    }
}
