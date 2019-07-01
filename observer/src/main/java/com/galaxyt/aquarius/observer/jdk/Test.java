package com.galaxyt.aquarius.observer.jdk;

public class Test {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer1 a    = new Observer1(subject);
        Observer2 b = new Observer2(subject);
        subject.setData(5);
        subject.deleteObserver(a);   //注销观察者，以后被观察者有数据变化就不再通知这个已注销的观察者
        subject.setData(10);
    }



}
