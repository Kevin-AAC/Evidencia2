package org.example;

public class Persona {
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;

    public Persona (String nombre, String apellido, String genero, int edad) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.genero = genero;
       this.edad = edad;

    }
    public String getNombre(){return nombre;}

    public void setNombre(String nombre){this.nombre = nombre;}

    public String getApellido(){return apellido;}

    public void setApellido(String apellido){this.apellido = apellido;}

    public String getGenero(){return genero;}

    public void setGenero(String genero){this.genero = genero;}

    public int getEdad(){return edad;}
}
