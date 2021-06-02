/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framesconsultas;

/**
 *
 * @author Jesús
 */
public class Huesped { 
    private String nombre;
    private int habitacion;
    private String tipohab;
    
    public Huesped(String nombre, int habitacion, String tipohab) {
        this.nombre = nombre;
        this.habitacion = habitacion;
        this.tipohab = tipohab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public String getTipohab() {
        return tipohab;
    }

    public void setTipohab(String tipohab) {
        this.tipohab = tipohab;
    }

    @Override
    public String toString() {
        return "Huesped{" + "nombre=" + nombre + ", habitacion=" + habitacion + ", tipohab=" + tipohab + '}';
    }
    
    public String Mostrar(){
        return "Huesped: " + nombre + " --- " + "Habitación numero: " + habitacion;
    }
    
}
