import java.util.ArrayList;

////code.oa.gg/java8/1346
//// 문제 : 아래가 실행되도록 해주세요.
//
//class Main {
//    public static void main(String[] args) {
//        사람 a사람 = new 사람();
//
//        변호사 a변호사 = a사람;
//        a변호사.변호하다();
//        // 출력 : 사람이 변호 합니다.
//
//        변호사 a변호사2 = new 오랑우탄();
//        a변호사2.변호하다();
//        // 출력 : 오랑우탄이 변호 합니다.
//
//        의사 a의사 = new 오랑우탄();
//        a의사.진찰하다();
//        // 출력 : 오랑우탄이 진찰 합니다.
//
//        의사 a의사2 = new 사람();
//        a의사2.진찰하다();
//        // 출력 : 사람이 진찰 합니다.
//    }
//}
//class 사람 implements 변호사, 의사{
//    public void 변호하다(){
//        System.out.println("사람이 변호합니다.");
//    }
//    public void 진찰하다(){
//        System.out.println("사람이 진찰합니다.");
//    }
//}
//interface 변호사{
//    void 변호하다();
//}
//
//class 오랑우탄 implements 변호사, 의사{
//
//    public void 변호하다(){
//        System.out.println("오랑우탄이 변호합니다.");
//    }
//    public void 진찰하다(){
//        System.out.println("오랑우탄이 진찰합니다.");
//    }
//}
//interface 의사{
//    void 진찰하다();
//}
////1. interface와 클래스의 메서드가 충돌되는 에러메세지 -> 구현하는 클래스쪽에서 public을 붙이니 해결.
//// public을 안붙이면 default가 붙는데, 이렇게 되면 컴퓨터가 메서드 충돌 에러를 뱉는다. 따라서 구현하는 클래스의 메서드에 public을 붙여주자.
//code.oa.gg/java8/1129
//code.oa.gg/java8/1127
class Main {
    public static void main(String[] args) {
        HashMap aMap = new HashMap();

        aMap.put(1, "안녕");//위 아래 매개변수가 다 다르네 ->이를 일일이 만들기보다 통합형 <T>를 쓰자.
        aMap.put("A", false);

        //System.out.println(aMap.get("A"));
        // 출력 : false
    }
}
class HashMap <T> { //매개변수로 한개를 받는다는게 아니라, 지네릭을 쓰겠다! 라는 표현
    private Object[] key;
    private Object[] value;
    private int size;
    private int index;

    public HashMap() {
        key = new Object[2];//0,1 2
        value = new Object[key.length];//3말고 key.length로 쓰는게 좋다.
        size = 2; //size 1, 배열 인덱스 0
        index = -1;
    }

    public void put(T key, T value) { //1. size 0 , 2. 1
        //배열 0,1 size2
        ++index;
        this.key[index] = key; // 0번 인덱스는 비어있고 1번 인덱스에 1, 안녕 //사이즈 모자라잖아요!
        this.value[index] = value;

    }
}

//    private void sizeUpIfNeedValue() {
//        if(lastIndex >= key.length){
//            Object[] newValue = new Object[key.length * 2];
//            for ( int i = 0; i < key.length; i++ ) {
//                newValue[i] = value[i];
//            }
//            value = newValue;
//        }
//    }
//
//    private void sizeUpIfNeedKey() {
//        if(lastIndex >= key.length){
//            Object[] newKey = new Object[key.length * 2];
//            for ( int i = 0; i < key.length; i++ ) {
//                newKey[i] = key[i];
//            }
//            key = newKey;
//        }
//    }

//    public T get(T input) {
//        //초기 생각:rs1에는 인덱스가 들어가야한다. 하지만 KeyIndex는 꼭 int가 들어가는 것은 아니다.
//        T rs1, rs2 = null;
//
//        for(int i = 0; i <= lastIndex; i++) {
//            //boolean result = key[i].equals(input);
//            if (key[i] == input) {
//                rs2 = (T) value[i];
//            }
//        }
//        return rs2;//필요한건 rs2뿐이지만, value를 통한 값비교도 구현가능하다.
//    }
//}