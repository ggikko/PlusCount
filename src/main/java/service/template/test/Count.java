package service.template.test;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Park Ji Hong, ggikko.
 */
@Entity
@AllArgsConstructor
public class Count {

    @Id
    private int id;

    private int num;

    public Count(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
