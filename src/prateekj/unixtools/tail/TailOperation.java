package prateekj.unixtools.tail;

class Operations {
    int lineNo;
    String fileName;
}

public class TailOperation {
    Operations getOptions(String[] temp){
        Operations op = new Operations();
        op.fileName = temp[0];
        op.lineNo = 10;
        if(temp.length > 1){
            for(String a: temp){
                if(a.startsWith("-"))
                    op.lineNo = Integer.parseInt(a.substring(a.indexOf('n')+1));
                else
                    op.fileName = a;
            }
        }
        return op;
    }

    void printSpecifiedLine(String content,int limit){
        String[] temp = content.split("\n");
        for (int i = temp.length-limit ; i < temp.length ; i++){
            System.out.println(temp[i]);
        }
    }
}