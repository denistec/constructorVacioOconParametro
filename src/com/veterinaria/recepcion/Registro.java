package com.veterinaria.recepcion;

import com.veterinaria.animales.Perro;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1: Crear objeto con constructor vacío
        Perro perroUsuario = new Perro();

        //2: Solicitar datos al usuario y asignar con setters
        System.out.print("Ingrese el nombre del perro: ");
        perroUsuario.setNombre(sc.nextLine());

        System.out.print("Ingrese la raza del perro: ");
        perroUsuario.setRaza(sc.nextLine());

        System.out.print("Ingrese la edad del perro: ");
        perroUsuario.setEdad(sc.nextInt());

        System.out.print("Ingrese el peso del perro: ");
        perroUsuario.setPeso(sc.nextDouble());
        sc.nextLine(); // Limpiar salto de línea pendiente

        System.out.print("Ingrese el historial médico del perro: ");
        perroUsuario.setHistorialMedico(sc.nextLine());

        // Mostrar la ficha con los datos ingresados
        System.out.println();
        perroUsuario.mostrarFichaRegistro();

        sc.close();
    }
}
