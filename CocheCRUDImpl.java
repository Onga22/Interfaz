
package s;

import inter.Coche;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Guardar");
    }

    
    @Override
    public void findall() {
         System.out.println("Encontrar");
       
    }

    
    @Override
    public void delete() {
        System.out.println("Borrar");
    }
    
}
