package prateekj.unixtools.cut;

/**
 * Created by prateekj on 1/10/14.
 */

class OperationInfo {
    int fieldNo;
    String delimiter = " ";
    String fileName;
}

public class CutOperations {
    OperationInfo getInfo(String[] temp){
        OperationInfo op = new OperationInfo();
        for (String s : temp) {
            if(s.startsWith("-f"))
                op.fieldNo = Integer.parseInt(s.substring(2));
            else if(s.startsWith("-d"))
                op.delimiter = s.substring(2);
            else
                op.fileName = s;
        }
        return op;
    }
}
