package exception01;

public class AgeFault extends  Exception{
    public AgeFault(String msg){
        System.out.println((msg.toString()));
        System.out.println("Can't get a driver's license You are under the age of 18!!!");
    }
}
