public class Main {
    public static int Penaltymoney(boolean parttime,double hours) {
        int paymentperhours = 50000;
        int Penaltyperday = 600000;
        int sum = 0;
        if (hours >= 0) {
            if (parttime) {
                if (hours >= 80) {
                    sum = 0;
                } else {
                    sum = (int) Math.round(paymentperhours * (80 - hours));
                }
            } else {
                int dayoff = 1;
                if (hours + dayoff * 8 >= 160) {
                    sum = 0;
                } else {
                    int subday = (int) Math.ceil((160 - (hours + dayoff * 8)) / 8);
                    sum = subday * Penaltyperday;
                }
            }
        }
        else {
            return -1;
        }
        return sum;
    }
    // main : print string;
    public static void main(String[] args) {
        // Kiểm thử tương đương
        System.out.println(Penaltymoney(false,160));
        System.out.println(Penaltymoney(true, 160));
        System.out.println(Penaltymoney(false,-2));
        System.out.println(Penaltymoney(true, -2));
        System.out.println(Penaltymoney(false,20));
        System.out.println(Penaltymoney(true, 20));
        System.out.println(Penaltymoney(false,100));
        System.out.println(Penaltymoney(true, 100));
        System.out.println();
        // Kiểm thử bảng kế hoạch  :
        System.out.println(Penaltymoney(true,-1));
        System.out.println(Penaltymoney(true, 100));
        System.out.println(Penaltymoney(true,60));
        System.out.println(Penaltymoney(true, 160));
        System.out.println(Penaltymoney(false,-1));
        System.out.println(Penaltymoney(false, 20));
        System.out.println(Penaltymoney(false,100));
        System.out.println(Penaltymoney(false, 200));
    }
}
