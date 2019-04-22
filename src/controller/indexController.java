package controller;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sun.javafx.collections.MappingChange.Map;

import entity.Inning;
import entity.Rain;
import entity.Riverlevel;
import entity.Ssflows;
import entity.Sslevels;
import entity.Waterlevel;
import redis.clients.jedis.Jedis;
import util.NewRedis;
import service.InningService;
import service.RainService;
import service.RiverlevelService;
import service.SsflowsService;
import service.SslevelsService;
import service.WaterlevelService;

@Controller
public class indexController {
	@Autowired  
	private RainService rs ; 	
	public RainService getRs() {
		return rs;
	}
	public void setRs(RainService rs) {
		this.rs = rs;
	}
	@Autowired  
	private RiverlevelService rls ;
	public RiverlevelService getRls() {
		return rls;
	}
	public void setRls(RiverlevelService rls) {
		this.rls = rls;
	}
	@Autowired 
	private WaterlevelService ls ;
	public WaterlevelService getLs() {
		return ls;
	}

	public void setLs(WaterlevelService ls) {
		this.ls = ls;
	}
	public SsflowsService getSsf() {
		return ssf;
	}
	public void setSsf(SsflowsService ssf) {
		this.ssf = ssf;
	}
	@Autowired 
	private  SslevelsService sls;
	@Autowired 
	private SsflowsService ssf;
	@Autowired 
	private InningService isc ;
	public InningService getIsc() {
		return isc;
	}
	public void setIsc(InningService isc) {
		this.isc = isc;
	}
	public SslevelsService getSls() {
		return sls;
	}
	public void setSls(SslevelsService sls) {
		this.sls = sls;
	}
	@RequestMapping("/todayrain.do")
	public @ResponseBody void testrain(HttpServletRequest request,HttpServletResponse response) throws JSONException, UnsupportedEncodingException, IOException{
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		Date today =  new Date();
		Date yestoday = getNextDay(today,-1);
		List<Rain> lr = rs.Allrain(yestoday);
		JSONArray jar = new JSONArray();
		for (Rain r :lr){
			JSONObject json = new JSONObject();
			json.put("name", r.getName());
			json.put("day", r.getDay());
			json.put("weather", r.getWeather());
			json.put("xun", r.getXun());
			json.put("month", r.getMonth());
			json.put("inserttime", f.format(r.getInserttime()));
			jar.put(json);
		}
	
		OutputStream os = response.getOutputStream();
		os.write(jar.toString().getBytes("UTF-8"));
		os.flush();
	}
	public static Date getNextDay(Date date,int i) {  
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        calendar.add(Calendar.DAY_OF_MONTH, i);  
        date = (Date) calendar.getTime();  
        return date;  
    }  
	@SuppressWarnings("deprecation")
	@RequestMapping("/stationrain.do")
	public @ResponseBody void stationrain(HttpServletRequest request,HttpServletResponse response) throws JSONException, UnsupportedEncodingException, IOException{
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String name =request.getParameter("stationname");
		//String name = new String(request.getParameter("stationname").getBytes("iso-8859-1"), "utf-8");  
		String startstr = request.getParameter("start");
		String endstr = request.getParameter("end");

		Date end = new Date();
		try {
			end = f.parse(endstr);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Date start= new Date();
		try {
			start = f.parse(startstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		List<Rain> lr = rs.stationrain(name,start,end);
		JSONArray jar = new JSONArray();
		for (Rain r :lr){
			JSONObject json = new JSONObject();
			json.put("name", r.getName());
			json.put("day", r.getDay());
			json.put("weather", r.getWeather());
			json.put("xun", r.getXun());
			json.put("month", r.getMonth());
			json.put("inserttime", f.format(r.getInserttime()));
			jar.put(json);
		}
	
		OutputStream os = response.getOutputStream();
		os.write(jar.toString().getBytes("UTF-8"));
		os.flush();
	}
	@RequestMapping("/todaywater.do")
	public @ResponseBody void testriver(HttpServletRequest request,HttpServletResponse response) throws JSONException, UnsupportedEncodingException, IOException{
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		Date today =  new Date();
		Date yestoday = getNextDay(today,-1);
		List<Riverlevel> lr = rls.AllRiverlevel(yestoday);
		JSONArray jar = new JSONArray();
		for (Riverlevel r :lr){
			JSONObject json = new JSONObject();
			json.put("rivername", r.getRivername());
			json.put("stationname", r.getStationname());
			json.put("protectlevel", r.getProtectlevel());
			json.put("alertlevel", r.getAlertlevel());
			json.put("todaylevel", r.getTodaylevel());
			json.put("leceldiff", r.getLeceldiff());
			json.put("flow", r.getFlow());
			json.put("sluicelevel", r.getSluicelevel());
			json.put("sluicediff", r.getSluicediff());
			json.put("sluiceopen", r.getSluiceopen());
			json.put("changjiangtop", r.getChangjiangtop());
			json.put("changjiangtime", r.getChangjiangtime());
			json.put("rivertop", r.getRivertop());
			json.put("rivertoptime", r.getRivertoptime());
			json.put("inserttime", f.format(r.getInserttime()));
			jar.put(json);
		}
	
		OutputStream os = response.getOutputStream();
		os.write(jar.toString().getBytes("UTF-8"));
		os.flush();
	}
	@SuppressWarnings("deprecation")
	@RequestMapping("/stationriver.do")
	public @ResponseBody void stationriver(HttpServletRequest request,HttpServletResponse response) throws JSONException, UnsupportedEncodingException, IOException{
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String name = request.getParameter("name");  
		String startstr = request.getParameter("start");
		String endstr = request.getParameter("end");

		Date end = new Date();
		try {
			end = f.parse(endstr);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Date start= new Date();
		try {
			start = f.parse(startstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		List<Riverlevel> lr = rls.stationRiverlevel(name,start,end);
		JSONArray jar = new JSONArray();
		for (Riverlevel r :lr){
			JSONObject json = new JSONObject();
			json.put("rivername", r.getRivername());
			json.put("stationname", r.getStationname());
			json.put("protectlevel", r.getProtectlevel());
			json.put("alertlevel", r.getAlertlevel());
			json.put("todaylevel", r.getTodaylevel());
			json.put("leceldiff", r.getLeceldiff());
			json.put("flow", r.getFlow());
			json.put("sluicelevel", r.getSluicelevel());
			json.put("sluicediff", r.getSluicediff());
			json.put("sluiceopen", r.getSluiceopen());
			json.put("changjiangtop", r.getChangjiangtop());
			json.put("changjiangtime", r.getChangjiangtime());
			json.put("rivertop", r.getRivertop());
			json.put("rivertoptime", r.getRivertoptime());
			json.put("inserttime", f.format(r.getInserttime()));
			jar.put(json);
		}
	
		OutputStream os = response.getOutputStream();
		os.write(jar.toString().getBytes("UTF-8"));
		os.flush();
	}
	@SuppressWarnings("deprecation")
	@RequestMapping("/stationlake.do")
	public @ResponseBody void stationlake(HttpServletRequest request,HttpServletResponse response) throws JSONException, UnsupportedEncodingException, IOException{
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String startstr = request.getParameter("start");
		String endstr = request.getParameter("end");
		Date end = new Date();
		try {
			end = f.parse(endstr);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		Date start= new Date();
		try {
			start = f.parse(startstr);
		} catch (ParseException e) {
			e.printStackTrace();
		}	
		
		List<Waterlevel> lr = ls.stationlakelevel(start,end);
		JSONArray jar = new JSONArray();
		for (Waterlevel r :lr){
			JSONObject json = new JSONObject();
			json.put("xianname", r.getXianname());
			json.put("lakename", r.getLakename());
			json.put("todaylevel", r.getTodaylevel());
			json.put("leveldiff", r.getLeveldiff());
			json.put("storage", r.getStorage());
			json.put("yihong", r.getYihong());
			json.put("xiehong", r.getXiehong());
			json.put("guangai", r.getGuangai());
			json.put("shushui", r.getShushui());
			json.put("fadiandong", r.getFadiandong());
			json.put("flow", r.getFlow());
			json.put("controllevel", r.getControllevel());
			json.put("topper", r.getTopper());
			json.put("toppertime", r.getToppertime());
			json.put("inserttime", f.format(r.getInserttime()));
			jar.put(json);
		}
	
		OutputStream os = response.getOutputStream();
		os.write(jar.toString().getBytes("UTF-8"));
		os.flush();
	}
	@RequestMapping("/getzhen.do")
	public @ResponseBody void getzhen(HttpServletRequest request,HttpServletResponse response) throws JSONException, UnsupportedEncodingException, IOException{
		List<Inning> ls = isc.ZhenList();
		JSONArray jar = new JSONArray();
		for (Inning r :ls){
			JSONObject json = new JSONObject();
			json.put("zhen", r.getZhen());
			json.put("zhenname", r.getZhenname());
			jar.put(json);
		}
	
		OutputStream os = response.getOutputStream();
		os.write(jar.toString().getBytes("UTF-8"));
		os.flush();
	}
	@RequestMapping("/Zhendata.do")
	public @ResponseBody void getratedate(HttpServletRequest request,HttpServletResponse response) throws JSONException, UnsupportedEncodingException, IOException{
		String zhen = request.getParameter("zhen");
		List<Inning> ls = isc.Zhendata(zhen);
		JSONArray jar = new JSONArray();
		for (Inning r :ls){
			JSONObject json = new JSONObject();
			json.put("dlbm", r.getDlbm());
			json.put("dlmc", r.getDlmc());
			json.put("areaha", r.getAreaha());
			jar.put(json);
		}
	
		OutputStream os = response.getOutputStream();
		os.write(jar.toString().getBytes("UTF-8"));
		os.flush();
	}
	@RequestMapping("/rainstation.do")
	public @ResponseBody void rainstation(HttpServletRequest request,HttpServletResponse response) throws JSONException, UnsupportedEncodingException, IOException{
		//String zhen = request.getParameter("zhen");
		List<Rain> ls = rs.getrainstation();
		JSONArray jar = new JSONArray();
		for (Rain r :ls){
			JSONObject json = new JSONObject();
			json.put("name", r.getName());
			jar.put(json);
		}
	
		OutputStream os = response.getOutputStream();
		os.write(jar.toString().getBytes("UTF-8"));
		os.flush();
	}
	@RequestMapping("/riverstation.do")
	public @ResponseBody void riverstation(HttpServletRequest request,HttpServletResponse response) throws JSONException, UnsupportedEncodingException, IOException{
		//String zhen = request.getParameter("zhen");
		List<Riverlevel> ls = rls.getriverstation();
		JSONArray jar = new JSONArray();
		for (Riverlevel r :ls){
			JSONObject json = new JSONObject();
			json.put("station", r.getStationname());
			jar.put(json);
		}
	
		OutputStream os = response.getOutputStream();
		os.write(jar.toString().getBytes("UTF-8"));
		os.flush();
	}
	@RequestMapping("/allflow.do")
	public @ResponseBody void allflow(HttpServletRequest request,HttpServletResponse response) throws JSONException, UnsupportedEncodingException, IOException{
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		List<Ssflows> ls = ssf.selectAllflow();
		JSONArray jar = new JSONArray();
		for (Ssflows r :ls){
			JSONObject json = new JSONObject();
			json.put("flow", r.getFlow());
			json.put("times", r.getTimes());
			jar.put(json);
		}
	
		OutputStream os = response.getOutputStream();
		os.write(jar.toString().getBytes("UTF-8"));
		os.flush();
	}
	@RequestMapping("/alllevel.do")
	public @ResponseBody void alllevel(HttpServletRequest request,HttpServletResponse response) throws JSONException, UnsupportedEncodingException, IOException{
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		List<Sslevels> ls = sls.selectAlllevel();
		JSONArray jar = new JSONArray();
		for (Sslevels r :ls){
			JSONObject json = new JSONObject();
			json.put("level", r.getLevel());
			json.put("times", r.getTimes());
			jar.put(json);
		}
	
		OutputStream os = response.getOutputStream();
		os.write(jar.toString().getBytes("UTF-8"));
		os.flush();
	}
}
