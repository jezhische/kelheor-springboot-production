package com.jezh.kelheorspringbootproduction.service;

import java.util.Set;

/**
 * Created by Ежище on 18.07.2017.
 */
public interface DataService {

    public boolean persist(String problem);

    public Set<String> getRandomData();
}
