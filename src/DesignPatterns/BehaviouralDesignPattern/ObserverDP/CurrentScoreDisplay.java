package DesignPatterns.BehaviouralDesignPattern.ObserverDP;

public class CurrentScoreDisplay {
    private int runs, wickets;
    private float overs;

    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.overs = overs;
        this.wickets = wickets;
        display();
    }

    private void display() {
        System.out.println("\nCurrent Score Display: \n" +
                "Runs: " + runs +"\nWickets:"
                + wickets + "\nOvers: " + overs );
    }


}
