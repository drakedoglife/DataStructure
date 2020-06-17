package Clock;

public class Clock {
    private Display hour;
    private Display minute;
    private Display second;

    //构造函数
    public Clock(int hour, int minute, int second) {
        this.hour = new Display(24, hour);
        this.minute = new Display(60, minute);
        this.second = new Display(60, second);
    }

    //滴答一下时间走一秒
    public void tick() {
        this.second.increase();
        if(this.second.getValue() == 0) {
            this.minute.increase();
            if(this.minute.getValue() == 0) {
                this.hour.increase();
            }
        }
        this.toString();
    }

    //时间字符串格式化
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour.getValue(), this.minute.getValue(), this.second.getValue());
    }

    public void start() {
        while(true) {
            second.increase();
            if(second.getValue() == 0) {
                minute.increase();
                if(minute.getValue() == 0) {
                    hour.increase();
                }
            }
//            System.out.printf("%02d:%02d:%02d\n", hour.getValue(), minute.getValue(), second.getValue());
        }
    }
}
