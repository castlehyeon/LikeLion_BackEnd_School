//code.oa.gg/java8/1127
class Main {
    public static void main(String[] args) {
        HashMap aMap = new HashMap();

        aMap.put(1, "안녕");//위 아래 매개변수가 다 다르네 ->이를 일일이 만들기보다 통합형 <T>를 쓰자.
        aMap.put("A", false);

        System.out.println(aMap.get("A"));
        // 출력 : false
    }
}
class HashMap <T> {
    private Object[] key;
    private Object[] value;
    private int lastIndex;
    public HashMap() {
        key = new Object[3];
        value = new Object[key.length];//3말고 key.length로 쓰는게 좋다.
        lastIndex = -1;
    }
    public void put(T key, T value){
        sizeUpIfNeedKey();
        sizeUpIfNeedValue();
        ++lastIndex;
        this.key[lastIndex] = key;
        this.value[lastIndex] = value;

    }

    private void sizeUpIfNeedValue() {
        if(lastIndex >= key.length){
            Object[] newValue = new Object[key.length * 2];
            for ( int i = 0; i < key.length; i++ ) {
                newValue[i] = value[i];
            }
            value = newValue;
        }
    }

    private void sizeUpIfNeedKey() {
        if(lastIndex >= key.length){
            Object[] newKey = new Object[key.length * 2];
            for ( int i = 0; i < key.length; i++ ) {
                newKey[i] = key[i];
            }
            key = newKey;
        }
    }

    public T get(T input) {
        //rs1에는 인덱스가 들어가야한다. 하지만 KeyIndex는 꼭 int가 들어가는 것은 아니다.
        T rs1, rs2 = null;

        for(int i = 0; i <= lastIndex; i++) {
            //boolean result = key[i].equals(input);
            if (key[i] == input) {
                rs2 = (T) value[i];
            }
        }
        return rs2;
    }
}