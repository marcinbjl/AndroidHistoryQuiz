package marianstudio.androidhistoryquiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import static marianstudio.androidhistoryquiz.MainActivity.SAVED_SCORES_DATA;

public class question9 extends AppCompatActivity {

    int scoreQ9 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);
    }

    public void nextQuestion(View view) {

        EditText editTextQ9 = (EditText) findViewById(R.id.edit_text_Q9);

        String answerQ9 = editTextQ9.getText().toString().trim();

        if (answerQ9.equals("Motorola") || answerQ9.equals("motorola") || answerQ9.equals("MOTOROLA")) {
            scoreQ9 = 1;
        } else {
            scoreQ9 = 0;
        }

        Intent intent = new Intent(this, question10.class);
        startActivity(intent);

        SharedPreferences.Editor editor = getSharedPreferences(SAVED_SCORES_DATA, MODE_PRIVATE).edit();
        editor.putInt("score_Q9", scoreQ9);
        editor.apply();
    }
}