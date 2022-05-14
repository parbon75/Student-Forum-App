package com.parbon.studentforum.models;

public class Model_Chat {

    public String getSender;
    String message, receiver, sender, timestamp;
    boolean isSeen;

    public Model_Chat() {

    }

    public Model_Chat(String message, String receiver, String sender, String timestamp, boolean isSeen){
        this.message=message;
        this.receiver=receiver;
        this.sender=sender;
        this.timestamp=timestamp;
        this.isSeen=isSeen;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message= message;
    }

    public String getReceiver(){
        return receiver;
    }

    public void setReceiver(String receiver){
        this.receiver=receiver;
    }

    public String getSender(){
        return sender;
    }

    public void setSender(String sender){
        this.sender=sender;
    }

    public String getTimeStamp() {
        return null;
    }

    public boolean isSeen() {
        return false;
    }
}
