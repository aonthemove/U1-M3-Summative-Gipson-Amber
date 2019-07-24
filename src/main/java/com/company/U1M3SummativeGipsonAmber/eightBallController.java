package com.company.U1M3SummativeGipsonAmber;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
@RestController
public class eightBallController {
    private Random randomGenerator;
    private List<eightBall> eightBallList;

    public eightBallController() {

        eightBallList = new ArrayList<>();


        eightBallList.add(new eightBall("\n", "For Sure"));
        eightBallList.add(new eightBall("\n", "It is written in the stars"));
        eightBallList.add(new eightBall("\n", "Yes - definitely"));
        eightBallList.add(new eightBall("\n", "My vision cannot see that far"));
        eightBallList.add(new eightBall("\n", "Without a doubt"));
        eightBallList.add(new eightBall("\n", "Ask again later"));
        eightBallList.add(new eightBall("\n", "That will be a no"));
        eightBallList.add(new eightBall("\n", "Signs point to yes"));

    }
        @RequestMapping(value = "/magic", method = RequestMethod.POST)
        @ResponseStatus(value = HttpStatus.CREATED)
        public eightBall getAnswer(@RequestBody @Valid String question) {
            Random rand = new Random();
            eightBall setAnswer = eightBallList.get(rand.nextInt(eightBallList.size()));
            return setAnswer;

        }

    }
