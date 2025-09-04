/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Launcher;

/**
 *
 * @author sarit
 */
import empleado.*;
import turno.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Lista de empleados
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Cajero("Juan", new Mañana()));
        empleados.add(new Vigilante("Pedro", new Noche()));
        empleados.add(new Cajero("María", new Tarde()));

        // Simulación de 7 días
        String[] dias = {"Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"};
        Random rand = new Random();
        Turno[] turnos = {new Mañana(), new Tarde(), new Noche()};

        System.out.println("Empleado   | Rol        | Día | Turno");
        System.out.println("--------------------------------------");

        for (String dia : dias) {
            for (Empleado e : empleados) {
                // asigna turno aleatorio
                e.setTurno(turnos[rand.nextInt(turnos.length)]);
                System.out.printf("%-10s | %-10s | %-3s | %-10s%n",
                        e.nombre, e.getRol(), dia, e.turno.getNombre());
            }
        }
    }
}

