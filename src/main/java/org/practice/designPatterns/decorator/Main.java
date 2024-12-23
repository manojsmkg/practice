package org.practice.designPatterns.decorator;

import org.practice.designPatterns.decorator.model.*;


//When you want to add multiple features on top of other, using decorator pattern is useful
public class Main {

    public static void main(String[] args)
    {
        //email notification for some alert
        Notifier alertNotifier = new EmailNotification(new AlertNotifier());
        alertNotifier.notifyDownstream();

        //email,sms,teams notification for success msg
        Notifier grpNotifier = new WhatsappNotification(new SMSNotification(new EmailNotification(new SuccessNotifier())));
        grpNotifier.notifyDownstream();
    }
}
