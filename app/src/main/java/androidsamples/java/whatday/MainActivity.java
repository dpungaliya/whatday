package androidsamples.java.whatday;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

  private EditText dateInput;
  private EditText monthInput;
  private EditText yearInput;
  private Button checkOutput;
  private TextView txtOutput;
  public TextView tv;


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
    //Log.i(TAG,"Input:")
      String date = dateInput.getText().toString();
      String month = monthInput.getText().toString();
      String year = yearInput.getText().toString();

      DateModel.initialize(year,month,date);
      txtOutput.setText(DateModel.getMessage());

    });

  }
}

//          c.set(Calendar.MONTH, Integer.parseInt(month)-1);
//          c.set(Calendar.DATE, Integer.parseInt(date));
//          c.set(Calendar.YEAR, Integer.parseInt(year));
//          Date dateEntered = c.getTime();
//          Date currentDate = new Date();
//          int var=currentDate.compareTo(dateEntered);

//         if(var<0)
//            res= d+getResources().getString(R.string.future)+" "+res;
//
//          else if(var>0)
//            res= d+getResources().getString(R.string.past)+" "+res;
//          else
//           res= d+getResources().getString(R.string.present)+" "+res;
//
//          // setting the message
//          tv.setText(res);
//        }




