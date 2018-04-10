import java.util.Scanner;
public class StringRec{
	public static String decompress(String compressedText){
		String decompressed="";
		if (compressedText.length()==1){
			decompressed=compressedText;
		}
		else if (Character.isDigit(compressedText.charAt(0))){
			if (compressedText.charAt(0)==2){
				decompressed+=compressedText.charAt(1)+decompress(compressedText.substring(1,compressedText.length()));
			}
			else{
				int num=Character.getNumericValue(compressedText.charAt(0));
				num--;
				System.out.println(compressedText);
				compressedText=num+compressedText.substring(1,compressedText.length());
				System.out.println(compressedText);
				decompressed=compressedText.charAt(1)+decompress(compressedText.substring(1,compressedText.length()));
				System.out.println(compressedText);
				System.out.println();
			}
		}
		else{
			decompressed=compressedText.charAt(0)+decompress(compressedText.substring(1,compressedText.length()));
		}
		return decompressed;
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String compressed=in.nextLine();
		System.out.println(decompress(compressed));
	}
}