package com.company.U1M3SummativeGipsonAmber;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class quoteController {

    private Random randomGenerator;
    private List<Quote> quoteList;

  public quoteController() {
        quoteList = new ArrayList<Quote>();

        quoteList.add(new Quote("You miss 100 percent of the shots you dont take", "Wayne Gretzky"));
        quoteList.add(new Quote("Life isn't about getting and having, it's about giving and being.", "Kevin Kruse"));
        quoteList.add(new Quote(". Life is what happens to you while you’re busy making other plans", "John Lennon"));
        quoteList.add(new Quote("The mind is everything. What you think you become.", "Buddha"));
        quoteList.add(new Quote("You can never cross the ocean until you have the courage to lose sight of the shore. ", "Christopher Columbus"));
        quoteList.add(new Quote("Life is 10% what happens to you and 90% how you react", "Charles R. Swindoll"));
        quoteList.add(new Quote("The secret to getting ahead is getting started","Mark Twain"));
        quoteList.add(new Quote("Look up at the stars and not down at your feet. Try to make sense of what you see, and wonder about what makes the universe exist. Be curious", "Stephen Hawking"));
        quoteList.add(new Quote("With the new day comes new strength and new thoughts", "Elanor Roosevelt"));
        quoteList.add(new Quote("A journey of a thousand miles must begin with a single step","Lao Tzu"));
    }
    @RequestMapping(value = "/api/quote", method = {RequestMethod.GET})
    public Quote getQuoteList() {
        int index = randomGenerator.nextInt(quoteList.size());
        return quoteList.get(index);
  }
}
