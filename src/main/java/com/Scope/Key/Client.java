package com.Scope.Key;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Client {
    SingletonService singletonService1;
    SingletonService singletonService2;
    PrototypeService prototypeService1;
    PrototypeService prototypeService2;

    @Autowired
    public Client(@Qualifier("1") SingletonService singletonService1, @Qualifier("2") SingletonService singletonService2, PrototypeService prototypeService1, PrototypeService prototypeService2) {
        this.singletonService1 = singletonService1;
        this.singletonService2 = singletonService2;
        this.prototypeService1 = prototypeService1;
        this.prototypeService2 = prototypeService2;
    }

    public void execute() {
        System.out.println("singleton: " + singletonService1);
        System.out.println("singleton: " + singletonService2);
        System.out.println("prototype: " + prototypeService1);
        System.out.println("prototype: " + prototypeService2);
    }

}
