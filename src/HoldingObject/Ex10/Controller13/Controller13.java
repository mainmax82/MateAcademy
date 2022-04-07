package HoldingObject.Ex10.Controller13;

import AccessControl.Ex1.Controller.Event;

import java.util.LinkedList;
import java.util.ListIterator;

public class Controller13 {
    private LinkedList<Event> eventList = new LinkedList<Event>();
    public void addEvent(Event c) { eventList.add(c); }
    public void run() {
        LinkedList<Event> eventListCopy =
                new LinkedList<Event>(eventList);
        ListIterator<Event> it
                = eventListCopy.listIterator();
        while(it.hasNext()) {
            it.next().action();
            it.previous();
            System.out.println(it.next());
        }
    }
}
