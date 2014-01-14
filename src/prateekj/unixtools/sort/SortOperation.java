package prateekj.unixtools.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Options {
    String fileName;
    boolean reverse;
}

public class SortOperation{
    Options getOptions(String[] temp) {
        Options op = new Options();
        for (String s : temp) {
            if (s.equals("-r"))
                op.reverse = true;
            else
                op.fileName = s;
        }
        return op;
    }

    String sortContent(String content, Options input) {
        String sorted[] = content.split("\n");
        String result = "";
        if (input.reverse){
            Arrays.sort(sorted, new Comparator<String>() {
                @Override
                public int compare(String p1, String p2) {
                    return p1.compareTo(p2) * -1;
                }
            });
        }
        else{
            Arrays.sort(sorted, new Comparator<String>() {
                @Override
                public int compare(String p1, String p2) {
                    return p1.compareTo(p2);
                }
            });
        }
        for (String s : sorted) {
            result += s + "\n";
        }
        return result.substring(0, result.length() - 1);
    }
}
