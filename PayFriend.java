import java.io.*;
public class PayFriend{
    public static void main(String[] args){
        System.out.println("How much would you like to pay?");
        double payment=IO.readDouble();
        double total;
        double fee;
        if (payment<=100){
            fee=5;
        }
        else if (payment>100&&payment<1000){
            if ((payment*.03)>6){
                fee=payment*.03;
            }
            else{
                fee=6;
            }
        }
        else if (payment>=1000&&payment<10000){
            if ((.01*payment)>15){
                fee=(.01*payment);
            }
            else{
                fee=(15+payment);
            }
        }
        else{
            double fee1=(10000*.01);
            double fee2=0;
            double fee3=0;
            if (payment>10000){
                if (payment<=15000){
                    fee2=((payment-10000)*.02);
                }
                else{
                    fee2=5000*.02;
                }
            }
            if (payment>15000){
                fee3=((payment-15000)*.03);
            }
            System.out.println(fee1+"  "+fee2+"   "+fee3);
            fee=(fee1+fee2+fee3);
        }
        total=(payment+fee);
        IO.outputDoubleAnswer(fee);
    }
}