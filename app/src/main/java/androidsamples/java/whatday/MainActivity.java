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
      int dateInt = Integer.parseInt(dateInput.getText().toString());
      int monthInt = Integer.parseInt(monthInput.getText().toString());
      int yearInt = Integer.parseInt(yearInput.getText().toString());

      
//      monthInt--;
//      int flag = 0;
//
//      if(dateInt < 0 || dateInt > 31)
//        {
//          txtOutput.setText("Invalid Date");
//          flag=-1;
//        }
//      else if(monthInt < 0 || monthInt > 12)
//        {
//          txtOutput.setText("Invalid Month");
//          flag=-1;
//        }
//
//      Calendar rightNow = Calendar.getInstance();
//      rightNow.set(yearInt, monthInt, dateInt);
//      Date currentDate = rightNow.getTime();
//      int currentDay = currentDate.getDay();
//      //int min = rightNow.getMinimum(Calendar.YEAR);
//      String dayText;
//      System.out.println("Hello" + dateInt);
//      switch (currentDay){
//        case 0: dayText = "Sunday";
//          break;
//        case 1: dayText = "Monday";
//          break;
//        case 2: dayText = "Tuesday";
//          break;
//        case 3: dayText = "Wednesday";
//          break;
//        case 4: dayText = "Thursday";
//          break;
//        case 5: dayText = "Friday";
//          break;
//        case 6: dayText = "Saturday";
//          break;
//        default:
//          throw new IllegalStateException("Unexpected value: " + currentDay);
//      }
//        if(flag!=-1)
//          txtOutput.setText(dayText);
//

    });


  }
}
