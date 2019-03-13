package com.gupao.factory.factorymethod;

import com.gupao.factory.product.DzCar;
import com.gupao.factory.product.ICar;

/**
 * 大众汽车工厂实现类
 * @author ljz
 *
 */
public class DzFactory implements IFactory {
	//volatile解决多线程直接操作变量的可见性
	//如果不用volatile关键字修饰，则flag变量被a1线程修改后，其它线程可能不会马上发现到值改变了
	public static volatile boolean flag = true;
	
	private DzFactory() {
		synchronized (DzFactory.class) {
			if(flag == true) {
				flag = !flag;
			}else {
				throw new RuntimeException("单例模式被反射破坏");
			}
		}
	}
	
	private static final IFactory dzFactory = new DzFactory();
	
	public static IFactory getInstance(){
		return dzFactory;
	}

	public ICar create() throws Exception {
		return DzCar.class.newInstance();
	}

}
