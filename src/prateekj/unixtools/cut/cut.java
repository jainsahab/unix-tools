package prateekj.unixtools.cut;

import prateekj.fs.*;
public class Cut {
    public static void main(String[] args) {
        CutOperations operations = new CutOperations();
        OperationInfo op = operations.getInfo(args);
        if(op.fileName == null){
            System.out.println("File not Found");
            return;
        }
        String content = new FileOperations().readFile(op.fileName);
        System.out.println(operations.getFields(content, op));
    }
}
