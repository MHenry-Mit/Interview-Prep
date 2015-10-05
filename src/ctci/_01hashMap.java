package ctci;

import java.util.Arrays;

/*Implementation of Hash Map Data Structure*/
public class _01hashMap {
	private String[] list=new String[20];
	private int totalElements=0;
	public _01hashMap() {
		Arrays.fill(list,null);
	}
	public int hashFunctionEncode(String str){
		System.out.println(list.length-1+"||||||"+totalElements);
		if(totalElements==list.length-1){
			System.out.println(totalElements);
			Arrays.copyOf(list,(int)(list.length*1.5));
		}
		int index=str.hashCode()%(list.length-1);
		return index;
	}
	public boolean put(String key,String value){
		int indexToUse=(int)Math.abs(hashFunctionEncode(key));
		if(list[indexToUse]!=null)
			return false;
		else
			list[indexToUse]=value;
		totalElements++;
		return true;
	}
	public String get(String key){
		int indexToUse=(int)Math.abs(hashFunctionDecode(key));
		if(indexToUse>list.length)
			return  null;
		return list[indexToUse];
	}
	public int hashFunctionDecode(String key){
		return (int)(Math.abs(key.hashCode()%(list.length-1)));
	}
	public boolean delete(String key){
		 if(list[hashFunctionDecode(key)]!=null?true:false){
			 list[hashFunctionDecode(key)]=null;
		 		return true;
		 }
		 return false;
	}
	
	public String toString(){
		StringBuffer returnString=new StringBuffer();
		for (int i = 0; i < list.length; i++) {
			if(list[i]!=null)
				returnString.append("Index : "+i+"|||value :"+list[i]+"\n");
		}
		return returnString.toString();
	}
}
