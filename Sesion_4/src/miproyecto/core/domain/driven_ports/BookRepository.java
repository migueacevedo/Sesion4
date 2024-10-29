package miproyecto.core.domain.driven_ports;

import miproyecto.core.domain.Book;

public interface BookRepository {

	Book findById(Long id);

}