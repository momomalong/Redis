package cn.test;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class TestApi {
    public static void main(String[] args) {
        //通过linux服务器的ip + redis端口连接
       Jedis jedis = new Jedis("192.168.2.129",6379);
        jedis.set("k1","v1");
        jedis.set("k2","v2");
        jedis.set("k3","v3");
        System.out.println(jedis.get("k3"));
        //得到所有key
        Set<String> keys = jedis.keys("*");
        System.out.println(keys.size());

    }
}
