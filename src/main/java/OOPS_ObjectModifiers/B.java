package main.java.OOPS_ObjectModifiers;

public class B {
    private int x;

    public int getX(){
        return x;
    }

    // Developer of B class can now control how other classes will set value of x
    // He/She can contol that other people can't set x to invalid values
    public void setX(int x){
        if(x < 0){
            System.out.println("X can't be set to negative values");
            return;
        }
        this.x = x;
    }

    // public data members should ideally be not in a class
    public int y;

    int z; // this is the default, it is called package private
    // z is visible to classes in same folder
    // but z is invisible outside this folder
}

