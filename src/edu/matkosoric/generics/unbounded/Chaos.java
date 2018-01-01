package edu.matkosoric.generics.unbounded;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam
 * Java 8 SE, 2017.
 * Created by © Matko Soric.
 */

import java.util.ArrayList;
import java.util.List;

public class Chaos {

    // unbounded List does not accept any type of objects

    public static void main(String[] args) {

        List<?> emptyList = new ArrayList<>();
//        emptyList.add(new Object());                  // does not compile
//        emptyList.add(new String("string"));          // does not compile
//        emptyList.add(new Double(3.0));               // does not compile

    }
}
