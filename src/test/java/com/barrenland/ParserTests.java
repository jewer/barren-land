package com.barrenland;

import org.junit.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.*;

public class ParserTests {

    Rectangle expected = new Rectangle(0, 1, 2, 3);
    Rectangle expected2 = new Rectangle(4, 5, 6, 7);

    @Test
    public void parser_should_parse_single_rectangle_from_input(){
        Parser subject = new Parser();
        String input = "{\"0 1 2 3\"}";

        List<Rectangle> actual = subject.parse(input);

        assertThat(actual.size()).isEqualTo(1);
        assertThat(actual.get(0)).isEqualToComparingFieldByField(expected);
    }

    @Test
    public void parser_should_parse_n_rectangles_from_input(){
        Parser subject = new Parser();
        String input = "{\"0 1 2 3\", \"4 5 6 7\"}";

        List<Rectangle> actual = subject.parse(input);

        assertThat(actual.size()).isEqualTo(2);
        assertThat(actual.get(0)).isEqualToComparingFieldByField(expected);
        assertThat(actual.get(1)).isEqualToComparingFieldByField(expected2);
    }
}
