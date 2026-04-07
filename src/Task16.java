public class Task16 {
    public static void main(String[] args){
        System.out.println(fizzString("fig"));


    }

    public static  String fizzString(String str){

    if(str.startsWith("f") && str.endsWith("b")){
        return "FizzBuzz";
    }else if (str.startsWith("f")){
        return "Fizz";
    }else if (str.endsWith("b")){
        return "Buzz";
    }
    return str;
    }
}
