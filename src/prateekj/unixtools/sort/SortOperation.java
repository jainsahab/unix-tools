package prateekj.unixtools.sort;

import java.util.Arrays;
import java.util.Collections;

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
    void sortContent(String content,Options input){
        String sorted[]= content.split("\n");
        if(input.reverse)
            Arrays.sort(sorted, Collections.reverseOrder());
        else
            Arrays.sort(sorted);
        for (String s : sorted) {
            System.out.println(s);
        }
    }
}
