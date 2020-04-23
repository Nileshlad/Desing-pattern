package com.desingpattern.observe;

public class ObserverPatternTest {
    public static void main(String[] args) {
    //create subject
    MyTopic topic = new MyTopic();

    //create observers
    Observer obj1 = new MyTopicSubscriber("Obj1");
    Observer obj2 = new MyTopicSubscriber("Obj2");
    Observer obj3 = new MyTopicSubscriber("Obj3");

    //register observers to the subject
    topic.register((java.util.Observer) obj1);
    topic.register((java.util.Observer) obj2);
    topic.register((java.util.Observer) obj3);

    //attach observer to subject
    obj1.setSubject(topic);
    obj2.setSubject(topic);
    obj3.setSubject(topic);

    //check if any update is available
    obj1.update();

    //now send message to subject
    topic.postMessage("New Message");
}

}