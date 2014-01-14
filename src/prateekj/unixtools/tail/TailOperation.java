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

    String getLines(String content,int limit){
        String[] temp = content.split("\n");
        if(temp.length < limit)
            limit = temp.length;
        StringBuilder result = new StringBuilder();
        for (int i = temp.length-limit ; i < temp.length ; i++){
            result.append(temp[i]).append("\n");
        }
        return result.toString().substring(0,result.length()-1);
    }
}