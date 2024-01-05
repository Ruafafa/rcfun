package model.schedule.pojos;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName taskinfo
 */
@TableName(value ="taskinfo")
@Data
public class Taskinfo implements Serializable {
    private Long taskId;

    private Date executeTime;

    private Integer priority;

    private Integer taskType;

    private byte[] parameters;

    private static final long serialVersionUID = 1L;
}