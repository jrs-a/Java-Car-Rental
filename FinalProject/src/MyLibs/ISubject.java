/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

/**
 *
 * @author Jam
 */
public interface ISubject {
    public void addSubscriber(IObserver observer);
    public void removeSubscriber(IObserver observer);
    public void notifySubscribers(int carNo, Boolean availability);
}