package service.template.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Park Ji Hong, ggikko.
 */
@RestController
public class TestControllerTwo {

    @Autowired
    private CountRepository repository;

//    @Autowired
//    private ModelMapper mapper;

    @RequestMapping(value = "/pluscount/{id}", method = GET)
    public ResponseEntity saveCount(@PathVariable("id") String id) {
        Count one = repository.findOne(Integer.valueOf(id));

            int plused = one.getNum();
            ++plused;
            one.setNum(plused);

        Count newCount = repository.save(one);
        return new ResponseEntity(newCount, HttpStatus.OK);
    }

    @RequestMapping(value = "/minuscount/{id}", method = GET)
    public ResponseEntity minusCount(@PathVariable("id") String id) {
        Count one = repository.findOne(Integer.valueOf(id));
        int minused = one.getNum() - 1;
        one.setNum(minused);
        Count newCount = repository.save(one);
        return new ResponseEntity(newCount, HttpStatus.OK);
    }

    @RequestMapping(value = "/count/{id}", method = GET)
    public ResponseEntity showCount(@PathVariable("id") String id) {
        Count one = repository.findOne(Integer.valueOf(id));
        return new ResponseEntity(one, HttpStatus.OK);
    }

}
