import java.util.*;
class amicable_no{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s1 = 0,s2 =0;
        System.out.println("enter the no");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 1;i<a;i++){
            if (a%i==0){
                s1 = s1+i;
            }
        }for(int i = 1;i<b;i++){
            if (b%i==0){
                s2 = s2+i;
            }
        }if(s1==b && s2 ==a){
            System.out.println("no are amicable");
        }else{
            System.out.println("no are not amicable");
        }
    }
}