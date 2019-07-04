package cn.test;


import redis.clients.jedis.Jedis;

public class Dame {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.2.129",6379);
        System.out.println(jedis.ping());
    }
}
