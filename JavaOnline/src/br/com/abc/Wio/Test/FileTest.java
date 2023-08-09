package br.com.abc.Wio.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args){
        File file = new File("C:\\Arquivos\\IntelliJIDEA\\Arquivo.txt");
        try {
            boolean newFile = file.createNewFile();
            boolean exists = file.exists();
            System.out.println("Permissão de Leitura" + file.canRead());
            System.out.println("Path " + file.getPath());
            System.out.println("Diretorio?" +file.isDirectory());
            System.out.println("path :" + file.getAbsolutePath());
            System.out.println("Ultima vez modificado? " + new Date(file.lastModified()));
            if (exists){
                System.out.println("Deletado?");
                //System.out.println(file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
