package prateekj.unixtools.uniq;

import java.util.ArrayList;

/**
 * Created by prateekj on 1/9/14.
 */
public class UniqOperations {
    String getUniqueLines(String content){
        String result="";
        int index;
        ArrayList list = new ArrayList();
        String[] temp = content.split("\n");
        int length = temp.length;
        for (index = 1 ; index < length ; index++){
            if(!temp[index-1].equals(temp[index]))
                list.add(temp[index-1]);
        }
        list.add(temp[index-1]);
        for ( int i = 0 ; i < list.size() ; i ++){
            result += list.get(i)+"\n";
        }
        return result.substring(0,result.length()-1);
    }

}

