package prateekj.unixtools.reduceSpaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReduceSpaceTest {
    @Test
    public void testReducer() throws Exception {
        String actual = "My    Name   is     Prateek     Jain";
        String expected = "My Name is Prateek Jain";
        ReduceSpace rs = new ReduceSpace();
        actual = rs.reducer(actual);
        assertEquals(expected,actual);
    }

    @Test
    public void testReducer2() throws Exception {
        String actual = "My    Name";
        String expected = "My Name";
        ReduceSpace rs = new ReduceSpace();
        actual = rs.reducer(actual);
        assertEquals(expected,actual);
    }
}
