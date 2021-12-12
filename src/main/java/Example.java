import java.util.Scanner;

public class Example {
    static int x,y;
    static Scanner scanner = new Scanner(System.in);

    public  boolean test(int x, int y){
        return x % y == 0;
    }

    public int getX(){
        System.out.println("Введите x =");
        int x;
        Scanner scannerX = new Scanner(System.in);
        int x_ = scannerX.nextInt();

        if ((x_ <= 100) && (x_ >= 2)){
            x = x_;
        }else{
            System.out.println("Неподходящие число, введите число от 2 до 100");
            x = getX();
        }
        return x;
    }

    public int getY(){
        System.out.println("Введите y =");
        int y;
        Scanner scannerY = new Scanner(System.in);
        int y_ = scannerY.nextInt();

        if ((y_ <= 100) && (y_ >= 2)){
            y = y_;
        }else{
            System.out.println("Неподходящие число, введите число от 2 до 100");
            y = getX();
        }
        return y;
    }

    public String print(int x, int y){
        return "Результат: " + test(x,y);
    }

    public static void main(String[] args){
        Example test = new Example();
        x = test.getX();
        y = test.getY();
        System.out.println(test.print(x,y));
    }
}
