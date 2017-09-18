package marianstudio.androidhistoryquiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;

import static marianstudio.androidhistoryquiz.MainActivity.SAVED_SCORES_DATA;
import static marianstudio.androidhistoryquiz.R.id.radio_button_four;
import static marianstudio.androidhistoryquiz.R.id.radio_button_one;
import static marianstudio.androidhistoryquiz.R.id.radio_button_three;
import static marianstudio.androidhistoryquiz.R.id.radio_button_two;

public class question2 extends AppCompatActivity {

    int scoreQ2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
    }

    public void nextQuestion(View view) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        int buttonId = radioGroup.getCheckedRadioButtonId();

        Intent intent = new Intent(this, question3.class);

        switch (buttonId) {

            case -1:
                scoreQ2 = 0;
                startActivity(intent);
                break;

            case radio_button_one:
                scoreQ2 = 0;
                startActivity(intent);
                break;

            case radio_button_two:
                scoreQ2 = 0;
                startActivity(intent);
                break;

            case radio_button_three:
                scoreQ2 = 0;
                startActivity(intent);
                break;

            case radio_button_four:
                scoreQ2 = 1;
                startActivity(intent);
                break;
        }

        SharedPreferences.Editor editor = getSharedPreferences(SAVED_SCORES_DATA, MODE_PRIVATE).edit();
        editor.putInt("score_Q2", scoreQ2);
        editor.apply();
    }
}
