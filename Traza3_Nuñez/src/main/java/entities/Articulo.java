package entities;


import lombok.*;

import java.util.HashSet;
import java.util.Set;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString(exclude = "promociones")
@Builder
public class Articulo {
    private Long id;
    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Imagen imagen;

//    @Builder.Default
//    private Set<Imagen> imagenes = new HashSet<>();

    @Builder.Default
    private Set<Promocion> promociones = new HashSet<>();

    private UnidadMedida unidadMedida;
}