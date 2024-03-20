/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto;

/**
 *
 * @author Usuario
 */
public class Producto {
    
    String codigo;
    String nombre;
    String descripcion;
    int cantidad;
    double precioUnitario;
    String categoria;
    boolean estado;
    float peso;
    
    public Producto(){
    }
    
    public Producto(String codigo, String nombre, String desc, int cantidad, double precioU, String categoria, boolean estado, float peso){
        
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = desc;
        this.cantidad =  cantidad;
        this.precioUnitario = precioU;
        this.categoria =  categoria;
        this.estado = estado;
        this.peso = peso; 
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
@Override
    public String toString() {
        return """
               Producto: 
               {codigo = """ + codigo + "\n nombre=" + nombre + "\n descripcion=" + descripcion + "\n cantidad=" + cantidad + "\n precioUnitario=" + precioUnitario + "\n categoria=" + categoria + "\n estado=" + estado + "\n peso=" + peso + '}';
    }
    
} 
