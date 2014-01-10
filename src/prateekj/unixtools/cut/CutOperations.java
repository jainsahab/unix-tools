package prateekj.unixtools.cut;

/**
 * Created by prateekj on 1/10/14.
 */

class OperationInfo {
    int fieldNo;
    String delimiter = ",";
    String fileName;
}

public class CutOperations {
    OperationInfo getInfo(String[] temp){
        OperationInfo op = new OperationInfo();
            for (String s : temp) {
                if(s.startsWith("-f"))
                    op.fieldNo = Integer.parseInt(s.substring(2));
                else if(s.startsWith("-d")){
                    op.delimiter = s.substring(3,s.length()-1);
                }
                else
                    op.fileName = s;
            }

            return op;
    }
    void printSpecifiedFields(String content,OperationInfo op){
        int fieldNo = op.fieldNo - 1;
        String[] temp = content.split("\n");
        for (String s : temp) {
            try{
                System.out.println(s.split(op.delimiter)[fieldNo]);
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println(s.split(op.delimiter)[0]);
            }
        }
    }
}
