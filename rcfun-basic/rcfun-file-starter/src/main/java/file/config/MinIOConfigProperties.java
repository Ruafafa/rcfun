package file.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
// 为了可拆卸，不使用 EnableConfigurationProperties注解，而是用 SpringBoot的 spring.factories 机制
@ConfigurationProperties(prefix = "minio")
public class MinIOConfigProperties {

    private String accessKey;
    private String secretKey;
    private String bucket;
    private String endpoint;
    private String readPath;
}
