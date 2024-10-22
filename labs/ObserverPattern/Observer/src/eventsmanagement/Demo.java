/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsmanagement;

/**
 *
 * @author FA22-BSE-068
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("Z:\\SDA\\lab5\\Observer\\src\\eventsmanagement\\file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));      
        editor.events.subscribe("save", new SMSSupportListener("+923000000000"));


        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}