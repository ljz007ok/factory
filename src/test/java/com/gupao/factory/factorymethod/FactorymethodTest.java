package com.gupao.factory.factorymethod;

public class FactorymethodTest {

	public static void main(String[] args) {
		try {
			DzFactory.getInstance().create();
			FtFactory.getInstance().create();
			TyFactory.getInstance().create();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
