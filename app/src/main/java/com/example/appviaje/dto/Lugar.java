package com.example.appviaje.dto;

public class Lugar {
    private byte[] imagen;
    private String nombre;
    private String direccion;

    public Lugar() {
    }

    public Lugar(byte[] imagen, String nombre, String direccion) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
