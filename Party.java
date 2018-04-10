import java.io.*;
public class Party{
    public static void main(String[] args){
        System.out.println("How many people are attending the party?");
        int people=IO.readInt();
        System.out.println("How many slices is each person going to eat?");
        int eatslices=IO.readInt();
        System.out.println("How many cans of soda is each person going to drink?");
        int drinkcans=IO.readInt();
        System.out.println("How much does each pie of pizza cost?");
        double costpizza=IO.readDouble();
        System.out.println("How many slices of pizza does each pie have?");
        int slicesinpie=IO.readInt();
        System.out.println("How much does each case of soda cost?");
        double costcase=IO.readDouble();
        System.out.println("How many cans of soda are in each case?");
        int canspercase=IO.readInt();
        double totalcost=0;
        int slicesneeded=people*eatslices;
        int piesneeded=(slicesneeded/slicesinpie);
        if (slicesneeded%slicesinpie>0){
            piesneeded++;
        }
        double piescost=piesneeded*costpizza;
        int cansneeded=people*drinkcans;
        int casesneeded=cansneeded/canspercase;
        if (cansneeded%canspercase>0){
            casesneeded++;
        }
        double canscost=casesneeded*costcase;
        totalcost=(piescost+canscost)*100;
        totalcost=Math.round(totalcost);
        totalcost/=100;
        IO.outputDoubleAnswer(totalcost);
    }
}