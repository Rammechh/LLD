package Designs.SnakeAndLadders.Models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
public abstract class Cell {

    private Integer index;
    private CellType type;
    private List<Piece> pieces = new ArrayList<>();

    public abstract Integer getNextPosition();

   public void removePiece(){

   }
   public void addPiece(){

   }
}
