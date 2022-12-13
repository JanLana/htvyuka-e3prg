package cz.gyarab.prg3.s2;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.io.IOException;
import java.net.URL;
import java.security.cert.Certificate;

public class CertifikatTestovadla {
    public static void main(String[] args) throws IOException {
        URL destinationURL = new URL("https://gyarab.ddns.net");
        HttpsURLConnection conn = (HttpsURLConnection) destinationURL.openConnection();
        conn.connect();
        Certificate[] certs = conn.getServerCertificates();

        for (Certificate c: certs) {
            System.out.println("===================================");
            System.out.println(c);
            System.out.println("===================================");
            System.out.println("===================================");
            System.out.println("===================================");


        }
    }
}
