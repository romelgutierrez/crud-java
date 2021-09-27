/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;


import java.util.ArrayList;

import entidades.persona;

/**
 *
 * @author romel
 */
public class PersonaDatos {
     String saludo;
     ArrayList<persona> lista = new ArrayList();
     
     public void create(persona p){
     lista.add(p);
        System.out.println("SE REGISTRO A: " + 
                p.getNombre()+", "+ p.getAp_paterno()+" "+ p.getAp_materno());
     }
     public ArrayList<persona> listaPersonas(){
         return lista;
         
     }
     public void  eliminaraPersonas(int id){
         
      for (persona s : lista){
         
          if(id==s.getId()){
            System.out.println("\nSE A ELIMINADO DE REGISTRO A: "+ s.getNombre()+" "+ s.getAp_paterno()+" " + s.getAp_materno()+ "\n");
            lista.remove(s);
          }
      }
     }
     public void actualizarPerosna(int id,persona p){
         
          System.out.println("actulizar a: "+ p.getNombre());
         
         
          for (persona s : lista){
         
          if(id==s.getId()){
              
            s.setNombre(p.getNombre());
            s.setAp_paterno(p.getAp_paterno());
            s.setAp_materno(p.getAp_materno());
            s.setDireccion(p.getDireccion());
            s.setSexo(p.getSexo());
          }
      }        
    }
}
