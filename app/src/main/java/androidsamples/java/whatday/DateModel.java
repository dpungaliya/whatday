package androidsamples.java.whatday;

import androidx.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Represents the date to be set, whether it is a valid date, and the message with error status or the day of the week.
 */
public class DateModel {

  static String year,month,date,msg;


  /**
   * Initializes the {@link DateModel} with the given year, month, and date.
   * If the date is not valid, it sets the appropriate error message.
   * If it is valid, it sets the appropriate day of the week message.
   *
   * @param yearStr  a {@code String} representing the year, e.g., "1947"
   * @param monthStr a {@code String} representing the month, e.g., "8"
   * @param dateStr  a {@code String} representing the date, e.g., "15"
   */
  public static void initialize(String yearStr, String monthStr, String dateStr) {
    // TODO implement the method to match the description
    year=yearStr;
    month=monthStr;
    date=dateStr;
  }



  /**
   * Retrieves the message from the {@link DateModel}.
   * It can be an error message like "February of 2019 does not have 29 days"
   * or a success message like "Friday".
   *
   * @return the message from the model
   */
  @NonNull
  public static String getMessage() {
    // TODO implement the method to match the description
     SimpleDateFormat simpleDateFormat;


      Calendar calendar = Calendar.getInstance();
      calendar.set(Calendar.DAY_OF_MONTH,Integer.parseInt(date));// Day of the month (1-31)
      calendar.set(Calendar.MONTH,Integer.parseInt(month)-1);// Month (0-11)
      calendar.set(Calendar.YEAR,Integer.parseInt(year));//Year
      simpleDateFormat = new SimpleDateFormat("EEEE");
    return  simpleDateFormat.format(calendar.getTime());
  }



//      calendar.set(yearInt, monthInt, dateInt);
//      Date currentDate = calender.getTime();
        //int currentDay = currentDate.getDay();
//      int min = calender.getMinimum(Calendar.YEAR);
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


    public int dateValidation(String year, String month, String date) {
        int d=Integer.parseInt(date);
        int m=Integer.parseInt(month);
        int y=Integer.parseInt(year);
        m--;
      int flag = 0;

      if(d < 0 || d > 31)
        {
          msg="Invalid Date";
          flag=-1;
        }
      else if(m < 0 || m > 12)
        {
          msg="Invalid Month";
          flag=-1;
        }
      

        return flag;
    }
}
