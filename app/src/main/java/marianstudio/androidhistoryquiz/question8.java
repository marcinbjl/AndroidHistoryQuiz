package marianstudio.androidhistoryquiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import static marianstudio.androidhistoryquiz.MainActivity.SAVED_SCORES_DATA;

public class question8 extends AppCompatActivity {


    int scoreQ8 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);
    }

    public void nextQuestion(View view) {

        EditText editTextQ8 = (EditText) findViewById(R.id.edit_text_Q8);

        String answerQ8 = editTextQ8.getText().toString().trim();

        if (answerQ8.equals("Nougat") || answerQ8.equals("nougat") || answerQ8.equals("NOUGAT")) {
            scoreQ8 = 1;
        } else {
            scoreQ8 = 0;
        }

        Intent intent = new Intent(this, question9.class);
        startActivity(intent);

        SharedPreferences.Editor editor = getSharedPreferences(SAVED_SCORES_DATA, MODE_PRIVATE).edit();
        editor.putInt("score_Q8", scoreQ8);
        editor.apply();
    }
}