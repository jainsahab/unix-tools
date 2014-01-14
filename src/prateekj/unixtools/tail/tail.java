package prateekj.unixtools.tail;
import prateekj.fs.*;



public class Tail {
    public static void main(String[] args) {
        TailOperation op = new TailOperation();
        FileOperations fs = new FileOperations();
        Operations action = op.getOptions(args);
        String content = fs.readFile(action.fileName);
        System.out.println(op.getLines(content, action.lineNo));
    }
}
