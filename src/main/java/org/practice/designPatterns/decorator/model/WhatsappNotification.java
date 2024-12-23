package org.practice.designPatterns.decorator.model;

public class WhatsappNotification extends NotifierDecorator{
    Notifier notifier;
    public WhatsappNotification(Notifier notifier)
    {
        this.notifier = notifier;
    }

    @Override
    public void notifyDownstream()
    {
        notifier.notifyDownstream();
        System.out.println("Sending Notification via Whatsapp");
    }
}
