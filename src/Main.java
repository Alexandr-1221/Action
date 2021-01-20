public class Main {
    public static void main(String[] args) {
        int count = 100;
        int transfer = 1200;
        int bonus = 0;
        if (transfer > 1000) {
            bonus = transfer / 100;
        }
        count = count + transfer + bonus;
        System.out.println(bonus);
    }
}
