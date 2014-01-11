package prateekj.unixtools.sort;

import prateekj.fs.*;
public class sort {
    public static void main(String[] args) {
        SortOperation so = new SortOperation();
        Options input = so.getOptions(args);
        String content = new FileOperations().readFile(input.fileName);
        System.out.println(so.sortContent(content, input));
    }
}
