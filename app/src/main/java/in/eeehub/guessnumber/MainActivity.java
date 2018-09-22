package in.eeehub.guessnumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //opengame is a method which is use in side onclick attribute of button in activity_main layout
    public void opengame(View view){

        Intent opensecondactivity = new Intent(MainActivity.this,GameActivity.class);
        // Intent is use to go from one MainActivity to Other Activity
        startActivity(opensecondactivity);

    }
}
