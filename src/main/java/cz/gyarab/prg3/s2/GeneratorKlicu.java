package cz.gyarab.prg3.s2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.*;

public class GeneratorKlicu {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSAkeyPairGenerator");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        byte[] pub = publicKey.getEncoded();
        Files.write(Paths.get("mujVerejny.key"), pub);

        byte[] priv = publicKey.getEncoded();
        Files.write(Paths.get("mujTajny.key"), priv);
    }
}
