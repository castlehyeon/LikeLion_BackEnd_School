// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.

//public class Main {
//    public static void main(String[] args) {
//        전사 a전사 = new 전사();
//
//        a전사.공격("브라이언", "칼");
//        // 브라이언이(가) 칼(으)로 공격합니다.
//
//        a전사.재공격();
//        // 브라이언이(가) 칼(으)로 공격합니다.
//
//        a전사.공격("필립", "창");
//        // 필립이(가) 창(으)로 공격합니다.
//
//        a전사.공격("마크", "지팡이");
//        // 마크(가) 지팡이(으)로 공격합니다.
//
//        a전사.재공격();
//        // 마크(가) 지팡이(으)로 공격합니다.
//
//        a전사.재공격();
//        // 마크(가) 지팡이(으)로 공격합니다.
//    }
//}
//class 전사{
//    static String name;
//    static String item;
//
//     void 공격(String name, String item){
//         전사.item =item;
//         전사.name =name;
//         System.out.println(name+"이(가)"+item+"(으)로 공격합니다.");
//    }
//    void 재공격(){
//        System.out.println(name+"이(가)"+item+"(으)로 공격합니다.");
//    }
//}
//강사님코드
// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.
//class 전사 {
//
//    private String 이름;
//    private String 무기명;
//
//    private void 공격수행() {
//        System.out.printf("%s(가) %s(으)로 공격합니다.\n", 이름, 무기명);
//    }
//
//    public void 공격(String 이름, String 무기명) {
//        this.이름 = 이름;
//        this.무기명 = 무기명;
//
//        공격수행();
//    }
//
//    public void 재공격() {
//        공격수행();
//    }
//}
//챕터10 2번
// 상황 : DVD방에 3개의 서로다른 tv가 있다. 영업을 하다보니 각 tv의 특별한 기능은 거의 사용될 일이 없고 기본적인 켜기/끄기 만 사용된다. 현재 리모콘이 3개나 있는습니다.
// 문제 : 알바를 편하게 하기 위해서 표준Tv 리모콘을 구현해주세요.

//class Main {
//    public static void main(String[] args) {
//        System.out.println("== 표준Tv 리모콘 들여오기 전 ==");
//
//        샤오미Tv a샤오미Tv = new 샤오미Tv();
//        삼성Tv a삼성Tv = new 삼성Tv();
//        LGTv aLGTv = new LGTv();
//
//        a샤오미Tv.켜기();
//        // 출력 => 샤오미Tv 켜집니다.
//        a샤오미Tv.끄기();
//        // 출력 => 샤오미Tv 꺼집니다.
//        a샤오미Tv.vr켜기();
//        // 출력 => 샤오미Tv vr켜기!
//
//        a삼성Tv.켜기();
//        // 출력 => 삼성Tv 켜집니다.
//        a삼성Tv.끄기();
//        // 출력 => 삼성Tv 꺼집니다.
//        a삼성Tv.ar켜기();
//        // 출력 => 삼성Tv ar켜기!
//
//        aLGTv.켜기();
//        // 출력 => LGTv 켜집니다.
//        aLGTv.끄기();
//        // 출력 => LGTv 꺼집니다.
//        aLGTv.게임모드전환();
//        // 출력 => LGTv 게임모드전환!
//
//        System.out.println("== 표준Tv 리모콘 들여온 후 ==");
//
//        // 표준Tv 리모콘을 만든다.
//        표준Tv a표준Tv;
//
//        // a표준Tv 변수에 샤오미Tv 객체를 연결한다.
//        a표준Tv = a샤오미Tv;
//        a표준Tv.켜기();
//        // 출력 : 샤오기TV 켜집니다.
//        a표준Tv.끄기();
//        // 출력 : 샤오기TV 꺼집니다.
//
//        // a표준Tv 변수에 삼성Tv 객체를 연결한다.
//        a표준Tv = a삼성Tv;
//        a표준Tv.켜기();
//        // 출력 : 삼성TV 켜집니다.
//        a표준Tv.끄기();
//        // 출력 : 삼성TV 꺼집니다.
//
//        // a표준Tv 변수에 LGTv 객체를 연결한다.
//        a표준Tv = aLGTv;
//        a표준Tv.켜기();
//        // 출력 : LGTV 켜집니다.
//        a표준Tv.끄기();
//        // 출력 : LGTV 꺼집니다.
//
//        // LGTV만의 고유 기능을 표준Tv 리모콘을 이용해서 호출하기 => 불가능
//        // (LGTv) => a표준Tv 변수에 있던 표준Tv 리모콘이 LGTv리모콘화 해서 `aLGTv2` 변수에 들어간다.
//        LGTv aLGTv2 = (LGTv)a표준Tv;
//        aLGTv2.게임모드전환();
//    }
//}
//
//class 표준Tv{
//    void 켜기() {
//        System.out.println("Tv 켜집니다.");
//    }
//
//    void 끄기() {
//        System.out.println("Tv 꺼집니다.");
//    }
//}
//class 샤오미Tv extends 표준Tv{
//    void 켜기() {
//        System.out.println("샤오미Tv 켜집니다.");
//    }
//
//    void 끄기() {
//        System.out.println("샤오미Tv 꺼집니다.");
//    }
//
//    void vr켜기() {
//        System.out.println("샤오미Tv vr켜기!");
//    }
//}
//
//class 삼성Tv extends 표준Tv {
//    void 켜기() {
//        System.out.println("삼성Tv 켜집니다.");
//    }
//
//    void 끄기() {
//        System.out.println("삼성Tv 꺼집니다.");
//    }
//
//    void ar켜기() {
//        System.out.println("삼성Tv ar켜기!");
//    }
//}
//
//class LGTv extends 표준Tv {
//    void 켜기() {
//        System.out.println("LGTv 켜집니다.");
//    }
//
//    void 끄기() {
//        System.out.println("LGTv 꺼집니다.");
//    }
//
//    void 게임모드전환() {
//        System.out.println("LGTv 게임모드전환!");
//    }
//}
// 문제 : 정수 i가 가지고 있는 10을 double 형 변수에 넣고 해당 변수의 값을 다시 i에 넣는 코드를 작성해주세요.

class Main {
    public static void main(String[] args) {
        int i = 10;
        double d = i; // 여기선 자동형변환 허용
        i = (int)d; // 여기선 자동형변환 불가능
        System.out.println(i);
    }
}