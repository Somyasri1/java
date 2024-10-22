public class Array{
      public static void main(String[] args){
        int[] numbers={1,2,3,4,5};
          for(int i = 0 ;i<numbers.length;i++) {
          System.out.println("element at index" + ":"+ numbers[i]);
       }
    }


1)write a java program to display default value of all primitive data type of java.
      
  //i/p 
    class Default {
    static int i;
    static double d;
    static float f;
    static char c;
    static boolean b;
    static long l;
    public static void main(String[] args){
        System.out.println(i);
        System.out.println(d);
        System.out.println(f);
        System.out.println(c);
        System.out.println(b);
        System.out.println(l);
    }
}
     //o/p
      0
0.0
0.0
.
false
0

EXERCISE-2
a)
    import java.util.Scanner;
public class binary{
    public static void main(String[] args){
        int n,i,key,low,mid,high,found=0;
        int a[]=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        n=sc.nextInt();
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("enter key");
        key=sc.nextInt();
        low=0;
        high=n-1;
        mid=(low+high/2);
        while(low<=high){
            mid=(low+high/2);
            if(a[mid]==key){
                found=found+1;
                System.out.println(mid);
                break;
            }
            else if(a[mid]>key){
                high=mid-1;
        }
        else {
            low=mid+1;
        }
        
    }
    if(found==1)
    {
        System.out.println("key is found at");
        System.out.println(mid);
    }
    else {
        System.out.println("key not found");
    }
}
}

//o/p//

enter n
5
enter elements
2
3
4
5
7
enter key
3
1
key is found at
1

      
