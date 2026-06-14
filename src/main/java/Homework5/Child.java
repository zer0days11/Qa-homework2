package Homework5;

public class Child implements Interface1,Interface2,Interface3{
    @Override
    public void programmer() {
        System.out.println("Programmer solves complex problems with code. \n");
    }

    @Override
    public void trader() {
        System.out.println("Trader opens short or long positions on certain assets.\n");
    }

    @Override
    public void sportsman() {
        System.out.println("Focusing on consistent training. ");
    }

    public static void main(String[] args) {
        Child professions = new Child();
        professions.programmer();
        professions.trader();
        professions.sportsman();
    }



}
