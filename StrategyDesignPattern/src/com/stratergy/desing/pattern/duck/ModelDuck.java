package com.stratergy.desing.pattern.duck;

import com.stratergy.desing.pattern.fly.FlyWithWings;
import com.stratergy.desing.pattern.quack.Quack;

public class ModelDuck extends Duck{

	public ModelDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}

	public void display() {
		System.out.println("ModelDuck");
	}

}
