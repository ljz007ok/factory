package com.gupao.factory.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		DzAbstractFactory.getInstance().createCar();
		DzAbstractFactory.getInstance().createTransmission();
		FtAbstractFactory.getInstance().createCar();
		FtAbstractFactory.getInstance().createTransmission();
		TyAbstractFactory.getInstance().createCar();
		TyAbstractFactory.getInstance().createTransmission();
	}

}
