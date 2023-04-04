package cz.gyarab.prg3.s2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MojeJmeno {


    public static  void info(Object o) throws InvocationTargetException, IllegalAccessException {
        Class cl = o.getClass();
        System.out.println("Jmeno tridy:" + cl.getName());

        int i = 0;
        for(Method m: cl.getMethods()) {
            if (m.getParameters().length == 0) {
                i++;
                System.out.println("metoda:" + m.getName());
                System.out.println(" vraci " + m.invoke(o));
            }
        }

        System.out.println(i);



        System.out.println();

    }






    static class AAA {

    }











    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //Object m = new Object();
        //info(m);

        String s = "ahoj";
        info(s);

        AAA a = new AAA();
        info(a);
    }
}
