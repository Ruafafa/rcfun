package model.article.pojos;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName ap_article
 */
@TableName(value ="ap_article")
@Data
public class ApArticle implements Serializable {
    private Long id;

    private String title;

    private Integer authorId;

    private String authorName;

    private Integer channelId;

    private String channelName;

    private Integer layout;

    private Integer flag;

    private String images;

    private String labels;

    private Integer likes;

    private Integer collection;

    private Integer comment;

    private Integer views;

    private Integer provinceId;

    private Integer cityId;

    private Integer countyId;

    private Date createdTime;

    private Date publishTime;

    private Integer syncStatus;

    private Integer origin;

    private String staticUrl;

    private static final long serialVersionUID = 1L;
}