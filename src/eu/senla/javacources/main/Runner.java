package eu.senla.javacources.main;

import eu.senla.javacources.counstructor.MainInitializer;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {

        MainInitializer initializer = new MainInitializer();
        initializer.init();
    }
}
