package model.article.pojos;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName ap_article_config
 */
@TableName(value ="ap_article_config")
@Data
public class ApArticleConfig implements Serializable {
    private Long id;

    private Long articleId;

    private Integer isComment;

    private Integer isForward;

    private Integer isDown;

    private Integer isDelete;

    private static final long serialVersionUID = 1L;
}