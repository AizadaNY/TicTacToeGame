import java.util.Scanner;

public class ReusableUtils {


    public int getPlayerInput(){
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        return input;
    }

    public String getPlayerInput(String message){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();
        return input;
    }
}
