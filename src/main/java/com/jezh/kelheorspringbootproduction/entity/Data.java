package com.jezh.kelheorspringbootproduction.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

/**
 * Created by WORK_x64 on 17.07.2017.
 */
//@Table(name = "kelh_data")
//@Entity
public class Data implements DomainObject {

    private UUID id;
    private String description;

    public Data(UUID id, String description) {
        this.id = id;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
