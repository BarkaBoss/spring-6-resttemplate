package guru.springframework.spring6resttemplate;

import guru.springframework.spring6resttemplate.model.BeerDTO;
import org.springframework.data.domain.Page;

public interface BeerClient {

    Page<BeerDTO> listBeers();
}
