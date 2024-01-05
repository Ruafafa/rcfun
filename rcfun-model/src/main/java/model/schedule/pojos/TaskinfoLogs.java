package model.schedule.pojos;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName taskinfo_logs
 */
@TableName(value ="taskinfo_logs")
@Data
public class TaskinfoLogs implements Serializable {
    private Long taskId;

    private Date executeTime;

    private Integer priority;

    private Integer taskType;

    private Integer version;

    private Integer status;

    private byte[] parameters;

    private static final long serialVersionUID = 1L;
}