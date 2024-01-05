package model.article.pojos;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName ap_collection
 */
@TableName(value ="ap_collection")
@Data
public class ApCollection implements Serializable {
    private Long id;

    private Integer entryId;

    private Long articleId;

    private Integer type;

    private Date collectionTime;

    private Date publishedTime;

    private static final long serialVersionUID = 1L;
}