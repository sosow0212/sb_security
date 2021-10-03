package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // view 리턴하겠다
public class IndexController {

    // localhost:8080/
    // localhost:8080

    @GetMapping({"","/"})
    public String index() {
        // 머스테치 기본폴더 src/main/resources/
        // View Resolver 설정 : templates (prefix),
        // .mustache (suffix) 생략가능!
        return "index";
    }
}
