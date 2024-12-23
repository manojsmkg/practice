package org.practice.designPatterns.decorator.model;

public class EmailNotification extends NotifierDecorator{
    Notifier notifier;
    public EmailNotification(Notifier notifier)
    {
        this.notifier = notifier;
    }

    @Override
    public void notifyDownstream()
    {
        notifier.notifyDownstream();
        System.out.println("Sending Notification via email");
    }
}
