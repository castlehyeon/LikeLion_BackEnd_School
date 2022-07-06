// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : 조건문을 사용하지 않고 처리해주세요.
// 조건 : 전사 클래스만 만들어주세요.

//
// 문제 : 온라인 게임을 구현해주세요.
// 조건 : 전사객체를 만들고 순서대로 칼, 창, 지팡이로 공격하게 해주세요.
// 단 : 전사는 무기라는 것이 존재한다는 것은 알지만 칼, 창, 지팡이에 대해선 몰라야 합니다.

//class Main {
//    public static void main(String[] args) {
//        // 구현 시작
//        전사 a전사 = new 전사();
//        a전사.공격();
//        a전사.a무기 = new 활();
//        a전사.공격();
//        a전사.a무기 = new 지팡이();
//        a전사.공격();
//        a전사.a무기 = new 전설의_지팡이();
//        a전사.공격();
//        // 구현 끝
//
//        // 출력
//    /*
//    칼(으)로 공격합니다.
//    데미지 : 78
//    창(으)로 공격합니다.
//    데미지 : 80
//    지팡이(으)로 공격합니다.
//    데미지 : 12
//    전설의_지팡이(으)로 공격합니다.
//    데미지 : 120
//    */
//    }
//}
//
///* 구현 시작 */
//class 전사 {
//    무기 a무기;
//}
//abstract class 무기{
//    abstract void 공격();
//}
//class 칼 extends 무기{
//    @Override
//    void 공격() {
//
//    }
//}
//class 활 extends 무기{
//
//}
//class 지팡이 extends 무기{
//
//}
//class 전설의_지팡이 extends 무기{
//
//}
///* 구현 끝 */
// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : 조건문을 사용하지 않고 처리해주세요.
// 조건 : `a무기` 인스턴스 변수를 이용해서 풀어주세요.
// 조건 : 칼, 창, 지팡이 클래스를 만들어주세요.



//class Main {
//    public static void main(String[] args) {
//        전사 a전사 = new 전사();
//
//        a전사.공격();
//        // 칼(으)로 공격합니다.
//        // 데미지 : 78
//
//        a전사.창_모드로_변경();
//
//        a전사.공격();
//        // 창(으)로 공격합니다.
//        // 데미지 : 80
//
//        a전사.지팡이_모드로_변경();
//
//        a전사.공격();
//        // 지팡이(으)로 공격합니다.
//        // 데미지 : 12
//    }
//}
////전사 클래스가 필요하겠지?
////구성이란 포함관계 'has a', 생성자와 인스턴스
////전사는 모드를 변경할 수 있다. 공격할 수 있다. 모드는 무기로 추상화할 수 있다. => 전사는 무기를 가지고 있다. 기본무기는 칼이다.=> 전사>무기>창, 지팡이
//
//class 전사 {
//    무기 a무기 = new 무기(); //다른 객체(무기)를 참조하는 참조변수!, 여기서 객체까지 생성하면 되겠군!
//    void 공격(){
//        a무기.사용();
//        a무기.데미지출력();
//    }
//    void 창_모드로_변경(){
//        a무기 = new 창();
//    }
//    void 지팡이_모드로_변경(){
//        a무기 = new 지팡이();
//    }
////
////    void 공격(){
////        System.out.println(a무기+"(으)로 공격합니다.");
////    }//기본무기를 여기 생성자에서 수정해야하나? 아니면 여기 메서드안에서?
//}
//class 무기{
//    String 장비;
//    int 데미지;
////    창 창변경 = new 창();
////    지팡이 지팡이변경 = new 지팡이();
//
//    public 무기() {
//        this.장비 = "칼";
//        this.데미지 = 78;
//    }
//
//    void 사용(){
//        System.out.println(장비+"(으)로 공격합니다.");
//    }
//    void 데미지출력(){
//        System.out.println("데미지 : "+데미지);
//    }
//}
//
//class 창 extends 무기 {
//    public 창() {
//        this.장비 = "창";
//        this.데미지 = 80;
//    }
//}
//class 지팡이 extends 무기 {
//    public 지팡이() {
//        this.장비 = "지팡이";
//        this.데미지 = 12;
//    }
//}
// 문제 : 온라인 게임을 구현해주세요.
// 조건 : 전사객체를 만들고 순서대로 칼, 창, 지팡이로 공격하게 해주세요.
// 단 : 전사는 무기라는 것이 존재한다는 것은 알지만 칼, 창, 지팡이에 대해선 몰라야 합니다.

//내가 작성한 코드
//

// 문제 : 구성(전사는 무기로 구성된다.)을 사용하여 중복을 제거해주세요.
// Main 클래스는 수정불가능


//전사타입을 나눔으로써,공격메서드가 반복됨.
//전사 클래스에서 무기멤버와 공격메서드 선언, 생성자만 사용
class Main {
    public static void main(String[] args) {
        전사타입A a전사타입A = new 전사타입A();
        a전사타입A.공격();

        전사타입B a전사타입B = new 전사타입B();
        a전사타입B.공격();

        전사타입C a전사타입C = new 전사타입C();
        a전사타입C.공격();

        전사타입D a전사타입D = new 전사타입D();
        a전사타입D.공격();
    }
}

abstract class 전사{
    String a무기;

    public 전사() {
        this.a무기 = a무기;
    }

    void 공격(){System.out.println(a무기+"로 공격");};
}

class 전사타입A extends 전사 {
    public 전사타입A() {
        this.a무기 = "칼";
    }
}
class 전사타입B extends 전사 {
    public 전사타입B() {
        this.a무기 = "칼";
    }
}
class 전사타입C extends 전사 {
    public 전사타입C() {
        this.a무기 = "활";
    }
}
class 전사타입D extends 전사 {
    public 전사타입D() {
        this.a무기 = "활";
    }
}