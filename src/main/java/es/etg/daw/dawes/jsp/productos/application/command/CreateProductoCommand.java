package es.etg.daw.dawes.jsp.productos.application.command;


import es.etg.daw.dawes.jsp.productos.domain.model.CategoriaId;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateProductoCommand {
    private String nombre;
    private double precio;
    private  CategoriaId categoriaId;
}