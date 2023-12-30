package model.user.pojos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * APP用户信息表
 * @TableName ap_user
 */
@TableName(value ="ap_user")
@Data
public class ApUser implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 密码、通信等加密盐
     */
    private String salt;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码,md5加密
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 0 男
            1 女
            2 未知
     */
    private Integer sex;

    /**
     * 0 未
            1 是
     */
    private Integer isCertification;

    /**
     * 是否身份认证
     */
    private Integer isIdentityAuthentication;

    /**
     * 0正常
            1锁定
     */
    private Integer status;

    /**
     * 0 普通用户
            1 自媒体人
            2 大V
     */
    private Integer flag;

    /**
     * 注册时间
     */
    private Date createdTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}