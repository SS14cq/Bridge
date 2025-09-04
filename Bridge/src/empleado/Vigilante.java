/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;
import turno.Turno;

/**
 *
 * @author sarit
 */
public class Vigilante extends Empleado {
    public Vigilante(String nombre, Turno turno) {
        super(nombre, turno);
    }

    @Override
    public String getRol() {
        return "Vigilante";
    }
}