package prateekj.unixtools.sort;

import prateekj.fs.FileOperations;

public class Sort {
    public static void main(String[] args) {
        SortOperation so = new SortOperation();
        Options input = so.getOptions(args);
        if(input.fileName == null){
            System.out.println("File not Found");
            return;
        }
        String content = new FileOperations().readFile(input.fileName);
        System.out.println(so.sortContent(content, input));
    }
}
