package com.sjgm.question;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapVSConcurrentHashMap {

	public static Map<Integer, String> mapInit(String mapImplName) {
		Map<Integer, String> map = null;
		switch (mapImplName) {
		case "HashMap":
			map = new HashMap<Integer, String>();
			break;
		case "ConcurrentHashMap":
			map = new ConcurrentHashMap<Integer, String>();
			break;
		}
		for (int i = 1; i <= 8; i++) {
			map.put(i, "data" + i);
		}
		return map;
	}

	public static void main(String[] args) {
		/*
		 * Basic Difference between HashMap and ConcurrentHashMap is Locking
		 * concept so m explaining that
		 */

		// HASHMAP

		/*
		 * See below is HashMap , so i am going to iterate it and while
		 * iterating i want perform some different operation on same map object
		 * then lets see what's going on as we know HashMap is non-thread safe
		 */
		Map<Integer, String> hashMap = mapInit("HashMap");
		for (int key : hashMap.keySet()) {
			System.out.println(key + " " + hashMap.get(key));
			/*
			 * Now m going to remove one object based on some condition in same
			 * map
			 */
			if (key == 5) {
				hashMap.remove(key);
			}
			/*
			 * With above condition map will be iterate up to 5th bucket after
			 * that it will throw java.util.ConcurrentModificationException The
			 * Reason behind it internally HashMap apply lock on complete
			 * underlying DS, so even though it is non synchronized we can't
			 * access same map at a time.To overcome this issue sun people
			 * introduced ConcurrentHashMap in java 5 version in concurrent
			 * package
			 */
		}

		// CONCURRENTHASHMAP

		/*
		 * I explained why this map implementation came s now let's see how it
		 * works, Normally concurrentHashMap Follow Grained mechanism where it
		 * will apply lock on particular Entry of map not applied in complete
		 * Map object, so simple reason if lock is not there then concurrently
		 * we can access it, if you will gone through source code of
		 * ConcurrentHashMap every method you will get block level synchronized,
		 * not global synchronized u will find so it clearly states why we can
		 * perform concurrent action
		 */
		Map<Integer, String> concurrentHashMap = mapInit("ConcurrentHashMap");
		for (int key : hashMap.keySet()) {
			System.out.println(key + " " + hashMap.get(key));
			/*
			 * Here it will apply lock on particular bucket 5, so no restriction
			 * in iterate it will keep on going after if condition satisfy then
			 * next op will be done
			 */
			if (key == 5) {
				concurrentHashMap.remove(key);
			}
		}
	}
}
