import java.io.*;
public class LuckySevens{
	public static void main(String[] args){
		String number;
		int totalsevens=0;
		System.out.println("Enter lower bound:");
		int lowerbound=IO.readInt();
		System.out.println("Enter upper bound:");
		int upperbound=IO.readInt();
		for (int x=lowerbound;x<=upperbound;x++){
			number=Integer.toString(x);
			for (int y=0;y<number.length();y++){
				if (number.charAt(y)=='7'){
					totalsevens++;
				}
			}
		}
		IO.outputIntAnswer(totalsevens);
	}
}