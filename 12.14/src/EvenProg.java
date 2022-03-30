import java.util.Scanner;

public class EvenProg {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("wpisz cyfre: ");
        int cyfra = scan.nextInt();

        if (isTrue(cyfra)){
            System.out.println(cyfra + " jest parzysta!");
        }else
            System.out.println(cyfra + " jest nieparzysta!");
    }
     public static boolean isTrue(int x){
        if (x%2 == 0){
            return true;
        }
        else
            return false;
    }
}



