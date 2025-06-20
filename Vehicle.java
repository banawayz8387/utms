/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// utms/transport/Vehicle.java
package utms.transport;

public abstract class Vehicle {
    private final String vehicleId;
    private final String model;

    public Vehicle(String vehicleId, String model) {
        this.vehicleId = vehicleId;
        this.model = model;
    }

    public String getVehicleId() { return vehicleId; }
    public String getModel() { return model; }
}
