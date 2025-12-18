@Entity
public class Location {
    @Id @GeneratedValue
    private Long id;

    private String name;
    private Double latitude;
    private Double longitude;
}
