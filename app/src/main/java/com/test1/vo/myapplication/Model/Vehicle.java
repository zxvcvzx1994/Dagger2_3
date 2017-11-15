package com.test1.vo.myapplication.Model;

import javax.inject.Inject;

/**
 * Created by vinh on 11/16/2017.
 */

public class Vehicle {
    private Motor motor;
    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void stop(){
        motor.breakMotor();
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void getSpeed(){
        motor.getRpm();
    }
}
