package patterns.creational.prototype;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Square implements Prototype{

    private int side;

    @Override
    public Prototype clone() {
        return new Square(side);
    }
}
