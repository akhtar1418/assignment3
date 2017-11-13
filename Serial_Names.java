package com.telusko.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Serial_Names
{
			public String retrieve(int snum)
			{
				String name="";
				Map<Integer,String> values=new HashMap<>();
				values.put(100,"Navin");
				values.put(101,"Shamim");
				values.put(102,"Suman");
				values.put(103,"Biswarup");
				values.put(104,"Ram");
				values.put(105,"Archana");
				values.put(106,"Ujwala");
				values.put(107,"Sivaram");
				values.put(108,"Manihas");
				values.put(109,"Shekhar");
				values.put(110,"Danish");
				values.put(111,"Ershad");
			Set<Integer>keys=values.keySet();
				
				for(int key : keys)
				{
					if (key==snum)
						name=values.get(key);
				}
			return name;
			}
}
