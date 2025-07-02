package Manager;

public class total {

    // 총 매출은 모든 객체에 대해 공유되어야 하므로 static으로 선언
    private static int total = 0;

    // 총 매출 출력
    public static void printTotal() {
        System.out.println("현재까지의 총 매출은 : " + total + "원입니다.");
    }

    // 매출 추가
    public static void addTotal(int totalPrice) {
        total += totalPrice;
    }

    // 총 매출 반환
    public static int getTotal() {
        return total;
    }
}
