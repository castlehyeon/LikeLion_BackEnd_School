//// 문제 : 아래와 같이 출력 되도록 해주세요.
//class Main {
//    public static void main(String[] args) {
//        캐릭터 a플레이어_캐릭터;
//
//        a플레이어_캐릭터 = new 전사();
//        a플레이어_캐릭터.공격();
//        // 출력 : 전사가 대검으로 공격합니다.
//
//        a플레이어_캐릭터 = new 마법사();
//        a플레이어_캐릭터.공격();
//        // 출력 : 마법사가 파이어볼로 공격합니다.
//    }
//}
//abstract class 캐릭터{
//    abstract void 공격();
//}
//class 전사 extends 캐릭터{
//    @Override
//    void 공격() {
//        System.out.println("전사가 대검으로 공격합니다.");
//    }
//}
//class 마법사 extends 캐릭터{
//    @Override
//    void 공격() {
//        System.out.println("마법사가 파이어볼로 공격합니다.");
//    }
//}
// 문제 : 아래와 같이 출력되게 해주세요.

//
// 출력 : 아래와 같이 출력되게 해주세요.

//class Main {
//    public static void main(String[] args) {
//        사람 a사람 = new 사람();
//        a사람.나이 = 10;
//        a사람.a왼팔 = new 팔();
//
//        System.out.println(a사람.a왼팔.길이 + "cm");
//        // 출력 : 100cm
//    }
//}
//class 사람{
//    int 나이;
//    팔 a왼팔;
//
//
//}
//class 팔{
//    int 길이;
//
//    public 팔() {
//        this.길이 = 100;
//    }
//}
// 출력 : 아래와 같이 출력되게 해주세요.

//class Main {
//    public static void main(String[] args) {
//        new 사람().걷다();
//
//        System.out.println(new 사람().a왼팔.길이 + "cm");
//        // 출력 : 100cm
//    }
//}
//class 사람 {
//    팔 a왼팔 = new 팔(); //생성자를 안넣었기 때문에 NullPoint에러 발생
//
//    public 사람() {
//        this.a왼팔.길이 = 100;
//    }
//
//    void 걷다() {
//        System.out.println("사람 걷는다.");
//    }
//}
//class 팔{
//    int 길이;
//}
// 문제 : 아래와 같이 출력 되도록 해주세요.

class Main {
    public static void main(String[] args) {
        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
        // 출력 : 5cm
    }
}
class 사람{
    팔 a왼팔 = new 팔();
}
class 팔{
//    int a손;
    손 a손 = new 손();
}
class 손{
    길이 a엄지손가락 = new 길이();
}
class 길이{
    int 길이;

    public 길이() {
        this.길이 = 5;
    }
}