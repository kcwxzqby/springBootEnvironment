package top.kc.springbootenvironment.controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2020/9/13 0013 下午 7:27
 * @Created by Administrator
 */
@Controller
public class HelloController {

    @GetMapping("hello")
    public void hello(HttpServletResponse response) throws IOException {
        response.getWriter().println("<h1 style='width:100%; text-align:center; color:blue; font-size:48px;'>Hello, Spring Boot</h1>");
        response.flushBuffer();
    }

}
