@Entity
public class RouteOptimizationResult {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Shipment shipment;

    private Double optimizedDistanceKm;
    private Double estimatedFuelUsageL;
    private LocalDateTime generatedAt;

    @PrePersist
    public void onCreate() {
        generatedAt = LocalDateTime.now();
    }
}
