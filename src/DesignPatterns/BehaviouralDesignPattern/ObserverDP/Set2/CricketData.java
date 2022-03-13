package DesignPatterns.BehaviouralDesignPattern.ObserverDP.Set2;

import java.util.ArrayList;
import java.util.Iterator;

public class CricketData {
    int runs, wickets;
    float overs;

    ArrayList<Observer> observerArrayList;

    public CricketData(){
        observerArrayList = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o){
        observerArrayList.add(o);
    }

    public void unregisterObserver(Observer o){
        observerArrayList.remove(observerArrayList.indexOf(o));
    }

    public void notifyObservers(){
        for(Iterator<Observer> it = observerArrayList.iterator(); it.hasNext();){
            Observer o = it.next();
            o.update(runs, wickets, overs);
        }
    }

    // get latest runs from stadium
    private int getLatestRuns()
    {
        // return 90 for simplicity
        return 90;
    }

    // get latest wickets from stadium
    private int getLatestWickets()
    {
        // return 2 for simplicity
        return 2;
    }

    // get latest overs from stadium
    private float getLatestOvers()
    {
        // return 90 for simplicity
        return (float)10.2;
    }

    // This method is used update displays
    // when data changes
    public void dataChanged()
    {
        //get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        notifyObservers();
    }

}
