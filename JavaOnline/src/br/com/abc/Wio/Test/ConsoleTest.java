package br.com.abc.Wio.Test;

import java.io.Console;

public class ConsoleTest {
    public static void main (String[] args){
        Console c = System.console();
        char[] pw = c.readPassword("%s","pw:");
        for (char pass : pw) {
            c.format("%c", pass);
        }
        c.format("\n");
        String texto;
        while (true){
            texto = c.readLine("%s", "Digite: ");
            c.format("Esse texto %s foi digitado", retorno(texto));
        }
    }
    public static String retorno(String args){
        return args;
    }
}