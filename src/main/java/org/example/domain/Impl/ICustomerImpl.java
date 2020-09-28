package org.example.domain.Impl;

import org.example.domain.ICustomer;
import org.example.domain.IKitchener;
import  java.util.List;
import java.util.Map;

/**
 * @author humystart
 * @creat 2020-09-26-9:00
 */
public class ICustomerImpl  implements ICustomer {
    private String name;
    private IKitchener iKitchener;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IKitchener getiKitchener() {
        return iKitchener;
    }

    public void setiKitchener(IKitchener iKitchener) {
        this.iKitchener = iKitchener;
    }

    public ICustomerImpl() {
    }

    public ICustomerImpl(String name, IKitchener iKitchener) {
        this.name = name;
        this.iKitchener = iKitchener;
    }

    public void haveDinner() {
        System.out.println("顾客吃饭！！！");
    }
}
