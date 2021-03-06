import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(maxLength("bbb"));

	}
	@Test
	public void test1(){
		
		int res = maxLength("bbb");
		assertEquals(1, res);
	}
	@Test
	public void test2(){
		
		int res = maxLength("abcabcbb");
		assertEquals(3, res);
	}
	@Test
	public void test3(){
		
		int res = maxLength("");
		assertEquals(0, res);
	}
	@Test
	public void test4(){
		StringBuffer b = new StringBuffer();
		for(int i=0;i<30000;i++){
			b.append("s");
		}
		int res = maxLength(b.toString());
		assertEquals(1, res);
	}
	public void test5(){
		
		int res = maxLength("abc");
		assertEquals(3, res);
	}
	
	
	public static int maxLength(String str){  
        if(str==null||str.equals("")){  
            return 0;  
        }  
        Set<Character> set=new HashSet<Character>();  
        int maxLength=0;  
        int pre=0;  
        int after=0;  
        while(after<str.length()){  
            if(!set.contains(str.charAt(after))){  
                set.add(str.charAt(after));  
                after++;  
            }else{  
                set.clear();  
                //System.out.println("pre:  "+pre+"  after:  "+after);  
                if((after-pre)>maxLength){  
                    maxLength=after-pre;  
                }  
                pre++;  
                after=pre;  
            }  
        }  
          
        if((after-pre)>maxLength){  
            maxLength=after-pre;  
        }  
        return maxLength;  
    }  
}
