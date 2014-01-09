package prateekj.unixtools.tail;
import prateekj.fs.*;



public class tail {
    public static void main(String[] args) {
        TailOperation op = new TailOperation();
        FileOperations fs = new FileOperations();
        Operations action = op.getOptions(args);
        String content = fs.readFile(action.fileName);
        op.printSpecifiedLine(content,action.lineNo);
    }
}
