package com.gupao.factory.simplefactory;

import com.gupao.factory.product.DzCar;
import com.gupao.factory.product.FtCar;
import com.gupao.factory.product.TyCar;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		try {
			SimpleFactory.create(DzCar.class);//生产大众汽车
			SimpleFactory.create(TyCar.class);//生产通用汽车
			SimpleFactory.create(FtCar.class);//生产福特汽车
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
