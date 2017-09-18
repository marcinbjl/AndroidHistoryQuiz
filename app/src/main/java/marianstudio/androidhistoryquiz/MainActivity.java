package marianstudio.androidhistoryquiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;

import static marianstudio.androidhistoryquiz.R.id.radio_button_four;
import static marianstudio.androidhistoryquiz.R.id.radio_button_one;
import static marianstudio.androidhistoryquiz.R.id.radio_button_three;
import static marianstudio.androidhistoryquiz.R.id.radio_button_two;

public class MainActivity extends AppCompatActivity {

    public static final String SAVED_SCORES_DATA = "scoresData";
    int scoreQ1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextQuestion(View view) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        int buttonId = radioGroup.getCheckedRadioButtonId();

        Intent intent = new Intent(this, question2.class);

        switch (buttonId) {
            case -1:
                scoreQ1 = 0;
                startActivity(intent);
                break;

            case radio_button_one:
                scoreQ1 = 0;
                startActivity(intent);
                break;

            case radio_button_two:
                scoreQ1 = 0;
                startActivity(intent);
                break;

            case radio_button_three:
                scoreQ1 = 0;
                startActivity(intent);
                break;

            case radio_button_four:
                scoreQ1 = 1;
                startActivity(intent);
                break;
        }

        SharedPreferences.Editor editor = getSharedPreferences(SAVED_SCORES_DATA, MODE_PRIVATE).edit();
        editor.putInt("score_Q1", scoreQ1);
        editor.apply();
    }
}

