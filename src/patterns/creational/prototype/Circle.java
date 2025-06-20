package patterns.creational.prototype;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Circle implements Prototype{

    private int radius;

    @Override
    public Prototype clone() {
        return new Circle(radius);
    }
}
