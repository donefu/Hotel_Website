package edu.wgu.d387_sample_code.threads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/time")
public class TimeController {
   private TimeZoneConversion timeZoneConversion;

   @Autowired
    public TimeController(TimeZoneConversion timeZoneConversion) {
       this.timeZoneConversion = timeZoneConversion;
   }

   @GetMapping("zones")
    public String get_TimeZones() {
       return timeZoneConversion.time_Conversion();
   }

}
