package freemarker.controller;


import freemarker.FreemarkerDemoApplication;
import freemarker.model.StudentVO;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

// 注意这里是非REST风格API，所以不需要@RestController
@Controller
@SpringBootTest(classes = FreemarkerDemoApplication.class)

public class TestController {

    //freeMarker configuration
    @Autowired
    Configuration configuration;
    @GetMapping("/basic")
    public String test(Model model) {

        //1.纯文本形式的参数
        model.addAttribute("name", "freemarker");
        //2.实体类相关的参数

        StudentVO student = new StudentVO();
        student.setName("Ruafafa");
        student.setAge(19);
        model.addAttribute("stu", student);

        return "01-basic";
    }

    @GetMapping("/list")
    public String list(Model model){

        //------------------------------------
        StudentVO stu1 = new StudentVO();
        stu1.setName("小强");
        stu1.setAge(18);
        stu1.setMoney(1000.86f);
        stu1.setBirthday(new Date());

        //小红对象模型数据
        StudentVO stu2 = new StudentVO();
        stu2.setName("小红");
        stu2.setMoney(200.1f);
        stu2.setAge(19);

        //将两个对象模型数据存放到List集合中
        List<StudentVO> stus = new ArrayList<>();
        stus.add(stu1);
        stus.add(stu2);

        //向model中存放List集合数据
        model.addAttribute("stus",stus);

        //------------------------------------

        //创建Map数据
        HashMap<String,StudentVO> stuMap = new HashMap<>();
        stuMap.put("stu1",stu1);
        stuMap.put("stu2",stu2);
        // 3.1 向model中存放Map数据
        model.addAttribute("stuMap", stuMap);

        return "02-list";
    }
    @Test
    public void htmlTest() throws IOException, TemplateException {
        //freemarker的模板对象，获取模板
        Template template = configuration.getTemplate("01-basic.ftl");
        Map<String, Object> params = new HashMap<>();
        StudentVO stu = new StudentVO();
        stu.setName("Ruafafa");
        stu.setAge(19);
        params.put("name", "Great Ruafafa");
        params.put("stu", stu);
        //合成
        //第一个参数 数据模型, 第二个参数  输出流
        template.process(params, new FileWriter("02-list.html"));
    }
}

