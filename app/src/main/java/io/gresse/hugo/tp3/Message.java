package io.gresse.hugo.tp3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Represent a single message sended by an user
 *
 * Created by Hugo Gresse on 26/11/2017.
 */

public class Message {

    public String key;
    public String content;
    public String userName;
    public String userEmail;
    //public Date dateTime;
    public Long   timestamp;

    public Message() {
        // Empty constructor for Firebase
        this(null, null, null, null, null);
    }

    public Message(String content, String userName, String userEmail, Long timestamp) {
        this(null, content, userName, userEmail, timestamp);
       /* try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
             dateTime = new Date();

        }
        catch (Exception j){
            j.printStackTrace();
        }*/
    }

    public Message(String key, String content, String userName, String userEmail, Long timestamp) {
        this.key = key;
        this.content = content;
        this.userName = userName;
        this.userEmail = userEmail;
        this.timestamp = timestamp;
    }
    public String getAge(){

        Date messageDate = new Date(timestamp);
        Date now = new Date();
         String old = TimeUnit.MILLISECONDS.toMinutes(now.getTime() - messageDate.getTime()) + "minutes ago";
        return old;

    }
}
