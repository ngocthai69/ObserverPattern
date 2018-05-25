package com.example.dinhvanlap.observerpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Subject subject = new Subject();

        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);

        System.out.println("Change state to 15");
        subject.setState(15);
        System.out.println("Change state to 10");
        subject.setState(10);
        System.out.println("Change to 5");
        subject.setState(5);

    }
}
