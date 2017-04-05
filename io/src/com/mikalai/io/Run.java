package com.mikalai.io;

import java.io.*;

/**
 * Created by Mikalai_Churakou on 4/5/2017.
 */
public class Run {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Zebra z1 = new Zebra();
        try(OutputStream os = new FileOutputStream("out.bi");
        BufferedOutputStream bos = new BufferedOutputStream(os);
        ObjectOutputStream oos = new ObjectOutputStream(bos)){
            oos.writeObject(z1);

        }

        Zebra z2 = null;
        try(InputStream is = new FileInputStream("out.bi");
            BufferedInputStream bis = new BufferedInputStream(is);
            ObjectInputStream ois = new ObjectInputStream(bis)){
            z2 = (Zebra) ois.readObject();

        }

        System.out.println(z1);
        System.out.println(z2);
    }
}
