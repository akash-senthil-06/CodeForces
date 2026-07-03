import java.util.Scanner;
public class ReLU {
    public static int isPositive(int x){
        if(x>=0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(isPositive(x));
    }
}
