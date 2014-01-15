package prateekj.unixtools.uniq;
import prateekj.fs.*;

public class Uniq {
    public static void main(String[] args) {
        FileOperations fs = new FileOperations();
        UniqOperations u = new UniqOperations();
        if(args.length == 0){
            System.out.println("File not Found");
            return;
        }
        String content = fs.readFile(args[0]);
        System.out.println(u.getUniqueLines(content));
    }
}
