package es.etg.daw.dawes.jsp.productos.application.usecase;

import org.springframework.stereotype.Service;

import es.etg.daw.dawes.jsp.productos.application.command.CreateProductoCommand;
import es.etg.daw.dawes.jsp.productos.domain.model.Producto;
import es.etg.daw.dawes.jsp.productos.domain.repository.ProductoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateProductoUseCase {

	private final ProductoRepository productoRepository;

	

	public Producto create(CreateProductoCommand comando) {

		// Se puede usar comando.id() y no getId() por usar @Accessors(fluent = true)
		// en la clase CreateProductoCommand

		Producto producto = Producto.builder()
				.nombre(comando.getNombre())
				.precio(comando.getPrecio())
				.categoriaId(comando.getCategoriaId()).build();
		
		return productoRepository.save(producto);

	}
}