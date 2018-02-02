import java.util.InputMismatchException;
import java.util.Scanner;

public class Proj02_XXXXXXXXXXXX {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count;

        System.out.println("info");
        System.out.println("info");

        try{
            System.out.print("count: ");
            count = sc.nextInt();
            if(count<=0) throw new InputMismatchException();
        }catch (InputMismatchException e){
            System.out.println("Input error");
            sc.close();
            return;
        }
        System.out.println("numbers:");
        System.out.println("result: "+pozsum(count));
        sc.close();
    }

    private static  int pozsum(int x) {
        int n=0;
        try{
            n = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Input error");
            sc.close();
            System.exit(0);
        }
        if(x==1) {
            return 0;
        }
        return pozsum(x-1)+(n>=0?n:0);
    }
}
