/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shetty.sachin.streaming.iteration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author sachin
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({shetty.sachin.streaming.iteration.StreamIteratorTest.class, shetty.sachin.streaming.iteration.SimpleSpliteratorTest.class, shetty.sachin.streaming.iteration.ParallelSpliteratorTest.class})
public class IterationSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
