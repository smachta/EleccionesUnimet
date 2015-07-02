package eleccionesunimet;
import java.io.*; 


public class ArchivoObjetos implements Serializable{

 public void Escribir(Vectores ve) throws Exception{
 FileOutputStream fos=new FileOutputStream("archivo.DAT");
 ObjectOutputStream output=new ObjectOutputStream(fos);
 output.writeObject(ve);

 output.close();
 }   


 
 
public Vectores leer()throws Exception{
FileInputStream fos = new FileInputStream("archivo.DAT");
ObjectInputStream input = new ObjectInputStream(fos);
Vectores ve=(Vectores)input.readObject(); 
input.close();
return ve;
}





}  
    
    

