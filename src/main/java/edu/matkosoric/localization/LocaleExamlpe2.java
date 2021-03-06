package edu.matkosoric.localization;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2018.
 * Created by © Matko Soric.
 */

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleExamlpe2 {

    // formatting numbers with NumberFormat class depending on the Locale

    public static void main(String[] args) {

        long milkyWayRadius = 40_000;
        double milkyWayCircumference = milkyWayRadius * 2 * Math.PI;

        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(milkyWayCircumference));

        NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(fr.format(milkyWayCircumference));

        NumberFormat ge = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(ge.format(milkyWayCircumference));

        NumberFormat ca = NumberFormat.getInstance(Locale.CANADA);
        System.out.println(ca.format(milkyWayCircumference));

        NumberFormat caF = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(caF.format(milkyWayCircumference));

    }
}
