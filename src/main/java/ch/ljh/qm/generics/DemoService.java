package ch.ljh.qm.generics;

import java.util.List;

public class DemoService {

    public <T extends Number> String processNumberExtend(T number){
        return "123";
    }


    public <T extends Number> String processNumberSuper(List<? super T> numbers){
        return "123";
    }
}
