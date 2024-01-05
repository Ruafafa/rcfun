package model.article.pojos;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName ap_author
 */
@TableName(value ="ap_author")
@Data
public class ApAuthor implements Serializable {
    private Integer id;

    private String name;

    private Integer type;

    private Integer userId;

    private Date createdTime;

    private Integer wmUserId;

    private static final long serialVersionUID = 1L;
}