/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleccionesunimet;
import java.util.Arrays; 
/**
 *
 * @author smachta1
 */
public class Estudiantes {

    private String cedula; //numero de cédula. 
    private String carrera1; // primera carrera que estudia
    private String carrera2; // segunda carrera que estudia
    private String pNombre; //  primer nombre del estudiante
    private String sNombre; //  segundo nombre del estudiante
    private String pApellido; // primer apellido del estudiante
    private String sApellido; // segundo apellido del estudiante  
    

    
    
    public Estudiantes(  ){
    
    }
    
    public Estudiantes(String cedula,String carrera1,String pNombre,String sNombre,String pApellido, String sApellido){
    
    this.cedula=cedula; 
        this.carrera1=carrera1; 
                this.pApellido=pApellido; 
                    this.sApellido=sApellido; 
                        this.pNombre=pNombre; 
                            this.sNombre=sNombre; 
                               
    }
    
    //============="GETTERS AND SETTERS"=========================================
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCarrera1() {
        return carrera1;
    }

    public void setCarrera1(String carrera1) {
        this.carrera1 = carrera1;
    }

    public String getCarrera2() {
        return carrera2;
    }

    public void setCarrera2(String carrera2) {
        this.carrera2 = carrera2;
    }

    public String getpNombre() {
        return pNombre;
    }

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }
   // ==========================================================================
    
    
    
    
    
    
    
    
    
}
