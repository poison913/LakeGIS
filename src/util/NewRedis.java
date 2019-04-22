package util;

import redis.clients.jedis.Jedis;

public class NewRedis {
	// 饿汉式 单例模式
	private NewRedis() {
		// 私有构造函数
	}

	private static final Jedis redis = new Jedis("localhost", 6379);

	// 静态工厂方法
	public static Jedis getInstance() {
		return redis;
	}
}
