package com.redis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
	@Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Test
    public void test() throws Exception {
    	Map<String,Object> map = new HashMap<String,Object>();
        map.put("name", "zhuming");
        map.put("age", "45");
        map.put("sex", "1");
        map.put("address", "tangshan");
        map.put("type", "类型");
        stringRedisTemplate.opsForHash().putAll("username", map);
        /* List<String> list =new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("v");
        stringRedisTemplate.opsForValue().set("abc", "测试");
        stringRedisTemplate.opsForList().leftPushAll("qq",list);*/ // 向redis存入List
//        stringRedisTemplate.opsForList().range("qq",0,-1).forEach(value ->{
//           System.err.println(value);
//        });
//        Object obj = stringRedisTemplate.opsForHash().get("username", "address");
//        System.err.println(obj.toString());
        Iterator<Object> iterator = stringRedisTemplate.opsForHash().keys("aa").iterator();
        System.out.println(iterator.hasNext());
        while(iterator.hasNext()){
        	String key = String.valueOf(iterator.next());
        	String value = String.valueOf(stringRedisTemplate.opsForHash().get("username", key));
        	System.out.println("key:"+key+",value:"+value);
        	stringRedisTemplate.opsForHash().delete("username", key);
        }
    }
    public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("sex");
		list.add("name");
		list.add("address");
		list.add("age");
		list.add("idCard");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("list", list.toString());
		System.out.println(map);
	}
}
