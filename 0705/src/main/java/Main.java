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

class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.나이 = 10;
        a사람.a왼팔 = new 팔();

        System.out.println(a사람.a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}
class 사람{
    int 나이;
    팔 a왼팔;


}
class 팔{
    int 길이;

    public 팔() {
        this.길이 = 100;
    }
}