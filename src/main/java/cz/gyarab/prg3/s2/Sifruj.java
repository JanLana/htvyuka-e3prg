package cz.gyarab.prg3.s2;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public class Sifruj {
    public static void main(String[] args) throws IOException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException {
        String msg = "ahoj";

        byte[] vstup = Files.readAllBytes(Paths.get("mujVerejny.key"));
        KeyFactory kf = KeyFactory.getInstance("RSA");
        PublicKey publicKey = kf.generatePublic(new X509EncodedKeySpec(vstup));

        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.PUBLIC_KEY, publicKey);

        byte[] enc = cipher.doFinal(msg.getBytes());
        Files.write(Paths.get("zprava.dat"), enc);
    }
}
