package marianstudio.androidhistoryquiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

import static marianstudio.androidhistoryquiz.MainActivity.SAVED_SCORES_DATA;

public class question6 extends AppCompatActivity {

    int scoreQ6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);
    }

    public void nextQuestion(View view) {

        CheckBox checkboxOne = (CheckBox) findViewById(R.id.checkbox_one);
        boolean isFirstChecked = checkboxOne.isChecked();

        CheckBox checkboxTwo = (CheckBox) findViewById(R.id.checkbox_two);
        boolean isSecondChecked = checkboxTwo.isChecked();

        CheckBox checkboxThree = (CheckBox) findViewById(R.id.checkbox_three);
        boolean isThirdChecked = checkboxThree.isChecked();

        CheckBox checkboxFour = (CheckBox) findViewById(R.id.checkbox_four);
        boolean isFourthChecked = checkboxFour.isChecked();

        if (isFirstChecked && !isSecondChecked && !isThirdChecked && isFourthChecked) {
            scoreQ6 = 1;
        } else {
            scoreQ6 = 0;
        }

        Intent intent = new Intent(this, question7.class);
        startActivity(intent);

        SharedPreferences.Editor editor = getSharedPreferences(SAVED_SCORES_DATA, MODE_PRIVATE).edit();
        editor.putInt("score_Q6", scoreQ6);
        editor.apply();
    }
}