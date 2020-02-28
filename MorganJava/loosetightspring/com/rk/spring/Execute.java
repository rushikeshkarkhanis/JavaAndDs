package com.rk.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rk.spring.BinarySearchImpl;
import com.rk.spring.Execute;

@SpringBootApplication
public class Execute {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(Execute.class, args);

		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl2 = applicationContext.getBean(BinarySearchImpl.class);

		for (String bean : applicationContext.getBeanDefinitionNames()) {
			System.out.println(bean);
		}
		// TODO Auto-generated method stub

		// In context of Spring

		// What are beans?

		// What are the dependencies of the beans

		// Where to search for Beans

		// This will be done by Spring
		// BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new
		// BubbleSortAlgo());

		// This will be done by spring
		// BinarySearchImpl binarySearchImpl2 = new BinarySearchImpl(new
		// QuikSortAlgo());

		int result = binarySearchImpl.binarySearch(new int[] { 12, 5, 19, 10 }, 3);

		int result2 = binarySearchImpl2.binarySearch(new int[] { 12, 5, 19, 10 }, 3);
		System.out.println(binarySearchImpl);
		System.out.println(binarySearchImpl2);
		System.out.println(result);
		System.out.println(result2);
	}

}
