package eleccionesunimet;
import java.io.*; 


public class ArchivoObjetos implements Serializable{

 public void Escribir(Estudiantes[] est) throws Exception{
 FileOutputStream fos=new FileOutputStream("archivo.DAT");
 ObjectOutputStream output=new ObjectOutputStream(fos);
 output.writeObject(est);
 //output.writeObject(nom);
 //output.writeObject(ap);
 //output.writeObject(nomAp);
 output.close();
 }   

 public void Escribir2(int[] ced) throws Exception{
 FileOutputStream fas=new FileOutputStream("archivo.DAT");
 ObjectOutputStream output2=new ObjectOutputStream(fas);
 output2.writeObject(ced);
 //output.writeObject(nom);
 //output.writeObject(ap);
 //output.writeObject(nomAp);
 output2.close();
 }   
 
 
 
public Estudiantes[] leerEstudiantes()throws Exception{
FileInputStream fos = new FileInputStream("archivo.DAT");
ObjectInputStream input = new ObjectInputStream(fos);
Estudiantes est[]=(Estudiantes[])input.readObject(); 
input.close();
return est;
}

public int[] leerCedula()throws Exception{
FileInputStream fas = new FileInputStream("archivo.DAT");
ObjectInputStream input = new ObjectInputStream(fas);
int ced[]=(int[])input.readObject(); 
input.close();
return ced;

}   



}  
    
    

