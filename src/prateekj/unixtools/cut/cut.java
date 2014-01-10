package prateekj.unixtools.cut;

import prateekj.fs.*;
public class cut {
    public static void main(String[] args) {
        CutOperations operations = new CutOperations();
        OperationInfo op = operations.getInfo(args);
        String content = new FileOperations().readFile(op.fileName);
        operations.printSpecifiedFields(content, op);
    }
}
