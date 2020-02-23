/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author conta
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        File f = new File();
        String read = "C:\\Users\\conta\\OneDrive\\Desktop\\details.txt";
        String write = "C:\\Users\\conta\\OneDrive\\Desktop\\serial.txt";
        f.readFile(read, write);
    }

}
