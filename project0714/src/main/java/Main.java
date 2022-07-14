//code.oa.gg/java8/991

// 문제 : 배열의 단점을 보완한 ArrayList 라는 클래스를 만들어주세요. 아래와 같이 출력되도록 해주세요.

class Main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);

        int value = ar.get(0);
        System.out.println(value);
        // 출력 : 100

        value = ar.get(1);
        System.out.println(value);
        // 출력 : 200

        value = ar.get(2);
        System.out.println(value);
        // 출력 : 300
    }
}

class ArrayList {
    //int[] arr = new int[3]; 내 코드
    //강사님 코드: 생성자에서 해결하라.
    int[] arr;
    ArrayList(){
        arr = new int[3];
    }
    int index =0;
    public void add(int num){
        arr[index] = num;
        ++index;
    }
    public int get(int i){
        return arr[i];
    }
}