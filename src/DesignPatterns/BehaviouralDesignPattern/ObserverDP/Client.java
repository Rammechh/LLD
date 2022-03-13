package DesignPatterns.BehaviouralDesignPattern.ObserverDP;

public class Client {
//    https://www.javatpoint.com/observer-design-pattern-in-python
//    https://www.geeksforgeeks.org/observer-pattern-set-1-introduction/
//    An observer design pattern is a behavioral design pattern where objects are represented as observers
//    that wait for an event to trigger. When the new event is triggered, the multiple observers catch these events.

//    The event source (or object) attaches to the subject. Whenever the change is performed in the subject,
//    it is notified by the observer. It follows the one to many approaches between the objects
//    so that one change in the subject will reflect in all of its dependents and be updated automatically.

//    The objects that contain some interesting information are represented as the subject.
//    It notifies the other objects to change to its state is known as the publisher.
//    All the other objects that want to track changes to the publisher's state are called subscribers.
    public static void main(String[] args) {
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

        // Pass the displays to Cricket data
        CricketData cricketData = new CricketData(currentScoreDisplay,
                averageScoreDisplay);

        // In real app you would have some logic to call this
        // function when data changes
        cricketData.dataChanged();
    }
}
