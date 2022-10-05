package com.example;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
 
        Socket s = new Socket("127.0.0.1" , 3000);
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println(" ci sono strunzzzz");
        pr.flush();

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String str = br.readLine();
        System.out.println("server" + str);

        s.close();
    }
}
