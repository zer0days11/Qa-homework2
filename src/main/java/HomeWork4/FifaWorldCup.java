package HomeWork4;

public class FifaWorldCup extends WorldChampionship {


    @Override
    void participants() {
        System.out.println("32 Team participates in Fifa World Cup");
    }
    void players(){
        System.out.println("Players Can win goldMedals.");
    }


    // Access modifiers.
    public String hostCountry; // public ცვლადს დაინახავს როგორც ამავე ფექიჯში არსებული კლასები,ასევე სხვა ფექიჯიდანაც შეგვიძლია მივწვდეთ.
    int totalTeams; // Default წვდომის მოდიფიკატორს. შეგვიძლია მივწვდეთ მხოლოდ ამავე ფექიჯში არსებული კლასებიდან.
    private int totalMedals; // Private - მხოლოდ ამავე კლასიდან შეგვიძლია მივწვდეთ.


    public void setMedal(int totalMedals){
        this.totalMedals = totalMedals;
    }

    public static void main(String[] args) {
    FifaWorldCup team = new FifaWorldCup();
    team.hostCountry = "USA";
    team.totalTeams = 32;
    team.setMedal(30);
        System.out.println("ჩემპიონატი ტარდება: " + team.hostCountry + "\nგუნდები რაოდენობა: " + team.totalTeams + "\n" + "მედლების რაოდენობა გუნდში :" + team.totalMedals + "\n");
        team.participants();
        team.players();
        team.winner("Argentina");




    }



}
