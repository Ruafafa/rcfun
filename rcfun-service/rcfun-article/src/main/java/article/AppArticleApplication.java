package article;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan({"article.mapper"})
@SpringBootApplication
public class AppArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppArticleApplication.class, args);
    }
}
