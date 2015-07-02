
package eleccionesunimet;
import java.io.*;

public class Vectores implements Serializable {
    private int[]indexCedula = new int[6000];
    private int[]indexNombre = new int[6000];
    private int[]indexApellido = new int[6000];
    private Estudiantes[] vecEstudiantes = new Estudiantes[6000];
    private int cont=0; 
    public  Vectores(){
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public Estudiantes[] getVecEstudiantes() {
        return vecEstudiantes;
    }

    public void setVecEstudiantes(Estudiantes[] vecEstudiantes) {
        this.vecEstudiantes = vecEstudiantes;
    }
    
    public int[] getIndexCedula() {
        return indexCedula;
    }

    public void setIndexCedula(int[] indexCedula) {
        this.indexCedula = indexCedula;
    }

    public int[] getIndexNombre() {
        return indexNombre;
    }

    public void setIndexNombre(int[] indexNombre) {
        this.indexNombre = indexNombre;
    }

    public int[] getIndexApellido() {
        return indexApellido;
    }

    public void setIndexApellido(int[] indexApellido) {
        this.indexApellido = indexApellido;
    }
    
 
    
    
    
    
}
