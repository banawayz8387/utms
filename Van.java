/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// utms/transport/Van.java
package utms.transport;

import utms.interfaces.*;

public class Van extends Vehicle implements Schedulable, Serviceable {
    public Van(String id, String model) {
        super(id, model);
    }

    @Override
    public void schedule(String time) {
        System.out.println("Van scheduled at " + time);
    }

    @Override
    public void service() {
        System.out.println("Servicing the van.");
    }
}
