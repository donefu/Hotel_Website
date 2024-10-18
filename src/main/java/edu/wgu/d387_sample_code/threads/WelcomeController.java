package edu.wgu.d387_sample_code.threads;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Locale;

@RestController
@CrossOrigin
@RequestMapping("/welcome")
public class WelcomeController {

    @Autowired
    private DisplayMessage displayMessage;

    @GetMapping("welcome_message_US")
    public String welcomeMessage_US(){
         return displayMessage.getMessage(Locale.US);
        // return LocalDateTime.now().toString();
    }

    @GetMapping("welcome_message_FR")
    public String welcomeMessage_FR(){
        return displayMessage.getMessage(Locale.CANADA_FRENCH);
    }
}

