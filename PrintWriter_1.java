/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrinteWriter_1;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Paolo
 */
public class PrintWriter_1 {
    
    private PrintWriter pw;
    
    public PrintWriter_1(OutputStream out) throws IOException{
        pw = new PrintWriter(out);
    }
    
    public PrintWriter_1(File f) throws IOException{
        pw = new PrintWriter(new FileWriter(f));
    }

    public PrintWriter_1(String nome) throws IOException{
        pw = new PrintWriter(new FileWriter(nome));
    }
  

    public PrintWriter_1(File f, boolean a) throws IOException{
        pw = new PrintWriter(new FileWriter(f,a));
    }

    public PrintWriter_1(String nome, boolean a) throws IOException{
        pw = new PrintWriter(new FileWriter(nome,a));
    }

    public void print(String testo) throws IOException {
        pw.print(testo);
    }

    public void println(String testo) throws IOException {
        pw.println(testo);
    }    

    public void println(Object o) throws IOException {
        pw.println(o);
    } 
    
    public void append(String testo) throws IOException {
        pw.append(testo);
    } 
    
    public void svoltaStream() throws IOException{
        pw.flush();
    }
    
    public void closeFile() throws IOException{
        pw.close();
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter_1 pw;

        System.out.println("Scrivi il nome del file: ");
        pw = new PrintWriter_1(sc.next());
        pw.println("ciao mondo");
        pw.svoltaStream();
        pw.closeFile();        
        System.out.println("Scrivi il nome del file: ");
        pw = new PrintWriter_1(new File(sc.next()),true);
        pw.print("ciao mondo");
        pw.svoltaStream();
        pw.closeFile();
        System.out.println("Scrivi il nome del file: ");
        pw = new PrintWriter_1(new File(sc.next()),true);
        pw.append("ciao mondo");
        pw.svoltaStream();
        pw.closeFile();   
        System.out.println("Scrivi l'oggetto: ");
        pw = new PrintWriter_1(new File(sc.next()),true);
        pw.println(pw);
        pw.svoltaStream();
        pw.closeFile();            
    }  
}
