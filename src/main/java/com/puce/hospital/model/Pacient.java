package com.puce.hospital.model;

import jakarta.persistence.*;

@Entity

public class Pacient {

    @Id
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double altura;

    public Pacient() {
        super();
    }
    public Pacient(int id, String nombre, String apellido, int edad, double peso, double altura) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    

    
    
}
