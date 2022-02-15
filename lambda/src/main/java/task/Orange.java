package task;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder              // generates @AllArgsConstructor unless there is another @XConstructor
public class Orange {
    private int weight;
    private Color color;

}
