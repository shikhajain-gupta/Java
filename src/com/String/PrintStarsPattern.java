package com.String;

public class PrintStarsPattern {
    public static void main(String[] args) {


        for(int i=0;i<5;i++)
        {
            int l=i;
            while(l>0)
            {
                System.out.print(" ");
                l--;
            }
            for(int j=0;j<5-i;j++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }

}
