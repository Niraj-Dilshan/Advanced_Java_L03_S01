package com.ictec.dpatterns;

public interface MySubject {
    public void registerObserver(MyObserver obj);
    public void removeObserver(MyObserver obj);
    public void notifyObserver();
    public void sendMassage();
}
