import java.io.*;
public class PigLatin{
    public static String translate(String original){
        String piglatin="";
        if (Character.toLowerCase(original.charAt(0))=='a'){
            piglatin=original.substring(0,(original.length()))+"way";
        }
        else if (Character.toLowerCase(original.charAt(0))=='e'){
            piglatin=original.substring(0,(original.length()))+"way";
        }
        else if (Character.toLowerCase(original.charAt(0))=='i'){
            piglatin=original.substring(0,(original.length()))+"way";
        }
        else if (Character.toLowerCase(original.charAt(0))=='o'){
            piglatin=original.substring(0,(original.length()))+"way";
        }
        else if (Character.toLowerCase(original.charAt(0))=='u'){
            piglatin=original.substring(0,(original.length()))+"way";
        }
        else{
            piglatin=original.substring(1,(original.length()))+original.charAt(0)+"ay";
        }
        return piglatin;
    }
    
    public static void main(String[] args){
        String word=IO.readString();
        IO.outputStringAnswer(translate(word));
    }
}