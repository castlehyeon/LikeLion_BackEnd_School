//code.oa.gg/java8/1075
// 문제 : 아래코드가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {
        사람[] 사람들 = new 사람[5];
        사람들[0] = 사람.get사람();
        사람들[1] = 사람.get사람();
        사람들[2] = 사람.get사람();
        사람들[3] = 사람.get사람();
        사람들[4] = 사람.get사람();

        System.out.println("실행완료");
    }
}
//get사람 할 때마다 new가 아니라, 객체 하나로 돌려쓰기
class 사람{
    private 사람(){}
    public static 사람 get사람(){
        return new 사람();
    }
}