package com.qhit.lh.gr3.hm.t8.utils;

import java.util.UUID;


/**
 * @author 侯明
 * TODO
 * 2017-12-12上午10:21:04
 */
public class IDUtil {
	
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
