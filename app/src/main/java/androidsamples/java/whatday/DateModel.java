package androidsamples.java.whatday;

import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.LONG;

import androidx.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Represents the date to be set, whether it is a valid date, and the message with error status or the day of the week.
 */
public class DateModel {

  static String year, month, date, msg;


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
    year = yearStr;
    month = monthStr;
    date = dateStr;
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
    int flag=0;
    try {
      Integer d = Integer.parseInt(date);
      Integer m = Integer.parseInt(month);
      Integer y = Integer.parseInt(year);

    } catch (NumberFormatException e) {
      msg = "Enter values in a proper numeric format";
      return msg;
    }

    int d = Integer.parseInt(date);
    int m= Integer.parseInt(month);
    int y= Integer.parseInt(year);

    Integer[] arr1 = {1,3,5,7,8,10,12};
         Integer[] arr2 = { 4,6,9,11 };

        m--;

       if(y<=0)
      {
          msg="Invalid year";
          flag=-1;
      }
        else if(m < 0 || m > 11)
        {
          msg="Invalid month";
          flag=-1;
        }
      else if(d < 0 || d > 31)
        {
          msg="Invalid date";
          flag=-1;
        }

      else if(y%4!=0&&m==1&&d>28)
      {
          msg= "February of "+y+" does not have 29 days";
          flag=-1;
      }
       else if(contains(arr2,m+1)==true &&d>30) {
            msg= "This month does not have 31 days";
            flag=-1;
        }
       else{
           //used https://java2blog.com/get-day-name-from-date-java/
//         Date day = new Date();
//         SimpleDateFormat simpleDateFormat;

           Locale locale = Locale.getDefault();
           Calendar calender = Calendar.getInstance();
           calender.setFirstDayOfWeek(Calendar.MONDAY);
           calender.set(y,m,d);
           msg=calender.getDisplayName(DAY_OF_WEEK,LONG, locale);

          // int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

//           switch (dayOfWeek){
//        case 7: msg = "Sunday";
//          break;
//        case 1: msg = "Monday";
//          break;
//        case 2: msg = "Tuesday";
//          break;
//        case 3: msg = "Wednesday";
//          break;
//        case 4: msg = "Thursday";
//          break;
//        case 5: msg = "Friday";
//          break;
//        case 6: msg = "Saturday";
//          break;
//        default:
//          throw new IllegalStateException("Unexpected value: " + dayOfWeek);
//      }


       }


    return msg;
  }

    private static boolean contains(Integer[] arr, int m) {
      boolean test = false;
      for (int element : arr) {
          if (element == m) {
              test = true;
              break;
          }
      }
      return test;
    }
}