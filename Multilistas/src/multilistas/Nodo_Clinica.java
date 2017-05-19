/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilistas;

/**
 *
 * @author leona
 */
public class Nodo_Clinica {
    String nombre;
    String direccion;
    int telefono;
    Nodo_Paciente ptrClinica;
    Nodo_Clinica link;

    public Nodo_Clinica(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        link=null;
        ptrClinica=null;
    }
    
    
    public void setLink(Nodo_Clinica link) {
        this.link = link;
    }
    
}
