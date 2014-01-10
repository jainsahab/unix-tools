package prateekj.unixtools.cut;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by prateekj on 1/10/14.
 */
public class CutOperationsTest {
    @Test
    public void get_input_without_providing_delimiter() throws Exception {
        String[] input = {"temp.txt","-f2"};
        OperationInfo expected = new OperationInfo();
        expected.fieldNo = 2;
        expected.fileName = "temp.txt";
        CutOperations op = new CutOperations();

        OperationInfo actual = op.getInfo(input);

        assertEquals(expected.fieldNo,actual.fieldNo);
        assertEquals(expected.fileName,actual.fileName);
        assertEquals(expected.delimiter,actual.delimiter);
    }

    @Test
    public void get_input_with_providing_delimiter() throws Exception {
        String[] input = {"temp.txt","-f2","-d' '"};
        OperationInfo expected = new OperationInfo();
        expected.fieldNo = 2;
        expected.fileName = "temp.txt";
        expected.delimiter = " ";
        CutOperations op = new CutOperations();

        OperationInfo actual = op.getInfo(input);

        assertEquals(expected.fieldNo,actual.fieldNo);
        assertEquals(expected.fileName,actual.fileName);
        assertEquals(expected.delimiter,actual.delimiter);
    }
}
