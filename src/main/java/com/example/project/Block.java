package com.example.project;

import java.util.Date;

public class Block {
    public String currentHash;
    public String previousHash;
    private String data;
    private long date;

    public Block(String dataToBeEncrpted,String previousHash){
        this.previousHash =  previousHash;        
        this.date = new Date().getTime();
        this.data = dataToBeEncrpted;
        this.currentHash = new Utilities().encryptDataSHA256(previousHash+date+data);
       }


}
