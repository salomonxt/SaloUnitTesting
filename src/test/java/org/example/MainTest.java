package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

        @Test
        void isEven_shouldReturnTrue_whenCalledWith2(){
            //given Werte die wir kennen
            int number = 2;
            boolean expected = true;

            //WHEN - Aufruf der Methode
            boolean actual = Main.iseven(number);
            //THEN - Vergleich von Erwartung der Realität
            assertEquals(expected, actual);
        }
}