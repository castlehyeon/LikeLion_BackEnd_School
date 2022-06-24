public class Ch5 {
    public static void main(String[] args) {
        // 구현시작
        자동차 a자동차1 = new 자동차();
        자동차 a자동차2 = new 자동차();
        // 구현끝
        a자동차1.maxSpeed = 230;
        a자동차2.maxSpeed = 210;
        a자동차1.달리다();
        // 출력 => 자동차가 최고속력 230km로 달립니다.

        a자동차2.달리다();
        // 출력 => 자동차가 최고속력 210km로 달립니다.
    }



    }
class 자동차 {
    public void 달리다() {
        System.out.println("자동차가 최고속력" + maxSpeed+"로 달립니다.");
    }
    int maxSpeed;
}
