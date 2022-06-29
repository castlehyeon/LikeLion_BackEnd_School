package org.example.test0623;//package org.example.test0623;
//
//// 문제 : 자동차 설계도를 만들어주세요.
//
//class Car{
//    public Car(int maxSpeed){
//        this.maxSpeed = maxSpeed;
//    }
//    int maxSpeed;
//}
//
//class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Car car1 = new Car(1);
//        Car car2 = new Car(2);
//
//    }
//}
//
// 문제 : 사람을 말하게 해주세요.

import java.sql.SQLOutput;

class Main {
    public static void main(String[] args) {
        칼 a칼 = new 칼();
        a칼 = new 활();
    }
    }class 칼 {

    }
class 활 extends 칼 {

}
//        무기 a무기 = new 칼();
//        a무기.공격();
//    }
//    }
//    class 무기 {
//        void 공격(){System.out.println("공격한다.");}
//    }
//    class 칼 extends 무기{
//
//    }
//        사람 a사람;
//        a사람 = new 사람();
//        a사람.말하다();
//    }
//}
//
//class 사람 {
//    // 사람은 `말하다` 라는 기능을 가지고 있습니다.
//    void 말하다() {
//        System.out.println("사람이 말합니다.");


//        자동차 자동차 = new 자동차();
//        자동차.달리다();
//
//
//    }
//    static class 자동차{
//
//        void 달리다(){
//            System.out.println("자동차가 달립니다.");
//        }
//    }


//        계산기.더한결과를_화면에_출력(10, 20);
//        // 출력 => 결과 : 30
//
//        계산기.더한결과를_화면에_출력(50, 20);
//        // 출력 => 결과 : 70
//
//        계산기.뺀결과를_화면에_출력(50, 20);
//        // 출력 => 결과 : 30
//
//        계산기.뺀결과를_화면에_출력(5, 2);
//        // 출력 => 결과 : 3
//
//        계산기.곱한결과를_화면에_출력(5, 2);
//        // 출력 => 결과 : 10
//    }
//    class 계산기 {
//        static void 더한결과를_화면에_출력(int x, int y){
//            System.out.println(x + y);
//        }
//        static void 뺀결과를_화면에_출력(int x, int y){
//            System.out.println(x - y);
//        }
//        static void 곱한결과를_화면에_출력(int x, int y){
//            System.out.println(x * y);
//        }


//        청둥오리 a청둥오리 = new 청둥오리();
//        a청둥오리.날다();
//        // 출력 : 오리가 날개로 날아갑니다.
//
//        흰오리 a흰오리 = new 흰오리();
//        a흰오리.날다();
//        // 출력 : 오리가 날개로 날아갑니다.
//
//        고무오리 a고무오리 = new 고무오리();
//        a고무오리.날다();
//        // 출력 : 오리가 날개로 날아갑니다.
//        고무2오리 a고무2오리 = new 고무2오리();
//        a고무2오리.날다();
//        // 출력 : 저는 날 수 없어요. ㅜㅠ
//    }
//}
//
//class 오리 {
//    void 날다() {
//        System.out.println("오리가 날개로 날아갑니다.");
//    }
//}
//
//class 흰오리 extends 오리 {
//
//}
//
//class 청둥오리 extends 오리{
//
//}
//
//class 고무오리 extends 오리{
//    void 날다() {
//        System.out.println("고무오리는 날지 못해요.");
//    }
//
//    //메서드 오버라이딩이 된거지만, 덮어쓰기가 아니다. 고무오리 안에 메서드가 2개가 아니라 3개가 있는 거임.
//    //자식클래스에서 직접만든 메서드 오버라이딩은 우선순위가 더 높기 때문에 실행된 것이다.
//    //우선순위는 자동으로 부여, 묻혀있는 것은 super를 사용해서 쓸 수 있다.
//}
//class 고무2오리 extends 고무오리{
//
//}
