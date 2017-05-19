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
public class Nodo_Paciente {
    long cedula;
    String nombre;
    String enfermedad;
    String clinica;
    String sexo;
    Nodo_Paciente Llink;
    Nodo_Paciente Rlink;
    
    public Nodo_Paciente(long cedula,String nombre,String e,String c,String sex){
        this.cedula=cedula;
        this.nombre=nombre;
        this.enfermedad=e;
        this.clinica=c;
        this.sexo=sex;
        Llink=null;
        Rlink=null;
    }
}
