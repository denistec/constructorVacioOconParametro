package com.veterinaria.animales;

public class Perro {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    private String historialMedico;

    // Constructor vacío
    public Perro() {
    }

    // Constructor con parámetros
    public Perro(String nombre, String raza, int edad, double peso, String historialMedico) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.historialMedico = historialMedico;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getHistorialMedico() {
        return historialMedico;
    }
    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    // Método para mostrar la ficha del perro
    public void mostrarFichaRegistro() {
        System.out.println("----- Ficha de registro -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " Kg");
        System.out.println("Historial Médico: " + historialMedico);
        System.out.println("-----------------------------");
    }
}
