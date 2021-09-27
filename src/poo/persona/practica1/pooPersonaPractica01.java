/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.persona.practica1;
import  entidades.persona;
import implementacion.PersonaDatos;
import  java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 *
 * @author romel
 */
public class pooPersonaPractica01 {
   
   public static PersonaDatos pd = new PersonaDatos();
    public static void creaUsuario(){
        
        persona p1 = new  persona();
        p1.setId(1);
        p1.setNombre("Romel");
        p1.setAp_paterno("Gutierrez");
        p1.setAp_materno("Oscata");
        p1.setDireccion("Posta billavista");
        p1.setSexo("M");
        
        persona p2 = new  persona();
        p2.setId(2);
        p2.setNombre("Sarita");
        p2.setAp_paterno("Quispe");
        p2.setAp_materno("Condori");
        p2.setDireccion("Av. Ejército");
        p2.setSexo("F");
        
        persona p3 = new  persona();
        p3.setId(3);
        p3.setNombre("Octavio");
        p3.setAp_paterno("Maquera");
        p3.setAp_materno("Cruz");
        p3.setDireccion("Jr. Sol");
        p3.setSexo("M");
        
        pd.create(p1);
        pd.create(p2);
        pd.create(p3);
    }
    public static void listarRegistros() {
        //PersonaDatos pd = new PersonaDatos();
        System.out.println("\nLISTA DE TODOS LOS REGISTROS\n");
          for (persona ps: pd.listaPersonas()){
              System.out.println(ps.getId()+ " "+
                      ps.getNombre()+ " "+
                      ps.getAp_paterno()+ " "+ 
                      ps.getAp_materno()+ " DIRECCION: "+ 
                      ps.getDireccion()+ " SEXO: "+ ps.getSexo());
          }
    }
    public static void eliminarRegistros(){
       // PersonaDatos pd = new PersonaDatos();
       int idEliminar = Integer.parseInt(JOptionPane.showInputDialog("Igrese el ID a Eliminar"));
         pd.eliminaraPersonas(idEliminar);
    }
    public static void actualizarRegistro(){
        //PersonaDatos pd = new PersonaDatos();
        int idActulizar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID a Actualizar"));
        Scanner teclado = new Scanner(System.in); 
        
        System.out.println("Actualizando.... ");
         //String anombre = teclado.nextLine();
         persona pa = new persona();
          pa.setNombre(teclado.nextLine());
          pa.setAp_paterno(teclado.nextLine());
          pa.setAp_materno(teclado.nextLine());
          pa.setDireccion(teclado.nextLine());
          pa.setSexo(teclado.nextLine());
          
          pd.actualizarPerosna(idActulizar, pa);
          // mostras los actualizados
          for (persona ps: pd.listaPersonas()){
              System.out.println(ps.getId()+ " "+
                      ps.getNombre()+ " "+
                      ps.getAp_paterno()+ " "+ 
                      ps.getAp_materno());
          }
    }
  
    public static void main(String[] args) {
        PersonaDatos pd = new PersonaDatos();
        int opcion;
        boolean salir = false;
        while(!salir){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("INGRESE:\n 1 Registrar \n"
                    + " 2 Listar Registro \n 3 Eliminar Registro\n 4 Actualizar \n 5 Salir "));
            
            switch (opcion) {
                case 1:
                    creaUsuario();
                break;
                case 2:
                    listarRegistros();
                break;
                case 3:
                    eliminarRegistros();
                break;
                case 4:
                    actualizarRegistro();
                break;
                case 5:
                    salir = true;
                break;
                default: System.out.println("EL indice no existe");
            }
        }   
    }
}
