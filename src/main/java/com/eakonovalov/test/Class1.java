package com.eakonovalov.test;

/**
 * Created by Administrator on 10.03.2017.
 */
public class Class1 extends Class2 {

    private int i;
    protected int j;
    int k;
    public int l;

    private int deadcodePrivateClassField;
    protected int j1;
    int k1;
    public int l1;

    public NonPublicClass npc = new NonPublicClass();

    private static final String DEADCODE = "";

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static int compare(int comparev1, int comparev2, int deadcodeMethodParameter, Class1 deadcodeClassParameter) {
        return comparev1 < comparev2 ? -1 : (comparev1 > comparev2 ? 1 : 0);
    }

    public void testZipRace() {
        int value = 11;
        int deadcodeVariableWithAssignment = 12;
        assert(11 == value);
        int deadcodeVariable;
        privateMethod1();
    }

    private void privateMethod1() {
        int i = 0;
        System.out.println(i);
    }

    private void privateMethod2() {
        int i = 0;
        System.out.println(i);
    }

    public int var23 = privateMethod3();

    private int privateMethod3() {
        int i = 0;
        System.out.println(i);
        new Inner();

        return 0;
    }

    private int deadcodeMethod() {
        int i = 0;
        System.out.println(i);
        new Inner();

        return 0;
    }

    public void someMethod2(String someMethod2v1, String deadcodeParameter) {
        System.out.println(someMethod2v1);
    }

    public class Inner {

        public InnerInner innerInner = new InnerInner();

        private void deadcodePublicInnerClassMethod() {
            privateMethod1();
            privateMethod2();
        }

        private void privateMethod() {

        }

        public void test() {
            privateMethod();
        }

        private class InnerInner {

            private void deadCodeInnerInner() {
                privateMethod();
            }

        }

    }

    public class Inner2 extends Exception {

        public void test() {
            privateMethod2();
        }

    }

    private class DeadcodePrivateInnerClass {

        private void deadcodePrivateInnerClassMethod() {
            privateMethod1();
        }

        public void test() {
            privateMethod2();
        }

    }

    private class DeadcodePrivateInnerClassExtends extends Exception {

        private int deadcodePrivateInnerClassField;
        public NonPublicClass npc = new NonPublicClass();

        private void deadcodePrivateInnerClassExtendsMethod() {
            privateMethod1();
        }

        public void method4() {
            privateMethod1();
            NonPublicClass c = new NonPublicClass();
        }

    }
}

class DeadcodeNonPublicClass {

    public void method5() {
        System.out.println("");
        Class1.Inner i = new Class1().new Inner();
    }

}
class NonPublicClass {

    public void method5() {
        System.out.println("");
        Class1.Inner i = new Class1().new Inner();
    }

}
