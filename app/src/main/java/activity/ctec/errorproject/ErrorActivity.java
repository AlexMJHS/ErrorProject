package activity.ctec.errorproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class ErrorActivity extends AppCompatActivity
{

    private Button firstButton;
    private EditText typingField;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);

        typingField = (EditText) findViewById(R.id.mainEditField);
        firstButton = (Button) findViewById(R.id.button);
        setupListeners();
    }

    private void setupListeners()
    {
        firstButton.setOnClickListener(new View.OnClickListener()
        {
            public void onclick(View buttonClickView)
            {
                //Do Stuff here.
            }
        });
    }
}
