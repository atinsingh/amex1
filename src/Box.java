/*
    class names always start with Capital letter
    classes are also called User Defined Type ( UDT)
    class have properties ( variables/contract ) and methods , constructors
 */
/*
    Constructor
     // Its job to create a object , and intialize
    1. It has no return type
    2. Name should be same as class
 */
public class Box {
    double width;
    double height;
    double length;

    // No Argument
    public double area(){
        return this.length*this.width;
    }

    public double volume(){
        return  width*length*height;
    }

}
