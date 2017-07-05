package ph.mallody.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ph.mallody.test.pojo.User;
import ph.mallody.test.service.ITestService;

@Controller
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping("/")
    public String selectUser(Model model, HttpServletRequest request) {

        List<User> list = testService.selectUser();
        model.addAttribute("userList", list);
        return "user_list";
    }

}
