package UglyAugust;

import java.util.ArrayList;
import java.util.List;

public class TwentyFirst {
    public static void main(String[] args) {
        String[] operations={"5","-2","4","C","D","9","+","+"};
        // 5, -2, 4, 9, 13, 21
        List<Integer> oper= new ArrayList<>();
        //["5","2","C","D","+"]
        for(int i=0; i<operations.length;i++){
            if(operations[i].equals("C")){
                oper.remove(oper.size()-1);
            }else if(operations[i].equals("D")){
                int d= oper.get(oper.size()-1)*2;
                oper.add(d);
            }else if(operations[i].equals("+")){
                int plus= oper.get(oper.size()-2)+oper.get(oper.size()-1);
                oper.add(plus);
            }else{
                oper.add(Integer.valueOf(operations[i]));
            }

        }
        System.out.println("oper = " + oper);
        int result=0;
        for (int a : oper) {
            result += a;
        }
        System.out.println(result);

    }
}
