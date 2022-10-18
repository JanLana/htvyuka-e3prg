package cz.gyarab.prg3.s2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Base64;

public class Podpisovac {
    public static void main(String[] args) throws NoSuchAlgorithmException, SignatureException, InvalidKeySpecException, InvalidKeyException, IOException {
        String msg = "Pepa z Depa dluzi Janu Lanovi 1milion Kc.";

        byte[] priv = Files.readAllBytes(Paths.get("mujTajny.key"));
        KeyFactory kf = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = kf.generatePrivate(new PKCS8EncodedKeySpec(priv));

        Signature signGenerator = Signature.getInstance("SHA1withRSA");
        signGenerator.initSign(privateKey);
        signGenerator.update(msg.getBytes());

        byte[] sign = signGenerator.sign();

        System.out.println(msg);
        System.out.println("====");
        System.out.println(Arrays.toString(sign));
        System.out.println(Base64.getEncoder().encodeToString(sign));
    }
}
