import java.io.*;
public class Compress{
    public static String compress(String original){
        int length=original.length();
        String compressed="";
        int count=1;
        char letter=original.charAt(0);
        int letternumber=1;
        do{
            while(original.charAt(letternumber)==original.charAt(letternumber-1)){
                count++;
                if (letternumber<(length-1)){
                    letternumber++;
                }
                else if (letternumber==(length-1)){
                    break;
                }
            }
            if (count==1){
                compressed=compressed+letter;
            }
            else{
                compressed=compressed+count+letter;
            }
            letter=original.charAt(letternumber);
            count=1;
            letternumber++;
        }while(letternumber<length);
        if (count==1&&original.charAt(length-1)!=original.charAt(length-2)){
            compressed=compressed+letter;
        }
        return compressed;
    }
    
    public static void main(String[] args){
        String original=IO.readString();
        String compressed=compress(original);
        System.out.println(compressed);
    }
}