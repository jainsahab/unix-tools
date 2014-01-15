package prateekj.unixtools.reduceSpaces;
import prateekj.fs.FileOperations;

public class ReduceSpace {
    String reducer(String fileData){
        return fileData.replaceAll("\\ +"," ");
    }

    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("File not Found");
            return;
        }
        if(args.length == 1 ){
            System.out.println("Destination file not Found");
            return;
        }
        String source = args[0];
        String destination = args[1];
        ReduceSpace r = new ReduceSpace();
        FileOperations fo = new FileOperations();
        String fileData = fo.readFile(source);
        fileData = r.reducer(fileData);
        fo.writeFile(destination,fileData);
    }
}
