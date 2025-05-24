package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Persona> Personas = new ArrayList<>();

    public static void main(String[] args) {
        CapturarDatos(Personas);
        PromedioEdad(Personas);
        System.out.println("Total personas con genero Masculino = " +  PersonasPorGenero(Personas,"masculino"));
        System.out.println("Total personas con genero Femenino = " + PersonasPorGenero(Personas,"femenino"));
        System.out.println("La edad promedio es : " + PromedioEdad(Personas));

    }
    public static void CapturarDatos(ArrayList<Persona>personas) {
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
    public static double PromedioEdad(ArrayList<Persona>personas) {
        int sumaEdad = 0;
        for (Persona p : personas){
            sumaEdad += p.getEdad();
        }
        return (double) sumaEdad / personas.size();
    }
    public static int PersonasPorGenero(ArrayList<Persona> personas, String genero){
        int cantidad = 0;
        for (Persona p : personas){
            if (p.getGenero().equalsIgnoreCase(genero)){
                cantidad ++;
            }

        }
        return cantidad;
    }

}