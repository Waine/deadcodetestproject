package com.eakonovalov.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Administrator on 17.03.2017.
 */
public class Class2 implements Serializable {

    private static final long serialVersionUID = 4561022245245616221L;

    public void testAnon() {

        Collections.sort(new ArrayList<String>(), new Comparator<String>() {

            public int compare(String o1, String o2) {
                return 0;
            }

        });

    }

}
