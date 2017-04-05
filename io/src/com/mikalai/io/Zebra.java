package com.mikalai.io;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mikalai_Churakou on 4/5/2017.
 */
public class Zebra implements Serializable {
    private static final long serialUID = 1L;
    private transient String name = "Georgia";
    private static String birthPlace = "Africa";
    private transient Integer age;
    private List<Zebra> friends = new ArrayList<>();
    private Object tail = null;

    @Override
    public String toString() {
        return "Zebra{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friends=" + friends +
                ", tail=" + tail +
                '}';
    }

    {
        age = 10;
    }

    public Zebra(){
        this.name = "Sophia";
    }

}
