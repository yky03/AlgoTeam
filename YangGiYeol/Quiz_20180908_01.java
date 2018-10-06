import java.util.ArrayList;

class Solution {
   
public static final int cache_hit = 1;
public static final int cache_miss = 5;
    
  public int solution(int cacheSize, String[] cities) {
     ArrayList<String> list = new ArrayList<>();
      int answer = 0;
      
      if (cacheSize == 0) {
			return cache_miss * cities.length;
		} else {
			for(int i=0; i<cities.length; i++) {
				
					if(list.contains(cities[i].toLowerCase())) { //배열에 값이 존재하면 캐시히트후 배열 해당인덱스 지우고 뒤에 삽입 , 캐시히트 시간 더하기
						answer+=cache_hit;
						list.remove(cities[i].toLowerCase());
						list.add(cities[i].toLowerCase());
					} else {
						answer+=cache_miss;
						if(list.size()>=cacheSize && !list.contains(cities[i].toLowerCase())){
						list.remove(0);
						}
						list.add(cities[i].toLowerCase());
					}
				
			}
		}
      
      return answer;
  }
}
