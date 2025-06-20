/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// utms/users/Student.java
package utms.user;

public class Student extends User {
    public Student(String id, String name) {
        super(id, name);
    }

    @Override
    public void requestTransport() {
        System.out.println("Student requesting transport to class.");
    }
}
