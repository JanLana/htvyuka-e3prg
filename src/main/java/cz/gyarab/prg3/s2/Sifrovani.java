package cz.gyarab.prg3.s2;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.util.Arrays;

public class Sifrovani {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(512);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        System.out.println("publickey:" + publicKey);
        System.out.println("privatekey:" + privateKey);

        String msg = "babicka";
        byte[] msgAsBytes = msg.getBytes();

        System.out.println(msg);
        System.out.println(Arrays.toString(msgAsBytes));

        // sifrovani
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.PUBLIC_KEY, publicKey);

        byte[] enc = cipher.doFinal(msgAsBytes);
        System.out.println(Arrays.toString(enc));

        //desifrovani
        Cipher cipher2 = Cipher.getInstance("RSA");
        cipher2.init(Cipher.PRIVATE_KEY, privateKey);

        byte[] out = cipher2.doFinal(enc);
        System.out.println(Arrays.toString(out));






    }

}
