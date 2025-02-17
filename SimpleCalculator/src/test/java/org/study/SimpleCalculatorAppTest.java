package org.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorAppTest {
    //Question 1
    @Test
    void addingOne(){
        SimpleCalculatorApp calculate = new SimpleCalculatorApp();
        assertEquals(4,calculate.add(2,2));
        assertEquals(-2,calculate.add(-1,-1));

    }

//Question2
    @Test
    void addingNumbersInList(){
        SimpleCalculatorApp addNum = new SimpleCalculatorApp();
        assertNotNull(addNum);
        assertEquals(15, addNum.addNumberList(0));
    }


//Question 3
    @Test
    void multiplyingOne(){
        SimpleCalculatorApp Calc = new SimpleCalculatorApp();
        assertNotNull(Calc,"Class is not null");
        assertEquals(3, Calc.multiplyOne(1,3));
        assertEquals(-3, Calc.multiplyOne(1,-3));
    }
// Question 4
    @Test
    void multiplying(){
        SimpleCalculatorApp calc = new SimpleCalculatorApp();
        assertEquals(120,calc.multiply(1));
    }
}