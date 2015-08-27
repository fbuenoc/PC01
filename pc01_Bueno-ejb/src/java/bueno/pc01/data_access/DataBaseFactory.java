package bueno.pc01.data_access;

import bueno.pc01.data_access.object.interfaces.IAlumno;
import bueno.pc01.data_access.object.jpa.AlumnoService;

public class DataBaseFactory {
    
    private DataBaseFactory() {
    }
    
    public static DataBaseFactory getInstance() {
        return DaoFactoryHolder.INSTANCE;
    }
    
    private static class DaoFactoryHolder {

        private static final DataBaseFactory INSTANCE = new DataBaseFactory();
    }
    
    public IAlumno getAlumnoDAO(int tipo){
        
        IAlumno servicio = null;
        switch(tipo){
            case 1: servicio = new AlumnoService();break;
            
        }
        return servicio;
    }
}
