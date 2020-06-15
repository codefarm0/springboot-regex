package com.greenlearner.springbootregex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
@RestController
public class RegexController {


    @GetMapping("**")
    String case1(){
        return "**";
    }

    @GetMapping("test/**")
    String case2(){
        return "test/**";
    }

    //test/green
    //test/geeen
    @GetMapping("test/g?een")
    String case3(){
        return "test/g?een";
    }
//
//    @GetMapping("path/{name}")
//    String case4(@PathVariable("name") String name){
//        return "path/{name} ---"  + name;
//    }
//
//    @GetMapping("path/{name:[a-z]+}")
//    String case5(@PathVariable("name") String name){
//        return "path/{name:[a-z]} ---"  + name;
//    }
//
//    @GetMapping("path/{name:\\d+}")
//    String case6(@PathVariable("name") String name){
//        return "path/{name:\\d+} ---"  + name;
//    }
    @GetMapping("path/number_{name:\\d+}")
    String case7(@PathVariable("name") String name){
        return "path/number_{name:\\d+} ---"  + name;
    }

    @GetMapping("path/{name1}_{name:\\d+}")
    String case8(@PathVariable("name1") String name1, @PathVariable("name") String name2){
        return "path/{name1}_{name2:[A-Z]+} ---"  + name1 + "-- " + name2;
    }

    @GetMapping(value = {"/test1","/test2","/test3"})
    String case9(){
        return "case9";

    }
}
