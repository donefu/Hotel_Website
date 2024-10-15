package edu.wgu.d387_sample_code.threads;

import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.ResourceBundle;

@Component
public class DisplayMessage {
    public String getMessage(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("translation", locale);
        return rb.getString("welcomeMessage");
    }
}
