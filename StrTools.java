import javax.swing.plaf.synth.SynthToolTipUI;

public class StrTools{
    public static String changeFirstChar(String str){
        // String tmp = str.substring(1);
        // String f = str.substring(0,1);
        // return f.toUpperCase() + tmp;
        return str.substring(0,1).toUpperCase()+
               str.substring(1);
    }

    public static String addPeriod(String str){
        return str + ".";
    }

    public static String SeperateCharWithSpace(String str){
        int index = 0;
        String tmp = "";
        while(index < str.length()-1){
            tmp += str.substring(index, index+1);
            tmp += ", ";
            index ++;
        }
        return tmp + str.substring(str.length()-1)+".";
    }

    public static String replace(String str, String target, String repl){
        int firstIndex = str.indexOf(target);
        int secondIndex = firstIndex + target.length();
        String firstPart = str.substring(0, firstIndex);
        String secondPart = str.substring(secondIndex);
        return firstPart + repl + secondPart;
        // String dog = "dog";
        // return str.substring(0, str.indexOf("dog")) + "cat" + str.substring(str.indexOf("dog") + dog.length());
    }

    public static String reverse(String str){
        String tmp = "";
        for(int i = str.length() - 1; i >= 0; i--){
            tmp += str.substring(i, i+1);
        }
        return tmp;
    }

    public static String huiwen(String str){
        return str + reverse(str);
    }

    public static String parlidrom(String str){
        String tmp = "";
        if(str.length() % 2 == 0)
            tmp = str.substring(0, str.length()/2);
        else
            tmp = str.substring(0, str.length()/2+1);
        return tmp + reverse(tmp);

    
    }
     /*public 这是一个用来说明方法访问范围的关键字，Public的方法可以在
    client program里访问
    *          static :静态方法关键字，此方法可以直接用class name，method name调用
    *          boolean: 返回值类型
    *          isPali: MethodName
    *          String str: Parameter type
    */
    
    public static boolean isPali(String str){
        String firstpart = str.substring(0, str.length()/2);
        String secondpart = "";
        if(str.length()%2 == 0){
            secondpart = str.substring(str.length()/2);
        }
        else
            secondpart = str.substring(str.length()/2+1);
        return firstpart.equals(reverse(secondpart));
      
    }

    public static void main(String[] args){
    }
}