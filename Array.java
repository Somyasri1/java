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


2write a program to implement method overloading in java

// i/p
      public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Calling the method that adds two integers
        int sum1 = calculator.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        // Calling the method that adds three integers
        int sum2 = calculator.add(5, 10, 15);
        System.out.println("Sum of three integers: " + sum2);

        // Calling the method that adds two doubles
        double sum3 = calculator.add(5.5, 10.5);
        System.out.println("Sum of two doubles: " + sum3);
    }
}

//o/p
      
Sum of two integers: 15
Sum of three integers: 30
Sum of two doubles: 16.0

3)
import java.util.Scanner;
public class sort{
    public static void main(String[] args){
        int i,j,n,temp;
        int a[]=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        n=sc.nextInt();
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
        for(j=0;j<n;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        System.out.println("Sorted list");
        for(i=0;i<n;i++)
        System.out.println("t"+a[i]);
     }
}
}

//o/p
enter n
5
enter elements
1
4
6
3
7
Sorted list
t1
t4
t3
t6
t0

4)public class Animal{
    public static class Animal1{
        void eat(){
            System.out.println("this animal can eat");
        }
}
public static class Dog extends Animal1{
    void Bark(){
        System.out.println("the dog barks");
    }
}
public static void main(String[] args){
    Dog d=new Dog();
    d.eat();
    d.Bark();
    }
}

//o/p
this animal can eat
the dog barks

5)
public class Animal {
    void eat() {
        System.out.println("This animal can eat");
    }

    public static class Mammal extends Animal {
        void walk() {
            System.out.println("Mammal can walk");
        }
    }

    public static class Dog extends Mammal {
        void bark() {
            System.out.println("The dog barks");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Now this works
        d.walk();
        d.bark();
    }
}

//o/p

This animal can eat
Mammal can walk
The dog barks

6)
class Animal {
    String name; // Use 'String' with a capital 'S'

    Animal(String name) {
        this.name = name;
    }

    void displayInfo() { // Corrected method declaration
        System.out.println("Animal name: " + name); // Added '+' for concatenation
    }
}

class Dog extends Animal {
    String breed; // Use 'String' with a capital 'S'

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    void displayInfo() { // Corrected method declaration
        super.displayInfo();
        System.out.println("Dog breed: " + breed); // Added '+' for concatenation
    }
}

public class Main { // Capitalized class name
    public static void main(String[] args) { // Corrected 'voiid' to 'void'
        Dog d = new Dog("Buddy", "Golden"); // Capitalized 'Buddy'
        d.displayInfo();
    }
}

//o/p

Animal name: Buddy
Dog breed: Golden

7)

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value a:");
        double a = sc.nextDouble(); // Use nextDouble() for double input
        
        System.out.println("Enter the value b:");
        double b = sc.nextDouble();
        
        System.out.println("Enter the value c:");
        double c = sc.nextDouble();
        
        double discriminant = b * b - 4 * a * c; // Calculate discriminant
        double root1 = 0, root2 = 0; // Initialize roots
        
        if (discriminant > 0) {
            double d = Math.sqrt(discriminant); // Use Math for square root
            root1 = (-b + d) / (2 * a); // Calculate first root
            root2 = (-b - d) / (2 * a); // Calculate second root
            System.out.println("Roots are: " + root1 + " and " + root2);
            System.out.println("Roots are real and unequal");
        } else if (discriminant == 0) {
            root1 = root2 = -b / (2 * a); // Both roots are equal
            System.out.println("Roots are equal");
            System.out.println("Root: " + root1);
        } else {
            System.out.println("Roots are imaginary");
        }

        sc.close(); // Close the scanner
    }
}

//o/p

Enter the value a:
2
Enter the value b:
2
Enter the value c:
4
Roots are imaginary
