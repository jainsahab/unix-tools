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
}
