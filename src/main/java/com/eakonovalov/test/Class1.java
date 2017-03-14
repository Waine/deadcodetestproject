package com.eakonovalov.test;

/**
 * Created by Administrator on 10.03.2017.
 */
public class Class1 {

    private int i;
    protected int j;
    int k;
    public int l;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static int compare(int v1, int v2, int v3) {
        return v1 < v2 ? -1 : (v1 > v2 ? 1 : 0);
    }

    public void testZipRace() {
        int value = 11;
        int value2 = 12;
        assert(11 == value);
    }

}
