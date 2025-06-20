/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// utms/users/TransportOfficer.java
package utms.user;

public class TransportOfficer extends User {
    public TransportOfficer(String id, String name) {
        super(id, name);
    }

    @Override
    public void requestTransport() {
        System.out.println("Transport Officer requesting official duty vehicle.");
    }

    public void assignDriver(String vehicleType) {
        System.out.println("Assigning driver to vehicle type: " + vehicleType);
    }

    public void assignDriver(String vehicleType, String shiftTime) {
        System.out.println("Assigning driver to " + vehicleType + " for shift: " + shiftTime);
    }
}