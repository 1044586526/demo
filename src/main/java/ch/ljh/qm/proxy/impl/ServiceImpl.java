package ch.ljh.qm.proxy.impl;

import ch.ljh.qm.proxy.Service;

public class ServiceImpl implements Service {
    @Override
    public void perform() {
        System.out.println("I‘m OK");
    }
}
