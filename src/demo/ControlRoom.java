/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;

/**
 *
 * @author Lochana
 */
public class ControlRoom {
    private ArrayList <WaterLevelObserver>observerList=new ArrayList<>();
    private int waterLevel;
    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        observerList.add(waterLevelObserver);
    }
    public void removeWaterLevelObserver(WaterLevelObserver waterLevelObserver){
        observerList.remove(waterLevelObserver);
    }
    public void notifyWaterLevel(){
        for (WaterLevelObserver waterLevelObserver : observerList) {
            waterLevelObserver.update(waterLevel);
        }
    }
    public void setWaterLevel(int waterLevel){
        if(this.waterLevel!=waterLevel){
            this.waterLevel=waterLevel;
            notifyWaterLevel();
        }
    }
}
