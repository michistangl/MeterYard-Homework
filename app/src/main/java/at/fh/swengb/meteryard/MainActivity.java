package at.fh.swengb.meteryard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView resultView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText =  (EditText) findViewById(R.id.eT_input);
        resultView = (TextView) findViewById(R.id.tV_result);
    }


    public void calcYard(View view){

        String numString = editText.getText().toString();

        double num = 0;

        try {
            num = Double.parseDouble(numString);

            double result = num * 1.09361;

            resultView.setText(numString + " * 1,09361 = " + result);

        } catch (NumberFormatException e) {
            resultView.setText("WRONG INPUT!");
            e.printStackTrace();
        }

    }

    public void calcMeter(View view){

        String numString = editText.getText().toString();

        double num = 0;

        try {
            num = Double.parseDouble(numString);

            double result = num * 0.9144;

            resultView.setText(numString + " * 0,9144 = " + result);

        } catch (NumberFormatException e) {
            resultView.setText("WRONG INPUT!");
            e.printStackTrace();
        }

    }

    public void showAbout(View view) {
        Intent intent = new Intent(this,DisplayAboutActivity.class);
        String message = resultView.getText().toString();
        intent.putExtra("myMessage", message);

        startActivity(intent);
    }
}
