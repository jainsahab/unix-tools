package prateekj.unixtools.head;
import prateekj.fs.*;

import java.io.File;

class Operations {
    int lineNo;
    String fileName;
}
 class OperationsOfHead {
     String filePath = System.getenv("UNIX_HOME") + "/properties.config";
     FileOperations fs = new FileOperations();
     File f = new File(filePath);
      Operations getOptions(String[] args){
      Operations op = new Operations();
        if(args.length == 1){
            op.fileName = args[0];
            if(f.exists())
                op.lineNo = Integer.parseInt(fs.readFile(filePath).split(":")[1]);
            else
            op.lineNo = 10;
            return op;
        }
        for(String a: args){
            if(a.startsWith("-"))
                op.lineNo = Integer.parseInt(a.substring(a.indexOf('n')+1));
            else
                op.fileName = a;
        }
        return op;
    }

     String getLine(String content,int limit){
        StringBuilder result = new StringBuilder();
        String[] temp = content.split("\n");
         if(temp.length < limit)
             limit = temp.length;
        for (int i = 0 ; i < limit ; i++){
            result.append(temp[i]).append("\n");
        }
        return result.toString().substring(0,result.length()-1);
    }
}
