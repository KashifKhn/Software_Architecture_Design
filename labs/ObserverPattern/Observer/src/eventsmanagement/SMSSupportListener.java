/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsmanagement;

import java.io.File;

/**
 *
 * @author FA22-BSE-068
 */
public class SMSSupportListener implements EventListener {
    private String number;    
    private String smsText;


    public SMSSupportListener(String number,String smsText ) {
        this.number = number;
        this.setSmsText(smsText);
    }

    public String getSmsText() {
        return smsText;
    }

    public void setSmsText(String smsText) {
        if(smsText.length() > 160){
            System.out.println("Wraning:!! Not more than 160 char!!");
            return;
        }
        this.smsText = smsText;
    }
    
    

    @Override
    public void update(String eventType, File file) {
        System.out.println("Sms to " + number + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
        System.out.println("SMS is : " + this.getSmsText());
    }
}