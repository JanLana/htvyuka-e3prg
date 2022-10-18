package cz.gyarab.prg3.s2;

import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Podpisovac {
    public static void main(String[] args) throws NoSuchAlgorithmException, SignatureException {
        String msg = "Pepa z Depa dluzi Janu Lanovi 1milion Kc.";

       // Signature signGenerator = Signature.getInstance("SHA1withRSA");
       // signGenerator.initSign(privateKey);
       // signGenerator.update(msg.getBytes());

       // byte[] sign = signGenerator.sign();

       // System.out.println(msg);
       // Arrays.toString(sign);
    }
}
