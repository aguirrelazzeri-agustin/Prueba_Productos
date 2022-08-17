
package prueba.producto.Interface;


import java.util.List;
import prueba.producto.Entity.Persona;


public interface IPersonaService {
    //Traer una lista persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objetivo pero lo buscamos por ID
    
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
