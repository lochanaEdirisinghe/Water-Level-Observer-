/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Lochana
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControlRoom controlRoom=new ControlRoom();
        controlRoom.addWaterLevelObserver(new Alarm());
        controlRoom.addWaterLevelObserver(new Display());
        new WaterTank(controlRoom).setVisible(true);
    }
    
}
