/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package implementacionarbolesjava;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Besgo
 */
public class Item {
    private String nombre;
    private String descripcion;

    public Item(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    @Override
    public int hashCode(){
        return nombre.hashCode();
    }
    
    @Override
    public boolean equals(Object otro){
        if(otro.getClass() != Item.class) return false;
        Item otroItem = (Item)otro;
        if(this.nombre == otroItem.nombre) return true;
        return this.nombre != null && this.nombre.equals(otroItem.nombre);
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
    
    public static void main(String[] args) {
        Set<Item> set = new HashSet<>();
        Item primero = new Item("Aceite", "Aceite de Soya");
        set.add(primero);
        Item segundo = new Item("Panela", "Caña de Azucar");
        set.add(segundo);
        
        System.out.println(set);
    }
}
