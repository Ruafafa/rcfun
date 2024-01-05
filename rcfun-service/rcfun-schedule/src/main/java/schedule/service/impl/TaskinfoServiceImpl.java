package schedule.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import model.schedule.pojos.Taskinfo;
import org.springframework.stereotype.Service;
import schedule.mapper.TaskinfoMapper;
import schedule.service.TaskinfoService;

/**
* @author Stayw33
* @description 针对表【taskinfo】的数据库操作Service实现
* @createDate 2024-01-05 19:15:59
*/
@Service
public class TaskinfoServiceImpl extends ServiceImpl<TaskinfoMapper, Taskinfo>
    implements TaskinfoService {

}




