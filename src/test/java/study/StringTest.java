package study;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        System.out.println(actual);
        assertThat(actual).isEqualTo("adc");
    }

    //요구사항 1
    @Test
    void split(){

        String[] act = "1,2".split(",");
        assertThat(act).contains("1");
        assertThat(act).contains("2");
    }
    @Test
    void split2(){
        //요구사항 2 "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.
        String act = "(1,2)";
        String answer = act.substring(1,4);
        assertThat(answer).contains("1,2");
    }



}

