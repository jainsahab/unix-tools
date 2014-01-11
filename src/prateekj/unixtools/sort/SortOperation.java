package prateekj.unixtools.sort;

import java.util.Arrays;
import java.util.Collections;

class Options {
    String fileName;
    boolean reverse;
}

public class SortOperation {
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
        if (input.reverse)
            Arrays.sort(sorted, Collections.reverseOrder());
        else
            Arrays.sort(sorted);
        for (String s : sorted) {
            result += s + "\n";
        }
        return result.substring(0, result.length() - 1);
    }
}
