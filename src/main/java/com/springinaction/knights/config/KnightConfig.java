//package com.springinaction.knights.config;
//
//import com.springinaction.kights.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class KnightConfig {
//    @Bean
//    public Knight knight() {
//        return new BraveKight(quest(), minstrel());
//    }
//
//    @Bean
//    public Quest quest() {
//        return new SlayDragonQuest(System.out);
//    }
//
//    @Bean
//    public Minstrel minstrel() {
//        return new Minstrel(System.out);
//    }
//}
