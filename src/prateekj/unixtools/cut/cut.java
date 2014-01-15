package prateekj.unixtools.cut;

import prateekj.fs.*;
public class Cut {
    public static void main(String[] args) {
        CutOperations operations = new CutOperations();
        OperationInfo op = operations.getInfo(args);
        String content = new FileOperations().readFile(op.fileName);
        System.out.println(operations.printSpecifiedFields(content, op));
    }
}
