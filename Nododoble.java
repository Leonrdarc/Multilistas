/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilista;

/**
 *
 * @author mechala
 */
public class Nododoble {
    Nododoble Rlink, Llink;
    int cedula;
    String nombre;
    String informacion;
    String sexo;
    void agregarAlPrincipio(Nododoble ptr,Nododoble p){
        if (ptr==null) {
            ptr=p;
            
        }else{
            ptr.Llink=p;
            p.Rlink=ptr;
            p.Llink=null;
            ptr=p;
        }
    
    
    }
    void agregarAlFinal(Nododoble ptr,Nododoble p){
        if (ptr==null) {
            ptr=p;
        }else{
            Nododoble q=ptr;
        while(q.Rlink!=null){
         q=q.Rlink;
        }
        q.Rlink=p;
        p.Llink=q;
        }
    
    
    }
    void agregarConCedulaAntes(Nododoble ptr,Nododoble p,int cedula){
        if (ptr==null) {
             ptr=p;
        }else{
            Nododoble q=ptr;
        while(q.Rlink!=null && q.cedula!=cedula){
         q=q.Rlink;
        }
        p.Rlink=q;
        p.Llink=q.Llink;
        p.Llink.Rlink=p;
        p.Rlink.Llink=p;
        
        }
    
    
    }
    void agregarConCedulaDespues(Nododoble ptr,Nododoble p,int cedula){
     if (ptr==null) {
             ptr=p;
        }else{
            Nododoble q=ptr;
        while(q.Rlink!=null && q.cedula!=cedula){
         q=q.Rlink;
        }
        p.Llink=q;
        p.Rlink=q.Rlink;
        q.Rlink=p;
        p.Rlink.Llink=p;
        }
    }
}
