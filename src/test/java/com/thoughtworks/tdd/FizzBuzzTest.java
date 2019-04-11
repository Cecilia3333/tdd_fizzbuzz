package com.thoughtworks.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;



public class FizzBuzzTest {
    @Test
    @DisplayName("origin number test")
    public void origin_number_test() {
        //given
        FizzBuzz number = new FizzBuzz();

        //when
        String result = number.fizzbuzz(new Integer(1));

        //then
        assertThat(result, is("1"));
    }

    @Test
    @DisplayName("fizz test")
    public void fizz_mocked() {
        //given
        FizzBuzz number = new FizzBuzz();

        //when
        String result = number.fizzbuzz(new Integer(3));

        //then
        assertThat(result, is("Fizz"));
    }

    @Test
    @DisplayName("buzz test")
    public void buzz_mocked() {
        //given
        FizzBuzz number = new FizzBuzz();

        //when
        String result = number.fizzbuzz(new Integer(5));

        //then
        assertThat(result, is("Buzz"));
    }

    @Test
    @DisplayName("whizz test")
    public void whizz_mocked() {
        //given
        FizzBuzz number = new FizzBuzz();

        //when
        String result = number.fizzbuzz(new Integer(7));

        //then
        assertThat(result, is("Whizz"));
    }

    @Test
    @DisplayName("fizz buzz test")
    public void fizz_buzz_mocked() {
        //given
        FizzBuzz number = new FizzBuzz();

        //when
        String result = number.fizzbuzz(new Integer(15));

        //then
        assertThat(result, is("FizzBuzz"));
    }

    @Test
    @DisplayName("fizz whizz test")
    public void fizz_whizz_mocked() {
        //given
        FizzBuzz number = new FizzBuzz();

        //when
        String result = number.fizzbuzz(new Integer(21));

        //then
        assertThat(result, is("FizzWhizz"));
    }

    @Test
    @DisplayName("buzz whizz test")
    public void buzz_whizz_mocked() {
        //given
        FizzBuzz number = new FizzBuzz();

        //when
        String result = number.fizzbuzz(new Integer(35));

        //then
        assertThat(result, is("BuzzWhizz"));
    }

    @Test
    @DisplayName("fizz buzz whizz test")
    public void fizz_buzz_whizz_mocked() {
        //given
        FizzBuzz number = new FizzBuzz();

        //when
        String result = number.fizzbuzz(new Integer(105));

        //then
        assertThat(result, is("FizzBuzzWhizz"));
    }
}





