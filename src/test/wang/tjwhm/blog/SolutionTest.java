package test.wang.tjwhm.blog;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import wang.tjwhm.blog.Solution;

/**
 * Solution Tester.
 *
 * @author tjwhm
 * @version 1.0
 * @since Mar 19, 2019
 */
@RunWith(Parameterized.class)
public class SolutionTest {
    private int x;
    private boolean expected;
    private Solution solution;

    public SolutionTest(int x, boolean expected) {
        this.x = x;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        return Arrays.asList(new Object[][]{
                {57, true},
                {26, true},
                {24, false},
                {83, true},
                {84, false},
                {0, false},
                {-2, false},
                {70, true},
                {7, true}
        });
    }

    @Before
    public void before() {
        solution = new Solution();
    }

    @After
    public void after() {
    }

    /**
     * Method: canGive(int x)
     */
    @Test
    public void testCanGive() {
        Assert.assertEquals(this.expected, solution.canGive(this.x));
    }
} 
