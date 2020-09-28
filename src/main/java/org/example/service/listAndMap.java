package org.example.service;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author humystart
 * @creat 2020-09-28-10:42
 */
@Component("aaa")
public class listAndMap {
    private List mylist;
    private Map mymap;

    public void setMylist(List mylist) {
        this.mylist = mylist;
    }

    public void setMymap(Map mymap) {
        this.mymap = mymap;
    }

    public void save(){
        System.out.println(mylist);
        System.out.println(mymap);
    }



}
