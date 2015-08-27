package bueno.pc01.data_access.object.interfaces;

import bueno.pc01.entities.Alumno;

public interface IAlumno {
    Boolean Create(Alumno value);
    Boolean Delete(String key);
    Alumno Find(Alumno value);
    Alumno Update(Alumno value);
}
