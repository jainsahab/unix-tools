package prateekj.unixtools.uniq;
import prateekj.fs.*;

public class Uniq {
    public static void main(String[] args) {
        FileOperations fs = new FileOperations();
        String content = fs.readFile(args[0]);
    }
}
