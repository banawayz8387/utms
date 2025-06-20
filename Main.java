/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// utms/Main.java
package utm;

import utms.user.*;
import utms.transport.*;

public class Main {
    public static void main(String[] args) {
        User student = new Student("S123", "Alice");
        User lecturer = new Lecturer("L456", "Dr. Bob");
        TransportOfficer officer = new TransportOfficer("T789", "Mr. Charles");

        student.requestTransport();
        lecturer.requestTransport();
        officer.requestTransport();

        officer.assignDriver("Bus");
        officer.assignDriver("Van", "Morning");

        Bus bus = new Bus("B01", "Mercedes");
        bus.schedule("8:00 AM");
        bus.track();
        bus.service();
    }
}