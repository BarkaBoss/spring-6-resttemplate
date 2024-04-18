package guru.springframework.spring6resttemplate;

import guru.springframework.spring6resttemplate.model.BeerDTO;
import guru.springframework.spring6resttemplate.model.BeerDtoPageImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class BeerClientImpl implements BeerClient {


    private final RestTemplateBuilder restTemplateBuilder;
    private static final String GET_BEER_PATH = "/api/v1/beer";
    @Override
    public Page<BeerDTO> listBeers() {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<BeerDtoPageImpl> response = restTemplate
                .getForEntity(GET_BEER_PATH, BeerDtoPageImpl.class);

        return response.getBody();
    }
}
