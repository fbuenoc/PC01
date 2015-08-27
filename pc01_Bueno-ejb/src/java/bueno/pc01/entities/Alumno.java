package bueno.pc01.entities;

import java.util.Date;

public class Alumno {
    private String Id;
    private String Name;
    private String LastName;
    private Date Birth;
    private Character Gender;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public Date getBirth() {
        return Birth;
    }

    public void setBirth(Date Birth) {
        this.Birth = Birth;
    }

    public Character getGender() {
        return Gender;
    }

    public void setGender(Character Gender) {
        this.Gender = Gender;
    }
}
