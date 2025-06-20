/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// utms/users/Lecturer.java
package utms.user;

public class Lecturer extends User {
    public Lecturer(String id, String name) {
        super(id, name);
    }

    /**
     *
     */
    @Override
    public void requestTransport() {
        System.out.println("Lecturer requesting transport for lecture.");
    }
}
