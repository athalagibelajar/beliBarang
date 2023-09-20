
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SMK TELKOM 25
 */
public class tugasbuAul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String buku;
        String pensil;
        int hargabarang = 0;
        int total = 0;
        int berapa = 0;
        int uang = 0;
        
         System.out.print("Masukkan jumlah item yang dibeli: ");
         int jumlah = input.nextInt();
         
         for(int i = 1;i<= jumlah; i++){
             System.out.println("Nama Barang:");
             String barang = input.next();
             System.out.println("Harga: ");
             hargabarang = input.nextInt();
             System.out.println("Jumlah Barang: ");
             berapa = input.nextInt();
             System.out.println("===============");  
             total += hargabarang*berapa;
             i++;
             
             }
         System.out.println("Jumlah item yang dibeli: "+ jumlah);
         System.out.println("Total Pembelian: "+total);
         }
         
         
    }

