package prateekj.unixtools.head;
import prateekj.fs.*;

public class Head {
    public static void main(String[] args) {
    OperationsOfHead op = new OperationsOfHead();
        FileOperations fs = new FileOperations();
        Operations action = op.getOptions(args);
        String content = fs.readFile(action.fileName);
        System.out.println(op.printSpecifiedLine(content, action.lineNo));
    }
}
