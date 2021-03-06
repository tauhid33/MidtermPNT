package string.problems;

import org.junit.Assert;
import org.junit.Test;


import java.util.*;

public class UnitTestingStringProblem {

    //Apply Unit Test into all the methods in this package.
    @Test
    public void testanagram() {
        boolean actualResult = Anagram.isAnagram("cat", "tac");
        Assert.assertNotEquals( false, actualResult);
        System.out.println("test passed");
    }




    // Test Palindrome
    @Test
    public void testPermutation() {
        Set<String> expectedResult = new HashSet<>(Arrays.asList("bob", "obb", "bbo"));
        Set<String> actualResult = Permutation.getPermutation("bob");
        Assert.assertEquals("Test Fail", expectedResult, actualResult);
    }


}

