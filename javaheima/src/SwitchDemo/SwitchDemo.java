package SwitchDemo;

public class SwitchDemo {
    public static void main (String[] args){
        //做一个一周备忘录的提醒
        String weekday = "Fri";
        switch (weekday){
            case "Mon" :
                System.out.println("walking the dog");
                break;
            case "Tue" :
                System.out.println("eat sushi");
                break;
            case "Wen" :
                System.out.println("study");
                break;
            case "Thu" :
                System.out.println("go to gym");
                break;
            case "Fri" :
                System.out.println("go to work");
                break;

            default:
                System.out.println("wrong day");
        }

        //用户输入月份，展示该月份的天数
        int month = 9;
        switch (month) {
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("31");
                break;
            case 2 :
                System.out.println("28");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("30");
                break;

            default: System.out.println("wrong input");
        }
    }
}
