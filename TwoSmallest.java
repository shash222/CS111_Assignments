public class TwoSmallest{
    public static void main(String[] args){
        System.out.println("Enter termination number: ");
        double termination=IO.readDouble();
        double number=IO.readDouble();
        double smallest=number;
        double smallest2=number;
        while (number!=termination){
            if (smallest>=number){
                smallest2=smallest;
                smallest=number;
            }
            else if (smallest2>=number){
                smallest2=number;
            }
            System.out.println(smallest+"   "+smallest2);
            number=IO.readDouble();
        }
        IO.outputDoubleAnswer(smallest);
        IO.outputDoubleAnswer(smallest2);
    }
}