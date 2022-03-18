package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    int[] num = {4,5,6,7,8,9,10,11,12};
    int[] array = {};

    @Test
    void lookforSingle()
    {
        int expected = 4;
        int actual = Main.Sort(num, 8);
        assertEquals( expected, actual);
    }
    @Test
    void lookFor4(){
        int expected = 0;
        int actual = Main.Sort(num,4);
        assertEquals( expected, actual);
    }
    @Test
    void lookFor5(){
        int expected = 1;
        int actual = Main.Sort(num, 5);
        assertEquals( expected, actual);
    }
    @Test
    void lookFor7(){
        int expected = 3;
        int actual = Main.Sort(num,7);
        assertEquals(expected, actual);
    }
    @Test
    void lookFor9(){
        int expected = 5;
        int actual = Main.Sort(num,9);
        assertEquals( expected, actual);
    }
    @Test
    void lookFor8(){
        int expected = 4;
        int actual = Main.Sort(num,8);
        assertEquals(expected,actual);
    }
    @Test
    void lookFor10(){
        int expected = 6;
        int actual = Main.Sort(num,10);
        assertEquals(expected, actual);
    }
    @Test
    void lookFor11(){
        int expected = 7;
        int actual = Main.Sort(num,11);
        assertEquals(expected, actual);
    }
    @Test
    void lookFor12(){
        int expected = 8;
        int actual = Main.Sort(num,12);
        assertEquals(expected, actual);
    }

    @Test
    void lookForNull(){
        int expected = -1;
        int actual = Main.Sort(array, 7);
        assertEquals(expected, actual);
    }


}