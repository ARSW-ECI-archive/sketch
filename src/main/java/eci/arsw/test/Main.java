/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.arsw.test;

import eci.arsw.application.IApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author fchaves
 */
public class Main {
    static public void main(String args[]) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        IApplication app = ac.getBean(IApplication.class);
        app.initializeAppliction();
        app.startAplication();
    }
    
}
