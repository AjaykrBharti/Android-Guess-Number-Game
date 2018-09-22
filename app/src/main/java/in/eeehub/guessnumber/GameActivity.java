package in.eeehub.guessnumber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;





public class GameActivity extends AppCompatActivity {

    EditText editText;
    //EditText crate a instance of EditText

    int guessno, score, actualno;
    // Create three variable  for store score, inputnumber and random number
    TextView scoretextview, guesstextview, actualtextview;
    //Create instance of TextView to show score, guess numbar and random number


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        score = 0;
        //variable store 0

        //set the id's from the xml view in activity_game.xml
        editText = (EditText) findViewById(R.id.ed_text);
        scoretextview =(TextView) findViewById(R.id.score_no);
        guesstextview = (TextView) findViewById(R.id.guess_no);
        actualtextview =(TextView) findViewById(R.id.actual_no);



        //set the id for button
        //then set onclick listner
        Button button = findViewById(R.id.btn_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                guessno = Integer.valueOf(editText.getText().toString());
                //Get the string from EditText convert it to integer and then store it to variable
                show(guessno);
                //call the show function by pass variable as argument

            }
        });


        }

        //function use to compare the two numbers and then set the EditText
        public void show(int no){

         guessno = no;
         //assign the variable
         actualno = (int)(Math.random()*10);
         //create the random number then convert double into int

            if (guessno == actualno) {
                //increment of score value
                score = score + 1;

                String scorestring = String.valueOf(score);
                String guessnostring = String.valueOf(guessno);
                String actualnostring = String.valueOf(actualno);
                //Convert int into string
                scoretextview.setText(scorestring);
                guesstextview.setText(guessnostring);
                actualtextview.setText(actualnostring);
                //set values to textview

            }else{
                String scorestring = String.valueOf(score);
                String guessnostring = String.valueOf(guessno);
                String actualnostring = String.valueOf(actualno);
                scoretextview.setText(scorestring);
                guesstextview.setText(guessnostring);
                actualtextview.setText(actualnostring);

            }
        }
}
