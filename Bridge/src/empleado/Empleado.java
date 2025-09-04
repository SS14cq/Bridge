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

public abstract class Empleado {
    public String nombre;
    public Turno turno;

    public Empleado(String nombre, Turno turno) {
        this.nombre = nombre;
        this.turno = turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public abstract String getRol();

    public String mostrarInfo() {
        return String.format("%-10s | %-10s | %-10s", nombre, getRol(), turno.getNombre());
    }
}

