package org.launchcode.java.studios.balancedbrackets.test;

import junit.framework.Assert;
import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
import org.launchcode.java.studios.balancedbrackets.main.BalancedBrackets;


public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertTrue(true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        Assert.assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void rightBracketFirstReturnsFalse() {
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void leftBracketLastReturnsFalse() {
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void nestedBracketsReturnsTrue() {
        Assert.assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void invertedSetOfBracketsReturnsFalse() {
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void invertedBracketsWithInNestedReturnsFalse() {
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets("[]][[]"));
    }


}
