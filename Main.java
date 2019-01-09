package com.company;

public class Main {

    public static void main(String[] args) {
        //389871
        int camsize = 512;
        int[][][] camSet = new int[camsize][camsize][camsize]; //big ass block!
        long startTime = System.nanoTime();
        int loopcounter = 0;
        for (int i = 0; i < camsize; i++)
        {
            long loopstart = System.nanoTime();
            for (int j = 0; j < camsize; j++)
            {
                for (int k = 0; k < 1; k++)
                {
                    camSet[i][j][k] = i * j * k;
                    if (camSet[i][j][k] % 33 == 0)
                    {
                        camSet[i][j][k] = 1;
                    }
                }
            }
            long loopend = System.nanoTime();
            System.out.println("Epoch " + loopcounter + " completed. Avergage loop time: " + ((loopend - loopstart)/1000000) + " milliseoconds.");
            loopcounter++;
        }

        long endTime = System.nanoTime();
        long elapsed = endTime - startTime;
        System.out.println("Entire iteration took: " +(elapsed / 1000000.0) + " milliseconds.");

        long tdstart = System.nanoTime();
        int arsize = 11585;
        int[][] myarray = new int[arsize][arsize];
        for(int i = 0; i < arsize; i++)
        {
            for(int j = 0; j < arsize; j++)
            {
                myarray[i][j] = i * j * j;;
                if(myarray[i][j] % 33 == 0)
                {
                    myarray[i][j] = 1;
                }
            }
        }

        long tdend = System.nanoTime();
        long total = tdend - tdstart;
        System.out.println("Equivalent 2d array time: "  + total / 1000000.0 + " milliseconds");
    }
}
