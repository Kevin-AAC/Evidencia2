package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Persona> Personas = new ArrayList<>();

    public static void main(String[] args) {
        CapturarDatos(Personas);
        PromedioEdad(Personas);



    }
    public static void CapturarDatos(ArrayList<Persona>){
        int i = 1;
        while (i <= 5) {
            System.out.println("Ingresa tu nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingresa tu apellido: ");
            String apellido = scanner.nextLine();
            System.out.println("Ingresa tu genero: ");
            String genero = scanner.nextLine();
            System.out.println("Ingresa tu edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            Personas.add(new Persona(nombre,apellido,genero,edad));

            i++;
        }
        for (int j = 0; j< Personas.size();j++){
            Persona p = Personas.get(j);
            System.out.println("Nombre: " + p.getNombre() +  " Genero: "+ p.getGenero());
        }
        scanner.close();
    }
    public static void PromedioEdad(ArrayList<Persona>){
        int sumaEdad = 0;
        for (Personas p : personas){
            int edad = p.getEdad();
            sumaEdad += edad;
        }
        double promedio = sumaEdad / personas.size();
        System.out.println("La edad promedio es :"+ promedio);
    }
    public static void PersonasPorGenero(ArrayList<Persona> personas, String genero){

    }

}