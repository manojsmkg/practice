package org.practice.designPatterns.decorator.model;

public class SMSNotification extends NotifierDecorator{
    Notifier notifier;

    public SMSNotification(Notifier notifier)
    {
        this.notifier = notifier;
    }
    @Override
    public void notifyDownstream() {
        notifier.notifyDownstream();
        System.out.println("SMS Notification via SMS");
    }
}
