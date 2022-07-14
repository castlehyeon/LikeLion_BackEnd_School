//code.oa.gg/java8/930
// 문제 : 아래와 같이 출력되도록 해보세요.

//    class Main {
//        public static void main(String[] args) {
//            new 사람();
//            // 출력 : 사람이 태어났습니다.
//
//            new 사람(10);
//            // 출력 : 태어나서부터 10살인 사람이 태어났습니다.
//
//            new 사람(20);
//            // 출력 : 태어나서부터 20살인 사람이 태어났습니다.
//        }
//        class 사람{
//            사람();
//            사람(int a);
//        }
//    }



//code.oa.gg/java8/934
// 문제 : 아래가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        new 사과(); //힙에 객체 생성
        new 포도();
        사람 a사람 = new 사람("홍길동");
        a사람.출력();
        사람 b사람 = new 사람();
        b사람.출력();
    }
}

class 사과 {
    // 이렇게 생성자를 만들지 않은 클래스는 자바에서 자동으로 생성자를 하나 만들어준다.
    // 참고로 자동으로 만들어 질 때 `매개변수 없는 생성자`가 만들어집니다.
    //메서드 1개 기본
}

class 포도 {
    포도() {
        // 이렇게 생성자를 직접 만들면 자바는 더 이상 자동으로 생성자를 만들어주지 않습니다.
    }
}
class 사람{
    String name;
    사람(){
        this.name = "무명";
    }
    사람(String name){
        this.name = name;
    }
    void 출력(){
        System.out.println("내이름은"+name+"입니다.");
    }
}