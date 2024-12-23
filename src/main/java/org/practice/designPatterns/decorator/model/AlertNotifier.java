package org.practice.designPatterns.decorator.model;

public class AlertNotifier extends Notifier{
    @Override
    public void notifyDownstream() {
        System.out.println("Received an alert, notifying downstreams");
    }
}
