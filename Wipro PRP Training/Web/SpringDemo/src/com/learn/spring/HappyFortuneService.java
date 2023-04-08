package com.learn.spring;
import java.util.*;
public class HappyFortuneService implements FortuneService {
	public int getFortune() {
		int a[]= {1,2,3};
		int rnd=new Random().nextInt(a.length);
		int res=a[rnd];
		return res;
	}
}
