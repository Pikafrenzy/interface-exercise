package edu.nyu.cs;

import java.util.ArrayList;

public class Word extends OrderedThing implements SequentiallyOrdered{
    private ArrayList<OrderedThing> sequence;
    private int position; 

    public Character getFirst(){
        return (Character) sequence.get(0);
    }
    public Character getLast(){
        return (Character) sequence.get(sequence.size()-1);
    }
    public ArrayList<OrderedThing> getSequence(){
        return sequence;
    }
    public int getPosition(){
        return position;
    }

    public Word(String word, int position){
        this.sequence = new ArrayList<OrderedThing>();
        this.position = position;
        for (int i = 0; i<word.length();i++){
            this.sequence.add(new Character(word.charAt(i)));
        }
    }
    
    public String toString(){
        String string = "";
        for (int i = 0; i<sequence.size();i++){
            string = string+sequence.get(i).toString();
        }
        return string;
    }
}
