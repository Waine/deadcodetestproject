package com.eakonovalov.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Administrator on 17.03.2017.
 */
public class Class2 extends Class3 implements Serializable {

    private static final long serialVersionUID = 4561022245245616221L;

    public void testAnon() {

        Collections.sort(new ArrayList<String>(), new Comparator<String>() {

            public int compare(String o1, String o2) {
                return 0;
            }

        });

    }

    @Override
    public String toString() {
        return decode("");
    }

    public static String doWorkOnNewTrampoline(final String val) {
        Collections.sort(new ArrayList<String>(), new Comparator<String>() {

            public int compare(String o1, String o2) {
                return val.length();
            }

        });

        return "";
    }

    @Override
    public String decode(String n) {
        decode();
        return "";
    }

    private static String deadcodeStaticMethod() {
        return "";
    }

    private static String decode() {
        return "";
    }

}
