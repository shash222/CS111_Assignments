public class SmallestLargest{
    public static void main(String[] args){
        System.out.println("Enter termination number: ");
        double termination=IO.readDouble();
        double number=IO.readDouble();
        if (number==termination){
            number=IO.readDouble();
        }
        double smallest=number;
        double largest=number;
        while (number!=termination){
            if (largest<number){
                largest=number;
            }
            if (smallest>number){
                smallest=number;
            }
            number=IO.readDouble();
            if (){
                IO.reportBadInput();
                break;
            }
        }
        IO.outputDoubleAnswer(largest);
        IO.outputDoubleAnswer(smallest);
    }
}