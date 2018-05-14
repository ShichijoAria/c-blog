package org.yorha.cblog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CBlogApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println(DigestUtils.md5DigestAsHex("123456".toString().getBytes()));
    }

}
