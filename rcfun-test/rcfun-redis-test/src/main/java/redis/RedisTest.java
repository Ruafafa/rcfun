package redis;

import common.redis.CacheService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import schedule.ScheduleApplication;

import java.util.Set;

@SpringBootTest(classes = ScheduleApplication.class)
public class RedisTest {

    @Autowired
    private CacheService cacheService;

    @Test
    public void testList(){

        //在list的左边添加元素
        cacheService.lLeftPush("list_001","hello,redis");
        System.out.println("添加成功");
//        //在list的右边获取元素，并删除
//        String list_001 = cacheService.lRightPop("list_001");
//        System.out.println(list_001);
//        String s = cacheService.lRightPop("list_001");
//        System.out.println(s);
    }

    @Test
    public void testZset(){
        //添加数据到zset中  分值
        /*cacheService.zAdd("zset_key_001","hello zset 001",1000);
        cacheService.zAdd("zset_key_001","hello zset 002",8888);
        cacheService.zAdd("zset_key_001","hello zset 003",7777);
        cacheService.zAdd("zset_key_001","hello zset 004",999999);*/

        //按照分值获取数据
        Set<String> zset_key_001 = cacheService.zRangeByScore("zset_key_001", 0, 8888);
        System.out.println(zset_key_001);


    }
}