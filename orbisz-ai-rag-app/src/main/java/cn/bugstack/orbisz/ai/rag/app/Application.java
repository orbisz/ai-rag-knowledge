package cn.bugstack.orbisz.ai.rag.app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@Configurable
@ComponentScan({
        "cn.bugstack.orbisz.ai.rag.api",      // 接口包
        "cn.bugstack.orbisz.ai.rag.app",      // 主模块包
        "cn.bugstack.orbisz.ai.rag.trigger"   // 依赖模块包
})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}

