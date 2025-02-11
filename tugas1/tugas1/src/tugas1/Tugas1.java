/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama:");
        String nama = input.nextLine();
        
        System.out.print("Masukkan nim:");
        int nim = input.nextInt();
        
        System.out.println("Hello world!" + nama + " " + nim);
        System.out.println("Saya senang belajar Java.");
        
        
        input.close();
        
        // TODO code application logic here
    }
    
}
