package DesignPatterns.BehaviouralDesignPattern.ObserverDP.Set2;

public interface Subject {
    public void registerObserver(Observer o);
    public void unregisterObserver(Observer o);
    public void notifyObserver(Observer o);
}
