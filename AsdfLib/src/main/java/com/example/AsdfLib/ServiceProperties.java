package com.example.AsdfLib;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.text.SimpleDateFormat;
import java.util.Date;

@ConfigurationProperties("service")
public class ServiceProperties {

    /**
     * A message for the service.
     */
    private String message;
    private Date date;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String toString(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");

        if(date == null)
            return null;
        else
            return formatter.format(date);
    }
}
