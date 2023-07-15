import java.util.* ;
import java.io.*; 

public class LFUCache {
	LinkedHashMap<Integer,Integer> map;
	int size;
	LFUCache(int capacity) {
		// Write your code here.
		size=capacity;
		map=new LinkedHashMap<>();
	}
	void makeRecent(int key,int value)
	{
		map.remove(key);
		map.put(key,value);
	}
	int get(int key) {
		// Write your code here.
		if(map.containsKey(key))
		{
			int x=map.get(key);
			makeRecent(key,x);
			return x;
		}
		return -1;
	}

	void put(int key, int value) {
		// Write your code here.
		map.put(key,value);
		makeRecent(key, value);
		if(map.size()>size)
		{
			for(int x:map.keySet())
			{
				map.remove(x);
				break;
			}
		}
	}
}
