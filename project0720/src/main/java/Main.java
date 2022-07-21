//code.oa.gg/java8/1081
// 문제 : 아래코드가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        오리 a청둥오리 = 오리공장.get("청둥");
        오리 a흰오리 = 오리공장.get("흰");
        오리 a고무오리 = 오리공장.get("고무");
        오리 a고무2오리 = 오리공장.get("고무2");
        오리 a로봇오리 = 오리공장.get("로봇");

        a청둥오리.날다();
        // 출력 : 청둥오리 : 날개로 날아갑니다.
        a청둥오리.울다();
        // 출력 : 청둥오리 : 꽥꽥!!

        a흰오리.날다();
        // 출력 : 흰오리 : 날개로 날아갑니다.
        a흰오리.울다();
        // 출력 : 흰오리 : 꽥꽥!!

        a고무오리.날다();
        // 출력 : 고무오리 : 저는 날 수 없어요. ㅠㅠ
        a고무오리.울다();
        // 출력 : 고무오리 : 삑!삑!

        a고무2오리.날다();
        // 출력 : 고무오리 : 저는 날 수 없어요. ㅠㅠ
        a고무2오리.울다();
        // 출력 : 고무오리 : Peek!Peek!

        a로봇오리.날다();
        // 출력 : 로봇오리 : 로켓파워로 날아갑니다!!
        a로봇오리.울다();
        // 출력 : 로봇오리 : 기계는 울 수 없습니다.

        a고무2오리.set비행아이템(new 로켓날개비행아이템());
        a고무2오리.날다();
        // 출력 : 고무오리 : 로켓파워로 날아갑니다!!
    }
}
class 오리{
    비행아이템 a비행아이템;
    public 오리(){
    }

    public 오리(String str) {

    }

    public void 날다() {
        System.out.println("날개로 날아갑니다.");
    }

    public void 울다() {
        System.out.println("꽥꽥!!");
    }

    public void set비행아이템(로켓날개비행아이템 로켓날개비행아이템) {
    }
}
class 청둥오리 extends 오리{
    public 청둥오리("청둥"){

    }

}
class 흰오리 extends 오리{

}
class 고무오리 extends 오리{
    public void 날다() {
        System.out.println("저는 날 수 없어요. ㅠㅠ");
    }

    public void 울다() {
        System.out.println("삑!삑!");
    }
}
class 고무2오리 extends 오리{
    public void 날다() {
        System.out.println("저는 날 수 없어요. ㅠㅠ");
    }

    public void 울다() {
        System.out.println("Peek!Peek!");
    }
}
class 로봇오리 extends 오리{
    public void 날다() {
        System.out.println("로켓파워로 날아갑니다!!");
    }

    public void 울다() {
        System.out.println("기계는 울 수 없습니다.");
    }
}
class 오리공장{

    public static 오리 get(String str) {
        
        return new 오리(str);
    }
}

interface 비행아이템{

}
//1. new 로켓비행아이템, 2.오리 종류를 변환시키는 것.