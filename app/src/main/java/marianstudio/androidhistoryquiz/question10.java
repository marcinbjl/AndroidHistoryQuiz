package marianstudio.androidhistoryquiz;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static marianstudio.androidhistoryquiz.MainActivity.SAVED_SCORES_DATA;

public class question10 extends AppCompatActivity {

    int scoreQ10 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);

    }

    public void submit(View view) {

        EditText editTextQ10 = (EditText) findViewById(R.id.edit_text_Q10);

        String answerQ10 = editTextQ10.getText().toString().trim();

        if (answerQ10.equals("Kie Lime Pie") || answerQ10.equals("kie lime pie") || answerQ10.equals("KIE LIME PIE")) {
            scoreQ10 = 1;
        } else {
            scoreQ10 = 0;
        }

        SharedPreferences scoresData = getSharedPreferences(SAVED_SCORES_DATA, MODE_PRIVATE);

        int scoreFromQ1 = scoresData.getInt("score_Q1", 0);
        int scoreFromQ2 = scoresData.getInt("score_Q2", 0);
        int scoreFromQ3 = scoresData.getInt("score_Q3", 0);
        int scoreFromQ4 = scoresData.getInt("score_Q4", 0);
        int scoreFromQ5 = scoresData.getInt("score_Q5", 0);
        int scoreFromQ6 = scoresData.getInt("score_Q6", 0);
        int scoreFromQ7 = scoresData.getInt("score_Q7", 0);
        int scoreFromQ8 = scoresData.getInt("score_Q8", 0);
        int scoreFromQ9 = scoresData.getInt("score_Q9", 0);

        int totalScore = scoreFromQ1 + scoreFromQ2 + scoreFromQ3 + scoreFromQ4 + scoreFromQ5 + scoreFromQ6 + scoreFromQ7 + scoreFromQ8 + scoreFromQ9 + scoreQ10;
        Toast.makeText(this, "Correct answers: " + totalScore + "/10", Toast.LENGTH_LONG).show();

    }


}
