import java.util.*;

class notAdult extends Exception{
    notAdult(String message){
        super(message);
    }
}


public class dgp{

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Name- ");
        String st = input.nextLine();

        System.out.println("Enter Age- ");
        int age = input.nextInt();

        System.out.println("Enter Nationality- ");
        String str = input.next();


        if(!str.equals("india")){
            throw new notAdult("You are not Eligible");
        }else if(age<18){
            throw new notAdult("You are not Eligible");

        }else{
            System.out.println("Candidate is eleigible to vote");
        }
    }

}