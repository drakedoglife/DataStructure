package Clock;

public class Display {
    private int value = 0;
    private int limit = 0;

    //构造函数
    Display(int limit, int value) {
        this.limit = limit;
        this.value = value;
    }

    //value增加并判断
    public void increase() {
        this.value++;
        if (this.value == this.limit) {
            value = 0;
        }
    }

    //获取Value
    public int getValue() {
        return this.value;
    }
}
