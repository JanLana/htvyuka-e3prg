import jdk.swing.interop.SwingInterOpUtils;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.util.Arrays;

public class Sifrovac {


    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        // generovani klice
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(512);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();


        String message = "Nazdar";

        System.out.println("zprava: " + Arrays.toString(message.getBytes()));
        System.out.println("Verejny klic: " + publicKey);

        // sifrovani zpravy
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.PUBLIC_KEY, publicKey);
        byte[] out = cipher.doFinal(message.getBytes());

        System.out.println("zasifrovane: " + Arrays.toString(out));

        // rozsifrovani zpravy
        Cipher cipher2 = Cipher.getInstance("RSA");
        cipher2.init(Cipher.PRIVATE_KEY, privateKey);
        byte[] vystup = cipher2.doFinal(out);

        System.out.println("Soukromy klic: " + privateKey);
        System.out.println("rozsifrovane: " + Arrays.toString(vystup));




    }
}
