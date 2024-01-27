

public class Practice {
    public static void main(String[] args) {
        int outcome = sum3(10,20,30);
        System.out.println("outcome = " + outcome);
        
        double value = area(10,10);
        System.out.println("value = " + value);
    }

    public static void printGreeting(String name, int langCode){
        if(langCode == 0) {
            System.out.println("Hello " + name + ", How are you ?");
        }
        if(langCode == 1) {
            System.out.println("Hola "+ name +", como estas ?");
        }
    }
    
    public static void calculateIntrest(double principal, double roi, int years) {
        double intrest = principal*roi*years/100;
        System.out.println("intrest = " + intrest);
    }

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int sum3(int a, int b, int c) {
        return sum(a,b)+c;
    }
    
    public static double area(double length, double width){
        return length*width;
    }
    
}
// Access Modifier - public, private, protected, default
// static -- optional ( depend on use case)
// return type

// write a method which calculate simple interest, it should take principal, rate of interest and years as argument
// write a method which gonna return sum of two integer values.
// We need to have a method which gonna return sum of 3 integer values

// write a method to calculate area of rectangle, you will recieve length and width (double) 

