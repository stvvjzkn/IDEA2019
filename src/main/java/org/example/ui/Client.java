package org.example.ui;

import org.example.service.listAndMap;
import org.example.service.takeCookImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author humystart
 * @creat 2020-09-25-10:39
 */
public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //takeCookImpl userserviceImpl = (takeCookImpl) ac.getBean("takeCookImpl");
        //userserviceImpl.CookForCustomer();
        listAndMap listAndMap = (listAndMap)ac.getBean("aaa");
        listAndMap.save();

    }
}
