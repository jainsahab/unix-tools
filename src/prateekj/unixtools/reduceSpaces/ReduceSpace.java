package prateekj.unixtools.reduceSpaces;
import prateekj.fs.FileOperations;

public class ReduceSpace {
    String reducer(String fileData){
        return fileData.replaceAll("\\ +"," ");
    }

    public static void main(String[] args) {
        String fileName = args[0];
        ReduceSpace r = new ReduceSpace();
        FileOperations fo = new FileOperations();
        String fileData = fo.readFile(fileName);
        fileData = r.reducer(fileData);
        fo.writeFile(fileName,fileData);
    }
}
