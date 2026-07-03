import java.util.Scanner;
public class WrongSubtraction {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split("\\s+");
        int n=Integer.parseInt(a[0]);
        int k=Integer.parseInt(a[1]);
        for(int i=1;i<=k;i++){
            if(n%10!=0)
                n-=1;
            else if(n%10==0)
                n/=10;
        }
        System.out.println(n);
    }
}
