package prateekj.unixtools.head;

class Operations {
    int lineNo;
    String fileName;
}
class OperationsOfHead {
    Operations getOptions(String[] temp){
        Operations op = new Operations();
        if(temp.length == 1){
            op.fileName = temp[0];
            op.lineNo = 10;
            return op;
        }
        for(String a: temp){
            if(a.startsWith("-"))
                op.lineNo = Integer.parseInt(a.substring(a.indexOf('n')+1));
            else
                op.fileName = a;
        }
        return op;
    }

    void printSpecifiedLine(String content,int limit){
        String[] temp = content.split("\n");
        for (int i = 0 ; i < limit ; i++){
            System.out.println(temp[i]);
        }
    }
}
