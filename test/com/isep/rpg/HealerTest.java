package com.isep.rpg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealerTest {
    @Test
    public void testName(){
        SpellCaster yuumi = new Healer(100,100,10,5);
        assertEquals(100, yuumi.lP);
    }
}