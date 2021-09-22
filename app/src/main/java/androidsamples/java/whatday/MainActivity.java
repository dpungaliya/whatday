package androidsamples.java.whatday;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

  private EditText dateInput;
  private EditText monthInput;
  private EditText yearInput;
  private Button checkOutput;
  private TextView txtOutput;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    dateInput = findViewById(R.id.editDate);
    monthInput = findViewById(R.id.editMonth);
    yearInput = findViewById(R.id.editYear);
    checkOutput = findViewById(R.id.btn_check);
    txtOutput = findViewById(R.id.txt_display);

    checkOutput.setOnClickListener(view->{
      String date = dateInput.getText().toString();
      String month = monthInput.getText().toString();
      String year = yearInput.getText().toString();


      DateModel dateObj= new DateModel();
      DateModel.initialize(year,month,date);

    });

  }
}
