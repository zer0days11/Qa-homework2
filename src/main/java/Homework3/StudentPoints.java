package Homework3;

public class StudentPoints {
    static int[] stundentPoints = {60, 70 ,75 ,80, 91, 93,97};

    public static void main(String[] args) {
        int n = 1;
        for (int i = 0; i < stundentPoints.length; i++){
            if (stundentPoints[i] > 75)    System.out.println(n++ +")" + "ქულა: " +stundentPoints[i]);

        }

    }
}
