package com.dessert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("cold")  //수식자
//@Qualifier("creamy")    //동일한 유형의 여러 애너테이션이 같은 항목에 반복 불가
@Cold
@Creamy
public class IceCream implements Dessert{
    private Dessert dessert;

    @Autowired
    //@Primary
    //@Qualifier("iceCream")    //빈 ID
    //@Qualifier("cold")  //수식자
    @Cold
    @Creamy
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Bean
    //@Primary
    //@Qualifier("cold")  //수식자
    public Dessert inceCream() {
        return new IceCream();
    }
}
