import java.io.*;
public class WordCount{
    public static int countWords(String original, int minLength){
        String[] words=original.split(" ");
        String word;
        int arraysize=words.length;
        int numletters=0;
        int minLengthWords=0;
        for (int x=0;x<arraysize;x++){
            word=words[x];
            for (int y=0;y<word.length();y++){
                switch (Character.toLowerCase(word.charAt(y))){
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'y':
                    case 'z':
                        numletters++;
                        break;
                }
            }
            if (numletters>=minLength){
                minLengthWords++;
            }
            numletters=0;
        }
        return minLengthWords;
    }

    public static void main(String[] args){
        String original=IO.readString();
        int minLength=IO.readInt();
        System.out.println(countWords(original, minLength));
    }
}