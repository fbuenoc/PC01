package bueno.pc01.utils;

import bueno.pc01.data_access.entities.Alumno;

public class Parser {
    public static bueno.pc01.data_access.entities.Alumno ToAlumnoEntities(bueno.pc01.entities.Alumno alumno){
        bueno.pc01.data_access.entities.Alumno value = new Alumno();
        value.setChrAluCodigo(alumno.getId());        
        value.setVchAluApellidos(alumno.getLastName());
        value.setVchAluNombres(alumno.getName());
        value.setChrAluSexo(alumno.getGender());
        value.setDtmAluFechaNac(alumno.getBirth());
        return value;
    }
    
    public static bueno.pc01.entities.Alumno ToAlumno(bueno.pc01.data_access.entities.Alumno alumno){
    bueno.pc01.entities.Alumno value = new bueno.pc01.entities.Alumno();
        value.setId(alumno.getChrAluCodigo());        
        value.setLastName(alumno.getVchAluApellidos());
        value.setName(alumno.getVchAluNombres());
        value.setGender(alumno.getChrAluSexo());
        value.setBirth(alumno.getDtmAluFechaNac());
        return value;
    
    }
}
