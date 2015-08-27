
package bueno.pc01.data_access.object.jpa;

import bueno.pc01.contants.DataBaseContants;
import bueno.pc01.data_access.object.interfaces.IAlumno;
import bueno.pc01.utils.Parser;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AlumnoService implements IAlumno{
    private final EntityManagerFactory factory;
    private EntityManager entityManager;
    
    public AlumnoService(){
        factory = Persistence.createEntityManagerFactory(DataBaseContants.DataBasePersistenseName);        
        entityManager = factory.createEntityManager();
    }

    @Override
    public Boolean Create(bueno.pc01.entities.Alumno value) {
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(Parser.ToAlumnoEntities(value));
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        catch(Exception ex){
            return false;
        }    
    }

    @Override
    public Boolean Delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public bueno.pc01.entities.Alumno Find(bueno.pc01.entities.Alumno value) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("Alumno.findByChrAluCodigo");
        query.setParameter("chrAluCodigo", value.getId());
        bueno.pc01.data_access.entities.Alumno alumno = (bueno.pc01.data_access.entities.Alumno)query.getSingleResult();
        return Parser.ToAlumno(alumno);          
    }

    @Override
    public bueno.pc01.entities.Alumno Update(bueno.pc01.entities.Alumno value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
