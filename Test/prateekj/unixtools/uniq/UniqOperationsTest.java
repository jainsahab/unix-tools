package prateekj.unixtools.uniq;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class UniqOperationsTest {
    @Test
    public void testGetUniqueLines() throws Exception {
        String fileData ="Prateek\nPrayas\nPrayas\nPrateek\nPrateek\nKajal\nPrajakta\nPrajakta";
        String expected ="Prateek\nPrayas\nPrateek\nKajal\nPrajakta";
        UniqOperations u = new UniqOperations();
        String actual = u.getUniqueLines(fileData);
        assertEquals(expected,actual);
    }

    @Test
    public void testGetUniqueLines2() throws Exception {
        String fileData ="Prateek\nPrayas\nPrayas";
        String expected ="Prateek\nPrayas";
        UniqOperations u = new UniqOperations();
        String actual = u.getUniqueLines(fileData);
        assertEquals(expected,actual);
    }

    @Test
    public void testGetUniqueLines3() throws Exception {
        String fileData ="Prateek\nPrayas\nKajal";
        String expected ="Prateek\nPrayas\nKajal";
        UniqOperations u = new UniqOperations();
        String actual = u.getUniqueLines(fileData);
        assertEquals(expected,actual);
    }

    @Test
    public void testGetUniqueLines4() throws Exception {
        String fileData ="Prateek\nPrayas\nKajal\nKajal";
        String expected ="Prateek\nPrayas\nKajal";
        UniqOperations u = new UniqOperations();
        String actual = u.getUniqueLines(fileData);
        assertEquals(expected,actual);
    }
}
