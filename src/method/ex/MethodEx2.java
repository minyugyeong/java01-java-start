package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        int num = 5;

        print(message, num);
    }

    public static void print(String message, int num){
        for (int i = 0; i < num; i++){
            System.out.println(message);
        }
    }
}
