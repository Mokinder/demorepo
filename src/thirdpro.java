import java.util.*;
public class thirdpro {
    public static void main(String args[]){
        int a[] = new int[10];
        int o=0;
        int e=0;
        int sum=0;
        System.out.println("Enter the numbers : ");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<a.length-1;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<a.length-1;i++){
            System.out.println(a[i]);
        }
        for (int i=0;i<a.length-1;i++){
            if(i%2==0){
                e++;
            }
            else {
                o++;
            }
        }
        System.out.println(" no of odd "+o+"\n no of even "+e);
//
        for( int i=0;i< a.length-1;i++){
            sum+=a[i];
        }
        System.out.println("The Sum of given numbers is : "+sum);
    }
}
