package com.ictec.dpatterns;

public class DifficultReg {
    //char array to store reg no in TGXXX format

    char regno[] = new char[5];

    public void setFirstChar(char c){
        regno[0] = c;
    }

    public void setSecondChar(char c){
        regno[1] = c;
    }

    public void setThirdChar(char c){
        regno[2] = c;
    }

    public void setFourthChar(char c){
        regno[3] = c;
    }

    public void setFifthChar(char c){
        regno[4] = c;
    }

    public String getRegNo(){
        return new String(regno);
    }

}
