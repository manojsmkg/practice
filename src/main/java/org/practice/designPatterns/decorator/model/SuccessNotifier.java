package org.practice.designPatterns.decorator.model;

public class SuccessNotifier extends Notifier{
    @Override
    public void notifyDownstream() {
        System.out.println("Received a Success, notifying downstreams");
    }
}
