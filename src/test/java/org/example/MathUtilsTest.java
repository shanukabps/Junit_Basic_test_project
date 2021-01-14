package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

class MathUtilsTest {

    MathUtils mathutills;

    @BeforeEach
    void init(){
        mathutills=new MathUtils();
    }

    @AfterEach
    void cleanup(){
        System.out.println("Cleanup");
    }

    @Nested
    @DisplayName("AddTestEmthod by class")
    class TestAddMethod{

        @Test
        void testAddPositive(){
            int expected =3;
            int actual =mathutills.add(1,2);
            Assertions.assertEquals(expected,actual,"Add the method sum equal two");
        }

        @Test
        void testAddNagative(){
            Assertions.assertEquals(-1,mathutills.add(1,-2),"Add the method sum equal two");
        }
    }

    @Test
    @DisplayName("multiply add method")
    void testMultiply(){
       Assertions.assertAll(
               ()->Assertions.assertEquals(5,mathutills.add(2,3)),
               ()->Assertions.assertEquals(-1,mathutills.add(2,-3)),
               ()->Assertions.assertEquals(-3,mathutills.add(-1,-2)),
               ()->Assertions.assertEquals(100,mathutills.add(100,0))
       );
    }

    @Test
    //@RepeatedTest(3) //test repat 3 times
    //@EnabledOnOs(OS.WINDOWS)
    void testComputerectangleArea(){
        //Assumptions.assumeTrue(false);// can be EX:- use to server is down not execute (we con add boolean veriable)
        Assertions.assertEquals(16,mathutills.computeRectangleArea(4),"should return right value");
    }

    @Test
    @DisplayName("devied by zero test") //change the name of test
    @Disabled
    //@EnabledOnOs(OS.LINUX) run only linux
    void testDevide(){
        Assertions.assertThrows(ArithmeticException.class,()-> mathutills.devide(10,0));
    }
    @Test
    @Tag("Square") // we cam ran tag separatly configuration
    void testComputeSquareArea(){
        //Assumptions.assumeTrue(false);// can be EX:- use to server is down not execute (we con add boolean veriable)
        Assertions.assertEquals(16,mathutills.computeRectangleArea(4),"should return right value");
    }
}