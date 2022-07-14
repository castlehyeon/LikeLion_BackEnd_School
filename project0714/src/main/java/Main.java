//code.oa.gg/java8/995

// 문제 : 아래 코드가 작동하도록 해주세요.

class Main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();

        for ( int i = 0; i < 100; i++ ) {
            ar.add((i + 1) * 10);
        }

        int ar_size = ar.size(); // ar_size의 값은 100 이어야 합니다.

        for ( int i = 0; i < ar_size; i++ ) {
            int value = ar.get(i);
            System.out.println(value);
        }
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

    public int size() {
        return lastIndex+1;
    }
}