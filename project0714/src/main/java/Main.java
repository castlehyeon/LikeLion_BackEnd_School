//code.oa.gg/java8/997

// 문제 : 아래 코드가 작동하도록 해주세요.

class Main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);
        ar.add(400);

        ar.remove(2);
        int value = ar.get(2);
        System.out.println(value);
        // 출력 : 400

        ar.remove(0);
        value = ar.get(0);
        System.out.println(value);
        // 출력 : 200

        ar.add(78);
        value = ar.get(2);
        System.out.println(value);
        // 출력 : 78
    }
}

class ArrayList {
    int[] datas;
    int lastIndex = -1;

    ArrayList() {
        datas = new int[3]; // 이 부분은 수정할 수 없습니다.
    }

    void add(int data) {
        if ( lastIndex + 1 >= datas.length ) {
            // 확장공사
            // 기존버스 버리고 새 버스로 연결!!
            // datas 이 녀석이 기존 버스를 버리고 새 버스를 가리켜야 합니다.

            // 새 버스 생성
            int[] newArr = new int[datas.length * 2];

            // 기존 버스(배열)를 버리기 전에 버스에 있던 승객들을 새 버스로 옮긴다.
            for ( int i = 0; i < datas.length; i++ ) {
                newArr[i] = datas[i];
            }

            datas = newArr;
        }

        lastIndex++;

        datas[lastIndex] = data;
    }

    int get(int index) {
        return datas[index];
    }

    int size() {
        return lastIndex + 1;
    }

    void remove(int index) {
        for(int i = index; i < lastIndex; i++){ //삭제된 인덱스의 자리에 바로뒤에있는 요소들이 대체되는 for문
            datas[index] = datas[index+1];
        }
        lastIndex -= 1; //최신 인덱스를 -1로 해주기.
    }
}