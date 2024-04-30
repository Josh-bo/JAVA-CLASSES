// Java DateTime
// Four classes used for DateTime implementation.
// LocalDate (yyyy-MM-dd);
// LocalTime (HH-mm-ss-ns);
// LocalDateTime (yyyy-MM-dd-HH-mm-ns);
// DateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDateTime {
    // Formatter can be in different format.
    // yyyy-MM-dd = 2024-04-30,
    // dd-MM-yyyy = 30-04-2024,
    // dd-MMM-yyyy = 30-Apr-2024 14:51:03,
    // E, MMM dd yyyy = Tue, Apr 30 2024 14:51:48
    public static void main(String[] args) {
        // LocalDate lDate = LocalDate.now(); // To get current date on a device.
        // LocalTime lTime = LocalTime.now(); // To get current time on a device.
        // LocalDateTime lDateTime = LocalDateTime.now(); // To get current time on a
        // device.
        LocalDateTime lDateTime = LocalDateTime.now(); // To get current time on a device and format it to normal.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        String myDateTime = lDateTime.format(formatter);
        System.out.println(myDateTime);
    }
}

// Alternative to Array.
// How to control files and manipulate files.