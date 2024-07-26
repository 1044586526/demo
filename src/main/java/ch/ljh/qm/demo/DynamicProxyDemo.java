package ch.ljh.qm.demo;

import ch.ljh.qm.proxy.Service;
import ch.ljh.qm.proxy.impl.ServiceImpl;
import ch.ljh.qm.proxy.impl.ServiceInvocationHandler;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        Service proxy = (Service) Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),
                new ServiceInvocationHandler(service)
        );
        proxy.perform();
    }
}
