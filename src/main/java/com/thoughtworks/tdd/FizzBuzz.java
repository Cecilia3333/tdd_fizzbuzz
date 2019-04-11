package com.thoughtworks.tdd;

/**
 * Created by twer on 3/28/14.
 */
public class FizzBuzz {
    public void begin(){
        for(int i = 0;i < 120;i++){
            String result = fizzbuzz(i+1);
            System.out.println(result);
        }
    }
    public String fizzbuzz(Integer i) {
        String result = "";
        boolean flag = false;
        if(i % 3 == 0){
            result = Status.FIZZ;
            flag = true;
        }
        if(i % 5 == 0){
            result += Status.BUZZ;
            flag = true;
        }
        if(i % 7 == 0){
            result += Status.WHIZZ;
            flag = true;
        }
        if(flag == false){
            result = i.toString();
        }
        return result;
    }
}
