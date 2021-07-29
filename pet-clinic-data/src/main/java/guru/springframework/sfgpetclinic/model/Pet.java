package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {

    private PetType getType;
    private Owner owner;
    private LocalDate birthday;

    public PetType getGetType() {
        return getType;
    }

    public void setGetType(PetType getType) {
        this.getType = getType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
