package com.gupao.factory.simplefactory;

import com.gupao.factory.product.DzCar;
import com.gupao.factory.product.ICar;

/**
 * 简单工厂类
 * @author ljz
 *
 */
public class SimpleFactory {
	public static ICar create(String fullClassName) throws Exception {
		ICar car = null;
		if(fullClassName.equals("com.gupao.factory.product.DzCar") ||
				fullClassName.equals("com.gupao.factory.product.TyCar") ||
				fullClassName.equals("com.gupao.factory.product.FtCar")) {
			car = (ICar) Class.forName(fullClassName).newInstance();
		}else {
			throw new Exception("没有符合的产品");
		}
		return car;
	}
	
	public static ICar create(Class cls) throws Exception {
		return (ICar) create(cls.getName());
	}
	
	public static void main(String[] args) {
		try {
			//SimpleFactory.create("com.gupao.factory.product.DzCar");
			Class.forName(DzCar.class.getName()).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
