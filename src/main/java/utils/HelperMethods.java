package utils;

//import com.jayway.restassured.path.json.JsonPath;
//import com.jayway.restassured.response.Response;
// 
//import java.util.*;
// 
//import static org.junit.Assert.assertEquals;

public class HelperMethods {
	
//	public static void checkStatus200(Response res) {
//		assertEquals("Status CHeck Failed!", 200, res.getStatusCode());
//	}
//	
//	public static ArrayList getVideoList(JsonPath jp) {
//		ArrayList videoIdList = jp.get("item.id");
//		return videoIdList;
//	}
//	
//	public static ArrayList getRelatedVideoIdList (JsonPath jp) {
//       
//        ArrayList relatedVideoList = jp.get("items.related.id");
//     
//        ArrayList splittedRelatedVideoList = (ArrayList) relatedVideoList.get(0);
//        return splittedRelatedVideoList;
//    }
//	
//	//Merge videoIdList and relatedVideoIdList as mergedVideoList
//    public  static ArrayList mergeLists (ArrayList videoList, ArrayList relatedVideoList){
//        ArrayList mergedVideoList = new ArrayList(videoList);
//        mergedVideoList.addAll(relatedVideoList);
//        return mergedVideoList;
//    }
//    
//
//    //Find Duplicate Videos
//    public static boolean findDuplicateVideos (List<Integer> videoIdList) {
//         for (int i=0; i< videoIdList.size(); i++) {
//            if(Collections.frequency(videoIdList, videoIdList.get(i)) > 1){
//                System.out.println("This video id is duplicated: " + videoIdList.get(i));
//                return false;
//            }
//        }
//        return true;
//    }
	
}
