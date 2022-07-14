////code.oa.gg/java8/940
//// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
//
//class Main {
//    public static void main(String[] args) {
//        자동차 a자동차 = new 자동차();
//        a자동차.달리다();
//    }
//}
//
//class 자동차 {
//    void 달리다() {
//        System.out.println("자동차가 달립니다.");
//    }
//}
//code.oa.gg/java8/948
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.

class Main {
    public static void main(String[] args) {
        사람 a사람1 = new 사람();
        a사람1.이름 = "홍길동";
        a사람1.나이 = 22;

        a사람1.자기소개();
        // 출력 : 저는 22살 홍길동 입니다.

        사람 a사람2 = new 사람();
        a사람2.이름 = "홍길순";
        a사람2.나이 = 25;

        a사람2.자기소개();
        // 출력 : 저는 25살 홍길순 입니다.

        a사람1.자기소개();
        // 출력 : 저는 22살 홍길동 입니다.
    }
}

class 사람 {
    static int 나이;
    static String 이름;

    static void 자기소개() {
        System.out.println("저는 " + 나이 + "살 " + 이름 + " 입니다.");
    }
}