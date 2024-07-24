package harsha.springframework.springaiintro.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OpenAIServiceImplTest {

    @Autowired
    OpenAIService openAIService;

    @Test
        void getAnswer() {

        String answer = openAIService.getAnswer("tell me a dad joke.");
        System.out.println("got the answer");
        System.out.println(answer);


    }
}