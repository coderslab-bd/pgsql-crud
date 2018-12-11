/**
 * 
 */
package com.coderslab.util;

import java.io.Serializable;

/**
 * ColersLab Time object to handle database field types T;
 * @author zubayer
 *
 */
public class ClTime implements Comparable<Object>, Serializable {

	private static final long serialVersionUID = 1L;
	
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	
	public ClTime() {
		super();
	}
	
	public ClTime(ClTime clTime) {
		
	}
	

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
