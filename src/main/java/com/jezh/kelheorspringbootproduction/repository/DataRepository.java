package com.jezh.kelheorspringbootproduction.repository;

import com.jezh.kelheorspringbootproduction.entity.DomainObject;

import java.util.Set;

/**
 * Created by WORK_x64 on 17.07.2017.
 */
public interface DataRepository<V extends DomainObject> {

    void persist(V object);

    void delete(V object);

    Set<String> getRandomData();
}
