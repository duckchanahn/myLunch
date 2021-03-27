package service;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class zipcodeService {

    @Value("${juso.api.confmKey}")
    private String confmKey;

    public String addressTozipCode(String address) { // juso.go.kr api를 활용하여 우편번호 받아오기
        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        params.add("confmKey", confmKey);
        params.add("currentPage", 1);
        params.add("countPerPage", 5);
        params.add("keyword", address);
        params.add("resultType", "json");

        RestTemplate juso = new RestTemplate();
        String juso_result = juso.postForObject("https://www.juso.go.kr/addrlink/addrLinkApi.do", params, String.class);

//        System.out.println(juso_result);
        JSONParser parser = new JSONParser();
        JSONObject juso_json = null;
        try {
            Object obj = parser.parse(juso_result);

            juso_json = (JSONObject) obj;
        } catch (Exception e) {e.printStackTrace();}

        JSONObject issues3 = (JSONObject) juso_json.get("results");
        JSONArray issues = (JSONArray) issues3.get("juso");
        JSONObject issues0 = (JSONObject) issues.get(0);

        String zipcode = (String)issues0.get("zipNo");

        System.out.println("address : " + address + '\n' + "우편번호 : " + (String)issues0.get("zipNo"));
        return zipcode;
    }


}
