package com.stratergy.desing.pattern.duck;

import com.stratergy.desing.pattern.fly.FlyNoWay;
import com.stratergy.desing.pattern.quack.Squeak;

public class RubberDuck extends Duck{

	public RubberDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Squeak();
	}

	public void display() {
		System.out.println("RubberDuck");
	}

}
