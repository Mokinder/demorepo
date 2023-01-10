import java.util.*;
public class thirdpro {
    public static void main(String args[]){
        int a[] = new int[10];
        System.out.println("Enter the numbers : ");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<a.length-1;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<a.length-1;i++){
            System.out.println(a[i]);
        }
    }
}
