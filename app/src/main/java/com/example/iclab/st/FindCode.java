package com.example.iclab.st;

import org.json.JSONException;
import org.json.JSONObject;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;

// 지역으로 찾기 액티비티
public class FindCode{
    LinkedHashMap<String, String> map;

    public String finder(String str,String value){
        URLAsyncTask task = new URLAsyncTask();
        URL url = null;
        try {
            url = new URL("http://www.kma.go.kr/DFSROOT/POINT/DATA/leaf."+value+ ".json.txt");
            task.execute(url);
            map=task.get();
            map.values();
            return map.get(str);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String kmaJson(String in){
        String mdlData="{\"11\":\"서울특별시\",\"44\":\"충청남도\",\"45\":\"전라북도\",\"46\":\"전라남도\",\"47\":\"경상북도\",\"26\":\"부산광역시\",\"48\":\"경상남도\",\"27\":\"대구광역시\",\"28\":\"인천광역시\",\"29\":\"광주광역시\",\"50\":\"제주특별자치도\",\"30\":\"대전광역시\",\"41\":\"경기도\",\"31\":\"울산광역시\",\"42\":\"강원도\",\"43\":\"충청북도\",\"강남구\":\"11680\",\"성주군\":\"47840\",\"목포시\":\"46110\",\"성남시수정구\":\"41131\",\"거제시\":\"48310\",\"성북구\":\"11290\",\"칠곡군\":\"47850\",\"성남시분당구\":\"41135\",\"진천군\":\"43750\",\"장흥군\":\"46800\",\"김포시\":\"41570\",\"논산시\":\"44230\",\"남원시\":\"45190\",\"마포구\":\"11440\",\"북구\":\"27230\",\"평택시\":\"41220\",\"창원시\":\"48110\",\"여주군\":\"41730\",\"영주시\":\"47210\",\"정선군\":\"42770\",\"화성시\":\"41590\",\"문경시\":\"47280\",\"해운대구\":\"26350\",\"용산구\":\"11170\",\"김제시\":\"45210\",\"증평군\":\"43745\",\"태안군\":\"44825\",\"사하구\":\"26380\",\"순천시\":\"46150\",\"양구군\":\"42800\",\"예산군\":\"44810\",\"옥천군\":\"43730\",\"완주군\":\"45710\",\"강서구\":\"11500\",\"기장군\":\"26710\",\"연제구\":\"26470\",\"청송군\":\"47750\",\"남양주시\":\"41360\",\"춘천시\":\"42110\",\"합천군\":\"48890\",\"부산진구\":\"26230\",\"여수시\":\"46130\",\"양주시\":\"41630\",\"홍성군\":\"44800\",\"괴산군\":\"43760\",\"가평군\":\"41820\",\"철원군\":\"42780\",\"통영시\":\"48220\",\"광진구\":\"11215\",\"홍천군\":\"42720\",\"파주시\":\"41480\",\"당진군\":\"44830\",\"함양군\":\"48870\",\"구로구\":\"11530\",\"단양군\":\"43800\",\"중구\":\"28110\",\"부여군\":\"44760\",\"금산군\":\"44710\",\"청양군\":\"44790\",\"부안군\":\"45800\",\"유성구\":\"30200\",\"경주시\":\"47130\",\"의정부시\":\"41150\",\"강북구\":\"11305\",\"김해시\":\"48250\",\"영천시\":\"47230\",\"영덕군\":\"47770\",\"수성구\":\"27260\",\"영동군\":\"43740\",\"봉화군\":\"47920\",\"아산시\":\"44200\",\"보성군\":\"46780\",\"청도군\":\"47820\",\"광주시\":\"41610\",\"임실군\":\"45750\",\"화천군\":\"42790\",\"사상구\":\"26530\",\"광양시\":\"46230\",\"서천군\":\"44770\",\"부천시소사구\":\"41197\",\"영암군\":\"46830\",\"부평구\":\"28237\",\"동구\":\"28140\",\"고양시일산서구\":\"41287\",\"서산시\":\"44210\",\"노원구\":\"11350\",\"김천시\":\"47150\",\"의령군\":\"48720\",\"창녕군\":\"48740\",\"포항시남구\":\"47111\",\"수원시장안구\":\"41111\",\"의성군\":\"47730\",\"연수구\":\"28185\",\"영광군\":\"46870\",\"울릉군\":\"47940\",\"전주시덕진구\":\"45113\",\"고양시덕양구\":\"41281\",\"전주시완산구\":\"45111\",\"강화군\":\"28710\",\"종로구\":\"11110\",\"영등포구\":\"11560\",\"동래구\":\"26260\",\"성남시중원구\":\"41133\",\"용인시기흥구\":\"41463\",\"진안군\":\"45720\",\"부천시오정구\":\"41199\",\"양평군\":\"41830\",\"구미시\":\"47190\",\"보은군\":\"43720\",\"신안군\":\"46910\",\"달성군\":\"27710\",\"도봉구\":\"11320\",\"금천구\":\"11545\",\"무주군\":\"45730\",\"군위군\":\"47720\",\"대덕구\":\"30230\",\"천안시동남구\":\"44131\",\"정읍시\":\"45180\",\"시흥시\":\"41390\",\"은평구\":\"11380\",\"경산시\":\"47290\",\"해남군\":\"46820\",\"달서구\":\"27290\",\"청주시흥덕구\":\"43113\",\"상주시\":\"47250\",\"고창군\":\"45790\",\"포항시북구\":\"47113\",\"화순군\":\"46790\",\"함평군\":\"46860\",\"영도구\":\"26200\",\"강동구\":\"11740\",\"청원군\":\"43710\",\"순창군\":\"45770\",\"과천시\":\"41290\",\"계양구\":\"28245\",\"옹진군\":\"28720\",\"마산시\":\"48160\",\"수원시영통구\":\"41117\",\"고흥군\":\"46770\",\"진주시\":\"48170\",\"광산구\":\"29200\",\"동작구\":\"11590\",\"이천시\":\"41500\",\"원주시\":\"42130\",\"하동군\":\"48850\",\"동해시\":\"42170\",\"구례군\":\"46730\",\"군산시\":\"45130\",\"영양군\":\"47760\",\"계룡시\":\"44250\",\"부천시원미구\":\"41195\",\"연천군\":\"41800\",\"군포시\":\"41410\",\"나주시\":\"46170\",\"인제군\":\"42810\",\"담양군\":\"46710\",\"성동구\":\"11200\",\"수영구\":\"26500\",\"금정구\":\"26410\",\"안양시만안구\":\"41171\",\"예천군\":\"47900\",\"양천구\":\"11470\",\"안산시상록구\":\"41271\",\"익산시\":\"45140\",\"관악구\":\"11620\",\"평창군\":\"42760\",\"광명시\":\"41210\",\"보령시\":\"44180\",\"서초구\":\"11650\",\"제주시\":\"50110\",\"의왕시\":\"41430\",\"사천시\":\"48240\",\"양산시\":\"48330\",\"태백시\":\"42190\",\"용인시수지구\":\"41465\",\"무안군\":\"46840\",\"완도군\":\"46890\",\"안동시\":\"47170\",\"남해군\":\"48840\",\"천안시서북구\":\"44133\",\"포천시\":\"41650\",\"강진군\":\"46810\",\"고성군\":\"42820\",\"곡성군\":\"46720\",\"고령군\":\"47830\",\"함안군\":\"48730\",\"청주시상당구\":\"43111\",\"울주군\":\"31710\",\"양양군\":\"42830\",\"오산시\":\"41370\",\"음성군\":\"43770\",\"송파구\":\"11710\",\"밀양시\":\"48270\",\"공주시\":\"44150\",\"장수군\":\"45740\",\"하남시\":\"41450\",\"안산시단원구\":\"41273\",\"진해시\":\"48190\",\"구리시\":\"41310\",\"장성군\":\"46880\",\"수원시권선구\":\"41113\",\"동대문구\":\"11230\",\"중랑구\":\"11260\",\"서구\":\"28260\",\"연기군\":\"44730\",\"속초시\":\"42210\",\"남구\":\"28170\",\"충주시\":\"43130\",\"제천시\":\"43150\",\"강릉시\":\"42150\",\"안양시동안구\":\"41173\",\"고양시일산동구\":\"41285\",\"영월군\":\"42750\",\"거창군\":\"48880\",\"용인시처인구\":\"41461\",\"서대문구\":\"11410\",\"울진군\":\"47930\",\"동두천시\":\"41250\",\"안성시\":\"41550\",\"수원시팔달구\":\"41115\",\"삼척시\":\"42230\",\"남동구\":\"28200\",\"진도군\":\"46900\",\"서귀포시\":\"50130\",\"횡성군\":\"42730\",\"산청군\":\"48860\"}";

        JSONObject tempJSON = null;
        try {
            tempJSON = new JSONObject(mdlData);
            return tempJSON.getString(in);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
