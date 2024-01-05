package schedule;

import org.junit.platform.commons.annotation.Testable;

import java.util.Calendar;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * 继承 Delayed 接口，实现 getDelay 和 compareTo 方法
 */
@Testable
public class DelayedTaskTest implements Delayed {
    // 任务的执行时间
    private int executeTime;

    public DelayedTaskTest(int delay){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, delay);
        this.executeTime = (int)(calendar.getTimeInMillis() /1000 );
    }

    /**
     * 返回与此对象关联的剩余延迟（以给定时间单位表示）。
     * 形参:
     * unit – 时间单位
     * 返回值:
     * 剩余的延迟;零值或负值表示延迟已经过去
     * @param unit the time unit
     * @return
     */
    @Override
    public long getDelay(TimeUnit unit) {
        Calendar calendar = Calendar.getInstance();
        return executeTime - (calendar.getTimeInMillis()/1000);
    }

    /**
     * 将此对象与指定的对象进行比较以进行排序。返回负整数、零或正整数，因为此对象小于、等于或大于指定的对象。
     * 实施者必须确保signum(x.compareTo(y)) == -signum(y.compareTo(x))所有 x 和 y.（这意味着当且仅当y.compareTo(x)引发异常时，x.compareTo(y)必须引发异常。
     * 实现者还必须确保关系是可传递的： (x.compareTo(y) > 0 && y.compareTo(z) > 0) implies x.compareTo(z) > 0。
     * 最后，实现者必须确保这意味着 x.compareTo(y)==0 signum(x.compareTo(z)) == signum(y.compareTo(z))，对于所有 z.
     * 形参:
     * o – 要比较的对象。
     * 返回值:
     * 负整数、零或正整数，因为此对象小于、等于或大于指定对象。
     * 抛出:
     * NullPointerException – 如果指定的对象为 null
     * ClassCastException – 如果指定对象的类型阻止将其与此对象进行比较。
     * API 说明：
     * 强烈建议这样做 ，但不是严格 要求 (x.compareTo(y)==0) == (x.equals(y))。一般来说，任何实现 Comparable 接口并违反此条件的类都应该清楚地表明这一事实。推荐的语言是“注意：此类具有与相等不一致的自然顺序。
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Delayed o) {
        long val = this.getDelay(TimeUnit.NANOSECONDS) - o.getDelay(TimeUnit.NANOSECONDS);
        return val == 0 ? 0 : ( val < 0 ? -1: 1 );
    }


    public static void main(String[] args) {
        DelayQueue<DelayedTaskTest> queue = new DelayQueue<>();

        queue.add(new DelayedTaskTest(5));
        queue.add(new DelayedTaskTest(5));
        queue.add(new DelayedTaskTest(10));
        queue.add(new DelayedTaskTest(15));
        queue.add(new DelayedTaskTest(30));

        System.out.println(System.currentTimeMillis()/1000+" start consume ");
        while(queue.size() != 0){
            // 详细见 poll 方法注释，过期的任务会被移除
            DelayedTaskTest delayedTask = queue.poll();
            if(delayedTask !=null ){
                System.out.println(System.currentTimeMillis()/1000+" cosume task");
            }
            //每隔一秒消费一次
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
