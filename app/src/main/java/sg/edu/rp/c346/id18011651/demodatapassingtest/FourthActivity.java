package sg.edu.rp.c346.id18011651.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    //Step 1
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        //Step 2
        tvAnswer=findViewById(R.id.textView3);
        Intent intentReceived=getIntent();
        Double value= intentReceived.getDoubleExtra("value",0);
        tvAnswer.setText("Double value received is: "+ value);
    }
}
