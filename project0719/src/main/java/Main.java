import java.util.ArrayList;

//1. 소수 배열1 구하기 1600851475143
//2. 주어진 수로 나눠서 0이 되는 것들 중 마지막 숫자만 꺼내오기
//주어진 수 1600851475143는 에러가 무조건 나서 13195의 소인수 배열이라도 구해보기로 함.
class Main{
    public static void main(String[] args) {
        ArrayList<Long> arr1 = new ArrayList<>();
        //ArrayList<Long> arr2 = new ArrayList<>();
        int index = 0;
        int index2;
        final long fullSize = 13195;
        //소수 배열은 본인까지 숫자 중 나눠서 0이 되는게 있는지, 없으면 소수
        for( long i = 1; i < fullSize; i++) {
            if (fullSize % i == 0) {
                arr1.add(index, i);
                ++index;
            }
        }
//        for(Long rs : arr1){
//            System.out.println(rs);
//        }//약수까지는 잘 구해진다.
        //arr1.remove(0);//1은 소수에서 빠지니까.

        for(index2 = 0; index2 < arr1.size(); index2++){ //중복
            for (long i = 2; i < arr1.get(index2); i++) {
                if (arr1.get(index2) % i == 0) {
                    arr1.remove(index2);
                }
            }
        }
        for(Long rs : arr1){
            System.out.println(rs);
        }//출력값 1,5,7,13,29,91,2639

    }
}