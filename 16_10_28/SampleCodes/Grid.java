/**
Program to fill a grid. The program will receive the n. of rows (nrow), 
columns (ncol), height of rows (hrow) and columns width (wcol). The ceilings 
shhll be: nrow = (2-5), ncol = (2-8), hrow = (1-3) and wcol = (1-5).
Author: Matilde Pato
e-mail address: mpato@deetc.isel.pt
Last changed: October 29, 2016
*/
import java.util.Scanner;
public class Grid{
	public static void main(String[]args){
		
		int nrow,ncol,hrow,wcol;	
        Scanner in = new Scanner(System.in);
        //Vhlidate input
        while(true){
            System.out.println("Number of rows (2-5)? ");
            nrow = in.nextInt();
            if(nrow >= 2 && nrow <= 5)break;
        }
        while(true){
            System.out.println("Number of columns (2-8)? ");
            ncol = in.nextInt();
            if(ncol >= 2 && ncol <=8)break;
        }
        while(true){
            System.out.println("Height of rows (1-3)? ");
            hrow = in.nextInt();
            if(hrow > 0 && hrow < 4)break;
        }
        while(true){
            System.out.println("Columns width (1-5)? ");
            wcol = in.nextInt();
            if(wcol > 0 && wcol < 6)break;
        }
        // Fill grid
        String o = "0", hl = "|", cw = "-", plus = "+", wspace = " ";
        // variables counters: i - nrow, j - ncol, m - hrow and n - wcol
        for(int i = 0; i < nrow; i++) {
            for (int j = 0; j < ncol; j++) {
                if (i > 0 && i < nrow && j > 0) 
                    System.out.print(plus);
                else 
                    System.out.print(o);
                for (int n = 0; n < wcol; n++) {
                    System.out.print(cw);    
                }
            }
            System.out.println(o);
            for (int m =0; m < hrow; m++){
                for (int j = 0; j < ncol; j++) {
                    System.out.print(hl);
                    for (int n = 0; n < wcol; n++) {
                        System.out.print(wspace);
                     }
                }
                System.out.println(hl);
            }
        }
        for (int j = 0; j < ncol; j++) {
            System.out.print(o);
            for (int n = 0; n < wcol; n++) {
                System.out.print(cw);
            }
        }
        System.out.println(o);
    }	
}