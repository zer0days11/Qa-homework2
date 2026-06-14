package HomeWork4;


// აბსტრაქტული კლასი
public abstract class WorldChampionship {


    abstract void participants();


    abstract void players();


    void winner(String winner){
        System.out.println("Winner will be: " + winner);
    }
}
