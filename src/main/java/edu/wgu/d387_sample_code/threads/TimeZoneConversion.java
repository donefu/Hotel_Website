package edu.wgu.d387_sample_code.threads;

import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class TimeZoneConversion {
    public String time_Conversion(){
        ZonedDateTime now = ZonedDateTime.now();

        ZonedDateTime et_Time = now.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime mt_Time = now.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime utc_Time = now.withZoneSameInstant(ZoneId.of("UTC"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        String formattedTime_ET = "Eastern Time: "+ et_Time.format(formatter);
        String formattedTime_MT = "Mountain Time: "+ mt_Time.format(formatter);
        String formattedTime_UTC = "Universal Time: " + utc_Time.format(formatter);

        return formattedTime_ET + "\n" + formattedTime_MT + "\n" + formattedTime_UTC;
    }
}
