package com.dessert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("cold")
//@Qualifier("fruity")  //동일한 유형의 여러 애너테이션이 같은 항목에 반복 불가
@Cold
@Fruity
public class Popsicle implements Dessert {
    private Dessert dessert;

    @Cold
    @Fruity
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
