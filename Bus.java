/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// utms/transport/Bus.java
package utms.transport;

import utms.interfaces.*;

public class Bus extends Vehicle implements Schedulable, Trackable, Serviceable {
    public Bus(String id, String model) {
        super(id, model);
    }

    @Override
    public void schedule(String time) {
        System.out.println("Bus scheduled at " + time);
    }

    @Override
    public void track() {
        System.out.println("Tracking bus location...");
    }

    @Override
    public void service() {
        System.out.println("Servicing the bus.");
    }
}