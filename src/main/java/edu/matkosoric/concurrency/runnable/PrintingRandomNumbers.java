package edu.matkosoric.concurrency.runnable;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

public class PrintingRandomNumbers implements Runnable{

    // class that implements Runnable interface and can be used to create a thread

    String marker;

    PrintingRandomNumbers ( String marker) {
        this.marker = marker;
    }

    @Override
    public void run() {

        System.out.print(marker + " - ");

        for (int i = 0; i < 20; i++) {
            System.out.print((int)Math.floor(Math.random()*101) + " ");
        }
        System.out.println();
    }
}
