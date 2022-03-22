package Designs.SnakeAndLadders.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public class Ladder extends Cell{
    private Integer endIndex;

    @Override
    public Integer getNextPosition() {
        return endIndex;
    }
}
