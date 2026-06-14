package Homework6;

public class Overloading {

    void points(int[] array){
        System.out.println("Integer array:");
        for (int i = 0; i<array.length; i++) System.out.println(array[i]);

    }

    void names(String[] array){
        System.out.println("\nString Array:");
        for (int i=0;i<array.length;i++) System.out.println(array[i]);
    }

    public static void main(String[] args) {


        Overloading students = new Overloading();

        int[] arrayInt = {12,14,15,12,10};
        students.points(arrayInt);

        String[] arrayString = {"internet","web3","narrative","java","qa" };
        students.names(arrayString);
    }
}
