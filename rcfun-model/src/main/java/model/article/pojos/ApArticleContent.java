package model.article.pojos;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName ap_article_content
 */
@TableName(value ="ap_article_content")
@Data
public class ApArticleContent implements Serializable {
    private Long id;

    private Long articleId;

    private String content;

    private static final long serialVersionUID = 1L;
}