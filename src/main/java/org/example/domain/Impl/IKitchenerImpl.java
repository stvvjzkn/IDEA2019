package org.example.domain.Impl;

import org.example.domain.IKitchener;

/**
 * @author humystart
 * @creat 2020-09-26-9:01
 */
public class IKitchenerImpl implements IKitchener {
String name;
String nashoucai;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNashoucai() {
        return nashoucai;
    }

    public void setNashoucai(String nashoucai) {
        this.nashoucai = nashoucai;
    }

    public IKitchenerImpl() {
    }

    public IKitchenerImpl(String name, String nashoucai) {
        this.name = name;
        this.nashoucai = nashoucai;
    }

    public void doCooking() {
        System.out.println("厨师做饭！！");
    }

}
