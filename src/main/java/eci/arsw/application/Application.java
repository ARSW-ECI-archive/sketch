/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.arsw.application;

import eci.arsw.controller.IController;

/**
 *
 * @author fchaves
 */
public class Application implements IApplication {

    private IController controller;
    
    @Override
    public void initializeAppliction() {
           // TODO
    }

    @Override
    public void startAplication() {
           // TODO
        String msg = controller.exampleMethod("Hello world");
        System.out.println(msg);
    }

    public void setController(IController controller) {
        this.controller = controller;
    }

    public IController getController() {
        return controller;
    }

}
