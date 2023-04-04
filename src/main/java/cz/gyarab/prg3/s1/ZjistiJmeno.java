package cz.gyarab.prg3.s1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ZjistiJmeno {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InterruptedException, InstantiationException {
        ArrayList mojeP = new ArrayList();

        //Class<?> cl = mojeP.getClass();
        Class cl = mojeP.getClass();

        System.out.println("trida:" + cl.getSimpleName());
        System.out.println("balicek:" + cl.getPackageName());
        System.out.println("pocet kontrukytoru:" + cl.getConstructors().length);
        System.out.println();

        for(Constructor<?> m: cl.getConstructors()) {
            if (m.getParameterCount() == 0) {
                Object o = m.newInstance();
                System.out.println("novy object o:" + o);
                //System.out.println(m.getName());
                //System.out.println(" vraci: " + m.invoke(mojeP));
            }
        }

    }
}
