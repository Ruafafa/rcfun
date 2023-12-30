package model.user.pojos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * APP用户粉丝信息表
 * @TableName ap_user_fan
 */
@TableName(value ="ap_user_fan")
@Data
public class ApUserFan implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 粉丝ID
     */
    private Integer fansId;

    /**
     * 粉丝昵称
     */
    private String fansName;

    /**
     * 粉丝忠实度
            0 正常
            1 潜力股
            2 勇士
            3 铁杆
            4 老铁
     */
    private Integer level;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 是否可见我动态
     */
    private Integer isDisplay;

    /**
     * 是否屏蔽私信
     */
    private Integer isShieldLetter;

    /**
     * 是否屏蔽评论
     */
    private Integer isShieldComment;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}