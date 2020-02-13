package com.sebastian.varios;

import java.io.IOException;
import java.util.function.Predicate;

/**
 *
 * @author Sebastián Ávila A.
 */
public class Suppressed implements AutoCloseable {

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        try (Suppressed sup = new Suppressed()) {
            Predicate<Integer> p = (Integer r) -> true;
            throw new RuntimeException("error");
        } catch (Exception e) {
            System.out.println("atrapada: " + e.getClass());
            for (var ee : e.getSuppressed()) {
                System.out.println("silenciada; " + ee.getClass());
            }
        }
    }
}
