package prateekj.unixtools.tail;

import prateekj.fs.FileOperations;


public class Tail1 {
    public static void main(String[] args) {
        TailOperation op = new TailOperation();
        FileOperations fs = new FileOperations();
        if(args.length == 0){
            System.out.println("File not Found");
            return;
        }
        Operations action = op.getOptions(args);
        String content = fs.readFile(action.fileName);
        System.out.println(op.getLines(content, action.lineNo));
    }
}
