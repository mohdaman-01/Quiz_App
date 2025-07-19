package com.example.Quiz_App;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionController {
    @GetMapping("allquestions")
    public String getAllQuestions() {
        return "These are your questions";
    }

}
