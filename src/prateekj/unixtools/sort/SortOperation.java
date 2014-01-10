package prateekj.unixtools.sort;


class Options{
    String fileName;
    boolean reverse;
}

public class SortOperation {
    Options getOptions(String[] temp){
        Options op = new Options();
        for (String s : temp) {
            if(s.equals("-r"))
                op.reverse = true;
            else
                op.fileName = s;
        }
        return op;
    }

}
