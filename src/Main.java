public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));

        System.out.println("---------------");

        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));

        System.out.println("---------------");

        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));

        System.out.println("---------------");

        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));

        System.out.println("---------------");

        System.out.println(area(5.0));
        System.out.println(area(-1));
    }

    public static boolean shouldWakeUp(boolean dogSound, int time){

        if(dogSound && (time < 8 || time>20)){
            if(time < 0 || time>23) {
                return false;

            }else{
                return true;
            }
        }else{
            return false;
        }
    }

    public static boolean hasTeen(int... ages){
        boolean result = false;
        for(int age:ages){
            if(age >= 13 && age<=19){
                result = true;
                break;
            }else{
                result = false;
            }
        }
        return result;
    }

    public static boolean isCatPlaying(boolean summer, int degree){
        boolean result = false;
        if(summer && degree <= 45 && degree>=25){
            result = true;
        }else if(!summer && degree <= 35 && degree>=25){
            result= true;
        }else{
            result = false;
        }
        return result;
    }

    public static double area(double... nums){
        double result = 1;
        for(double num:nums){
            if(num < 0){
                result = -1;
                break;
            }else{
                result *= num;
            }
        }
        return result;
    }

    public static double area(double radius){
        double result = 1;
        if(radius < 0){
            result = -1;
        }else{
            result = radius * radius * Math.PI;
        }
        return result;
    }


}