package com.example.project;


public class AashChain{
    public static void main(String[] args){        
        String data = "This is the data to be stored in the AashChain(Aashrey's Blockchain)";
        //Step 1 : initialize the block.
        Block ashBlock = new Block(data,"0");
        //printing the generated hash according to the previous block's hash, timestamp and data to be added in the block.
        System.out.println("Hash of the current block is: "+ ashBlock.currentHash);
    }
}