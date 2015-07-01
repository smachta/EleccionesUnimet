package eleccionesunimet;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ArchivoObjetos 
{

    public void CrearArchivo(Estudiantes[] lista) throws Exception
    {
        FileOutputStream file = null;
        file = new FileOutputStream ("ListaEstudiantes.DAT");
            ObjectOutputStream output = new ObjectOutputStream (file);
            output.writeObject(lista);
            output.close(); 
    }
    
    public Object ObtenerArchivo() throws Exception
    {
        FileInputStream file = null;
        Estudiantes[] lista=null;
        file = new FileInputStream ("ListaEstudiantes.DAT");
        ObjectInputStream input = new ObjectInputStream (file);
        lista = (Estudiantes[]) input.readObject();
        input.close();
        return lista;
    }
    
    
}
