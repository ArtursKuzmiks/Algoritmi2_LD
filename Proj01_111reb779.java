import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Proj01_111reb779 {
    private static int last;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count;

        System.out.println("Arturs Kuzmiks 12.gr. 111REB779");
        System.out.println("Sergejs Visockis 12.gr. 171RDB043");

        try{
            System.out.print("count: ");
            count = Integer.parseInt(br.readLine());
            if(count<=0) throw new IllegalArgumentException();
        }catch (IllegalArgumentException e){
            System.out.println("Input error");
            return;
        }
        System.out.println("numbers:");
        System.out.println("result: "+maxpos(count));
    }

    private static int maxpos(int x) throws IOException{
        int b=0;
        int n = 0;
        if(x>0){
            try{
                n = Integer.parseInt(br.readLine());
            }catch (IllegalArgumentException e){
                System.out.println("Input error");
                System.exit(0);
            }
            if(x==1) return n;

            b=maxpos(x - 1);

            if(n>b) b=n;
        }
        return b;
    }

    private static  int pozsum(int x) throws IOException{
        int n=0;
        try{
            n = Integer.parseInt(br.readLine());
        }catch (IllegalArgumentException e){
            System.out.println("Input error");
            System.exit(0);
        }
        if(x==1) {
            return 0;
        }
        return pozsum(x-1)+(n>=0?n:0);
    }
}
