package edu.nyu.cs;

public class Character extends OrderedThing{
    private char storedChar;
    public Character(char storedChar){
        this.storedChar = storedChar;
    }
    public String toString(){
        String string = ""+storedChar;
        return string;
    }
}
