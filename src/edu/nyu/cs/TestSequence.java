package edu.nyu.cs;

public class TestSequence {
    
    public static void main(String[] args){
        Sentence sentence = new Sentence("The quick brown fox jumped over the lazy dog");
        System.out.println("The sentence was: "+sentence.toString());
        System.out.println("The first word was: "+sentence.getFirst().toString());
        System.out.println("The last word was: "+sentence.getLast().toString());
        System.out.println("The sentence is stored thus: "+sentence.getSequence().toString());
        System.out.println("The first character of the first word was: "+sentence.getFirst().getFirst().toString());
        System.out.println("The last character of the last word was: "+sentence.getLast().getLast().toString());
        int jumpedPosition = -1;
        for (int i = 0; i<sentence.getSequence().size();i++){
            if (sentence.getSequence().get(i).toString().equals("jumped")){
                jumpedPosition = ((Word) sentence.getSequence().get(i)).getPosition();
                break;
            }
        }
        if (jumpedPosition>=0){
            System.out.println("The position of the first use of the word \"jumped\" is: "+ jumpedPosition);
        }
        else{
            System.out.println("The word \"jumped\" does not appear in this sentence.");
        }

    }
}
