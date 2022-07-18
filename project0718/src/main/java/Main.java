//code.oa.gg/java8/1352
// 문제 : 아래가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ar1 = new ArrayList<>();

        ar1.add(10);
        ar1.add(20);
        System.out.println(ar1.get(0) + ar1.get(1));
        // 출력 : 30

        ArrayList<Boolean> ar2 = new ArrayList<>();

        ar2.add(true);
        ar2.add(true);
        if ( ar2.get(0) && ar2.get(1) ) {
            System.out.println("둘다 참 입니다.");
        }
        // 출력 : 둘다 참 입니다.
    }
}

class ArrayList <T> {
    Object[] datas;
    int lastIndex = -1;

    ArrayList() {
        datas = new Object[3]; // 이 부분은 수정할 수 없습니다.
    }

    void add(Object data, int index) {
        lastIndex++;
        extendDatasSizeIfNeed();

        // 구현시작
        // 맨 뒤의 손님을 끝쪽으로 한칸 이동시킨다.
        // 맨 뒤에서 2번째 손님을 끝쪽으로 한칸 이동시킨다.
        // 맨 뒤에서 3번째 손님을 끝쪽으로 한칸 이동시킨다.
        // 맨 뒤에서 index번째 손님을 끝쪽으로 한칸 이동시킨다.
        for ( int i = lastIndex - 1; i > index - 1; i-- ) {
            datas[i + 1] = datas[i];
        }

        // 구현끝

        datas[index] = data;
    }

    void add(T data) {
        lastIndex++;

        extendDatasSizeIfNeed();

        datas[lastIndex] = data;
    }

    void extendDatasSizeIfNeed() {
        if ( lastIndex >= datas.length ) {
            // 확장공사
            // 기존버스 버리고 새 버스로 연결!!
            // datas 이 녀석이 기존 버스를 버리고 새 버스를 가리켜야 합니다.

            // 새 버스 생성
            Object[] newArr = new Object[datas.length * 2];

            // 기존 버스(배열)를 버리기 전에 버스에 있던 승객들을 새 버스로 옮긴다.
            for ( int i = 0; i < datas.length; i++ ) {
                newArr[i] = datas[i];
            }

            datas = newArr;
        }
    }

    T get(int index) {
        return (T) datas[index];
    }

    int size() {
        return lastIndex + 1;
    }
}