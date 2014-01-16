package prateekj.unixtools.cut;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by prateekj on 1/10/14.
 */
public class CutOperationsTest {
    @Test
    public void get_input_without_providing_delimiter() throws Exception {
        String[] input = {"temp.txt","-f2,3"};
        OperationInfo expected = new OperationInfo();
        expected.fieldNos.add(2);
        expected.fieldNos.add(3);
        expected.fileName = "temp.txt";
        CutOperations op = new CutOperations();

        OperationInfo actual = op.getInfo(input);

        assertEquals(expected.fieldNos.get(0),actual.fieldNos.get(0));
        assertEquals(expected.fieldNos.get(1),actual.fieldNos.get(1));
        assertEquals(expected.fileName,actual.fileName);
        assertEquals(expected.delimiter,actual.delimiter);
    }

    @Test
    public void get_input_with_providing_delimiter() throws Exception {
        String[] input = {"temp.txt","-f2","-d "};
        OperationInfo expected = new OperationInfo();
        expected.fieldNos.add(2);
        expected.fileName = "temp.txt";
        expected.delimiter = " ";
        CutOperations op = new CutOperations();

        OperationInfo actual = op.getInfo(input);

        assertEquals(expected.fieldNos.get(0),actual.fieldNos.get(0));
        assertEquals(expected.fileName,actual.fileName);
        assertEquals(expected.delimiter,actual.delimiter);
    }

    @Test
    public void get_input_with_providing_delimiter_with_multiple_fields() throws Exception {
        String[] input = {"temp.txt","-f2,3","-d "};
        OperationInfo expected = new OperationInfo();
        expected.fieldNos.add(2);
        expected.fieldNos.add(3);
        expected.fileName = "temp.txt";
        expected.delimiter = " ";
        CutOperations op = new CutOperations();

        OperationInfo actual = op.getInfo(input);

        assertEquals(expected.fieldNos.get(0),actual.fieldNos.get(0));
        assertEquals(expected.fieldNos.get(1),actual.fieldNos.get(1));
        assertEquals(expected.fileName,actual.fileName);
        assertEquals(expected.delimiter,actual.delimiter);
    }

    @Test
    public void cut_by_space() throws Exception {
        String[] input = {"temp.txt","-f1","-d "};
        String inputString = "One Two\n"+
                       "Three Four\n"+
                       "Five Six";
        String expected = "One \nThree \nFive ";
        CutOperations c = new CutOperations();

        OperationInfo op = c.getInfo(input);
        String actual = c.getFields(inputString, op);

        assertEquals(expected,actual);
    }

    @Test
    public void cut_by_comma() throws Exception {
        String[] input = {"temp.txt","-f1","-d,"};
        String inputString = "One,Two\n"+
                "Three,Four\n"+
                "Five,Six";
        String expected = "One \nThree \nFive ";
        CutOperations c = new CutOperations();

        OperationInfo op = c.getInfo(input);
        String actual = c.getFields(inputString, op);

        assertEquals(expected,actual);
    }
    @Test
    public void cut_by_comma_to_cut_multiple_fields() throws Exception {
        String[] input = {"temp.txt","-f1,3","-d,"};
        String inputString = "One,Two,Seven\n"+
                "Three,Four,Eight\n"+
                "Five,Six,Nine";
        String expected = "One Seven \nThree Eight \nFive Nine ";
        CutOperations c = new CutOperations();

        OperationInfo op = c.getInfo(input);
        String actual = c.getFields(inputString, op);

        assertEquals(expected,actual);
    }
}
