package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class GanspringApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext cac=	SpringApplication.run(GanspringApplication.class, args);
	ShoeShop shop=cac.getBean("ashop",ShoeShop.class);
	System.out.println(shop.sellShoe());
	
	}

}

abstract class Shoe{}
class LeatherShoe extends Shoe{}
class SportsShoe extends Shoe{}
abstract class Factory{
public abstract Shoe makeShoe();
}
@Component("bsf")
class BataShoeFactory extends Factory{
public BataShoeFactory() {
	System.out.println("BATA shoe objected created ");
}
@Override
	public Shoe makeShoe() {
		
		return new LeatherShoe();
	}
}
@Component("lsf")
class LakhaniShoeFactory extends Factory{
public LakhaniShoeFactory() {
	System.out.println("Lakhani shoe factory object created..");

}
	
@Override
	public Shoe makeShoe() {
		
		return new SportsShoe();
	}
}
abstract class ShoeShop{
//dependency injection
@Autowired
@Qualifier("bsf")
private Factory factory;	
public Factory getFactory() {
	return factory;
}
public void setFactory(Factory factory) {
	this.factory = factory;
}
public abstract Shoe sellShoe();
}
@Component("ashop")
class AnoundShop extends ShoeShop{
public AnoundShop() {
	System.out.println("anound shoe shop object created...");
}
@Override
public Shoe sellShoe() {
	// TODO Auto-generated method stub
	System.out.println(getFactory());
	return getFactory().makeShoe();
}
}
















